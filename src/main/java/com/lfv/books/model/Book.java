package com.lfv.books.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "books_java")
public class Book {
    @Id
    public Long id;
    public String title;
    public String author;
    public String description;
    public String image;
    public String backImage;
    public String link;
    public double price;
    public int pages;
    public String category;

    public Book(){}

    public Book(Long id, String title, String author, String description, String image, String backImage, String link, double price, int pages, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.image = image;
        this.backImage = backImage;
        this.link = link;
        this.price = price;
        this.pages = pages;
        this.category = category;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getBackImage() {
        return backImage;
    }
    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
