package library;

import java.time.LocalDate;

public class Book {

    private String title;
    private Author author;

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    private LocalDate releaseDate;
    private String category;
    private Float rating;



    public Book(String title, Author author, LocalDate releaseDate, String category, Float price) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.category = category;
        this.rating = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("{ name: %s,author: %s}", title, author.toString());
    }

}
