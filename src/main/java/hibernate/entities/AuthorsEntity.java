package hibernate.entities;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authors_list")

public class AuthorsEntity {

    @Id
    @Column(name = "id_authors_list")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Author_name_surname")
    private String authorNameSurname;

    @Column(name = "Country")
    private String country;

    public AuthorsEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getAuthorNameSurname() {
        return authorNameSurname;
    }

    public void setAuthorNameSurname(String authorNameSurname) {
        this.authorNameSurname = authorNameSurname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author: " +
                " Id: " + id +
                " Name Surname: " + authorNameSurname + '\'' +
                " Country: " + country;
    }
}
