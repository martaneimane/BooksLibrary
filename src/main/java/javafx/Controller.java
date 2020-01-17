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
import javafx.scene.control.TableColumn.CellEditEvent;


public class Controller {


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
    private Button authorButtonAdd;
    @FXML
    private Button authorButtonUpdate;
    @FXML
    private Button authorButtonDelete;



    @FXML
    private void initialize() {
        BooksService booksService = new BooksService();
        bookTable.setEditable(true);
        ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(booksService.getAllBooks());
        idBooks.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));

//        title.setOnEditCommit(
//                (CellEditEvent<BooksEntity, String> t) -> {
//                    t.getTableView().getItems().get(
//                            t.getTablePosition().getRow()).setTitle(t.getNewValue());
//                });

        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        bookTable.setItems(booksEntityObservableList);

        final TextField addTitle = new TextField();
        addTitle.setPromptText("Book Title");
        addTitle.setMaxWidth(title.getPrefWidth());

        final TextField addAuthor = new TextField();
        addAuthor.setMaxWidth(author.getPrefWidth());
        addAuthor.setPromptText("Author Name");

        final TextField addYear = new TextField();
        addYear.setMaxWidth(year.getPrefWidth());
        addYear.setPromptText("Year");


        bookButtonAdd.setOnAction((ActionEvent e) -> {
            try {
                booksEntityObservableList.add(BooksEntity.class.newInstance());
                addTitle.getText();
                addAuthor.getText();
                addYear.getText();
                addTitle.clear();
                addAuthor.clear();
                addYear.clear();
            } catch (InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        });

        AuthorsService authorsService = new AuthorsService();
        ObservableList<AuthorsEntity> authorsEntityObservableList = FXCollections.observableList(authorsService.getAllAuthors());
        idAuthors.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("authorNameSurname"));
        country.setCellValueFactory(new PropertyValueFactory<>("country"));

        authorsTable.setItems(authorsEntityObservableList);


        System.out.println("test");
    }


    @FXML
    private void onBooksButtonClick() {

        BooksService booksService = new BooksService();

        ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(booksService.getAllBooks());
        bookTable.setItems(booksEntityObservableList);

        System.out.println("test");
    }

}

