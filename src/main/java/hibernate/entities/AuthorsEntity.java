package hibernate.entities;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authors_list")

public class AuthorsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Author_name_surname")
    private String authorNameSurname;

    @Column(name = "Country")
    private String country;

    public AuthorsEntity(String authorNameSurname, String country) {
        this.authorNameSurname = authorNameSurname;
        this.country = country;
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
}
