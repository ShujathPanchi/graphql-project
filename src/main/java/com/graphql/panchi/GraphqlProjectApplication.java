package com.graphql.panchi;

import com.graphql.panchi.entities.Book;
import com.graphql.panchi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication  implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Noor cook book");
		b1.setDesc("Noor first cook book");
		b1.setPages(2000);
		b1.setPrice(50000);
		b1.setAuthor("Noor");

		Book b2 = new Book();
		b2.setTitle("Sujath Love Book");
		b2.setDesc("Love book to get romantic tips");
		b2.setPages(3000);
		b2.setPrice(9000);
		b2.setAuthor("Sujath");


		Book b3 = new Book();
		b3.setTitle("Bob the cat");
		b3.setDesc("Bob a kind cat move to adventurous journey");
		b3.setPages(1000);
		b3.setPrice(2000);
		b3.setAuthor("Panchi");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
