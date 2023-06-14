package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id_book")
    protected  Long id;

    @Column(name = "name")
    protected  String name;

    @Column(name = "count")
    protected  Long count;


    @ManyToOne
    @JoinColumn(name = "id_author")
    protected  Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
