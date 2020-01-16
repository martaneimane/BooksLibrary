package javafx;

import hibernate.entities.BooksEntity;
import hibernate.services.BooksService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private Button bookButton;
    @FXML
    private TableView bookTable;


    @FXML
    private void initialize() {
    }

    @FXML
    private void onBooksButtonClick(){

        ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(BooksService.getAllBooks());
        bookTable.setItems(booksEntityObservableList);
        System.out.println("test");
    }

}
