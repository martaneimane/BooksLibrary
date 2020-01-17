package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "books_list")
public class BooksEntity implements Serializable {


    @Id
    @Column(name = "id_books_list")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Author")
    private String author;


    @Column(name = "Year")
    private String year;

    @Column(name = "Category")
    private String category;

    public BooksEntity() {

    }



    public Integer getId() {
        return id;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book: " +
                " Id: " + id +
                " Title: " + title + '\'' +
                " Author: " + author + '\'' +
                " Year: " + year + '\'' +
                " Category: " + category;
    }
}

