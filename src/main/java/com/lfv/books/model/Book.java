package com.lfv.books.model;
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    public int id;
    public String title;
    public String author;
    public String description;
    public String image;
    public String backImage;
    public String link;


    public int getId() {
        return id;
    }
    public void setId(int id) {
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
}
