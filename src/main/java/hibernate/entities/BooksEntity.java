package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "books_list")
public class BooksEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "Year")
    private String year;

    @Column(name = "Category")
    private String category;

    public BooksEntity(String title, String author, String year, String category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
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
}

