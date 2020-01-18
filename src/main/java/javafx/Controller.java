package javafx;

import hibernate.entities.AuthorsEntity;
import hibernate.entities.BooksEntity;
import hibernate.services.AuthorsService;
import hibernate.services.BooksService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;


public class Controller {
    @FXML
    private TabPane tabPane;
    @FXML
    private AnchorPane anchorPaneBooks;
    @FXML
    private TableView<BooksEntity> bookTable;
    @FXML
    private Tab booksTab;
    @FXML
    private TableColumn<BooksEntity, Integer> idBooks;
    @FXML
    private TableColumn<BooksEntity, String> title;
    @FXML
    private TableColumn<BooksEntity, String> author;
    @FXML
    private TableColumn<BooksEntity, String> year;
    @FXML
    private TableColumn<BooksEntity, String> category;
    @FXML
    private Button bookButtonAdd;
    @FXML
    private Button bookButtonUpdate;
    @FXML
    private Button bookButtonDelete;
    @FXML
    private Tab authorsTab;
    @FXML
    private TableView<AuthorsEntity> authorsTable;
    @FXML
    private TableColumn<BooksEntity, Integer> idAuthors;
    @FXML
    private TableColumn<BooksEntity, String> name;
    @FXML
    private TableColumn<BooksEntity, String> country;
    @FXML
    private TextField addTitle;
    @FXML
    private Button authorButtonAdd;
    @FXML
    private Button authorButtonUpdate;
    @FXML
    private Button authorButtonDelete;
    @FXML
    private TextField addYear;
    @FXML
    private TextField addCategory;
    @FXML
    private TextField addAuthor;
    @FXML
    private TextField addName;
    @FXML
    private TextField addCountry;


    @FXML
    private void initialize() throws IOException {
        BooksService booksService = new BooksService();
        AuthorsService authorsService = new AuthorsService();

        ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(booksService.getAllBooks());
        idBooks.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        bookTable.setItems(booksEntityObservableList);

        addTitle.setPromptText("Book Title");
        addTitle.setMaxWidth(title.getPrefWidth());

        addAuthor.setMaxWidth(author.getPrefWidth());
        addAuthor.setPromptText("Author Name");

        addYear.setMaxWidth(year.getPrefWidth());
        addYear.setPromptText("Year");

        addCategory.setMaxWidth(category.getPrefWidth());
        addCategory.setPromptText("Category");

        BooksEntity booksEntity = new BooksEntity();
        bookButtonAdd.setOnAction((ActionEvent e) -> {
            booksEntityObservableList.add(booksEntity);
            booksEntity.setTitle(addTitle.getText());
            booksEntity.setAuthor(addAuthor.getText());
            booksEntity.setYear(addYear.getText());
            booksEntity.setCategory(addCategory.getText());
            booksService.createBook(booksEntity);
            addTitle.clear();
            addAuthor.clear();
            addYear.clear();
            addCategory.clear();
        });

        ObservableList<AuthorsEntity> authorsEntityObservableList = FXCollections.observableList(authorsService.getAllAuthors());
        idAuthors.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("authorNameSurname"));
        country.setCellValueFactory(new PropertyValueFactory<>("country"));
        authorsTable.setItems(authorsEntityObservableList);

        addName.setPromptText("Author Name");
        addName.setMaxWidth(title.getPrefWidth());

        addCountry.setMaxWidth(author.getPrefWidth());
        addCountry.setPromptText("Country");

        AuthorsEntity authorsEntity = new AuthorsEntity();
        authorButtonAdd.setOnAction(event -> {
            authorsEntityObservableList.add(authorsEntity);
            authorsEntity.setAuthorNameSurname(addName.getText());
            authorsEntity.setCountry(addCountry.getText());
            authorsService.createAuthor(authorsEntity);
            addName.clear();
            addCountry.clear();
        });


    }


    @FXML
    private void onBooksButtonClick() {

        BooksService booksService = new BooksService();

        ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(booksService.getAllBooks());
        bookTable.setItems(booksEntityObservableList);

        System.out.println("test");
    }

}

