package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Column(name = "id_author")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "name")
    protected String name;


    @Column(name = "surname")
    protected String surname;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    protected Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
