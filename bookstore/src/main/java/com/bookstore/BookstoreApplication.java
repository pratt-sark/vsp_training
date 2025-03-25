package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Starting Bookstore Application...");
		SpringApplication.run(BookstoreApplication.class, args);
		System.out.println("Bookstore is up and running on http://localhost:8080");
		System.out.println("H2 Console available at: http://localhost:8080/h2-console");
	}

	@Override
	public void run(String... args) {
		System.out.println("Available Endpoints:");
		System.out.println("   ➜ [GET]  http://localhost:8080/books/all                 - Get all books");
		System.out.println("   ➜ [POST] http://localhost:8080/books                    - Add a new book");
		System.out.println("   ➜ [GET]  http://localhost:8080/books/{id}               - Get book by ID");
		System.out.println("   ➜ [GET]  http://localhost:8080/books/publisher/{id}     - Get books by publisher");
		System.out.println("   ➜ [PUT]  http://localhost:8080/books/{id}               - Update book details");
		System.out.println("   ➜ [DELETE] http://localhost:8080/books/{id}             - Delete a book");
		System.out.println("   ➜ [POST] http://localhost:8080/publishers               - Add a publisher");
		System.out.println("   ➜ [GET]  http://localhost:8080/publishers               - Get all publishers");
		System.out.println("   ➜ [GET]  http://localhost:8080/publishers/{id}          - Get publisher by ID");
		System.out.println("   ➜ [PUT]  http://localhost:8080/publishers/{id}          - Update publisher details");
		System.out.println("   ➜ [DELETE] http://localhost:8080/publishers/{id}        - Delete a publisher");
	}
}
