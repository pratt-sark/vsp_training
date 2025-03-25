package com.bookstore.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private double price;

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)  // Foreign key linking to Publisher
    @JsonIgnoreProperties("books") // Prevents recursion issues
    private Publisher publisher;

    // Default Constructor
    public Book() {}

    // Parameterized Constructor
    public Book(String title, String genre, double price, Publisher publisher) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publisher = publisher;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }
}
