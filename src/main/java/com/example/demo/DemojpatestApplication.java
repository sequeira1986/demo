package com.example.demo;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.repository.AuthorRepository;

import java.util.List;

@SpringBootApplication
public class DemojpatestApplication {

	public static void main(String[] args) {SpringApplication.run(DemojpatestApplication.class, args);}

	@Bean
	public CommandLineRunner demo(AuthorRepository repository){
		return (args) -> {
			System.out.println("****Demojava****");
			List<Author>authors = repository.findAll();

			for (Author author: authors) {
				System.out.println("  AUTHOR:  " + author.getName() + " "+ author.getSurname());

				for (Book book : author.getBooks())
				System.out.println("  BOOK :  " + book.getName());
				System.out.println();

			}
			Author author1 = new Author();
			author1.setName("Ernesto");
			author1.setSurname("Cardenal");
			repository.save(author1);

		};
	}



}