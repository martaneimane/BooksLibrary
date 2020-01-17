package javafx;

import hibernate.entities.BooksEntity;
import hibernate.services.BooksService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller {


            @FXML
            private TableView<BooksEntity> bookTable;
            @FXML
            private TableColumn idBooks;
            @FXML
            private TableColumn title;
            @FXML
            private TableColumn author;
            @FXML
            private TableColumn year;
            @FXML
            private TableColumn category;




            @FXML
            private void initialize() {

                BooksService booksService = new BooksService();

                ObservableList<BooksEntity> booksEntityObservableList = FXCollections.observableList(booksService.getAllBooks());
                idBooks.setCellValueFactory(new PropertyValueFactory<BooksEntity, Integer>("idBooks"));
                title.setCellValueFactory(new PropertyValueFactory<BooksEntity, String>("title"));
                author.setCellValueFactory(new PropertyValueFactory<BooksEntity, String>("author"));
                year.setCellValueFactory(new PropertyValueFactory<BooksEntity, String>("year"));
                category.setCellValueFactory(new PropertyValueFactory<BooksEntity, String>("category"));
                bookTable.setItems(booksEntityObservableList);

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
