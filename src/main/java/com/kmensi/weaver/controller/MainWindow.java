package com.kmensi.weaver.controller;

import com.kmensi.weaver.repository.BookRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import lombok.extern.slf4j.Slf4j;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.kmensi.weaver.domain.Book;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;

@Component
@FxmlView
@Slf4j
public class MainWindow {

    @Autowired
    BookRepository repository;

    private final FxControllerAndView<SomeDialog, VBox> someDialog;

    @FXML
    public Button openDialogButton;

    public MainWindow(FxControllerAndView<SomeDialog, VBox> someDialog) {
        this.someDialog = someDialog;
    }

    @FXML
    public void initialize() {
        
        openDialogButton.setOnAction(
                actionEvent -> someDialog.getController().show()
        );
        
//        repository.findAll().forEach((Book book) -> {
//            log.info("book: " + book.getTitle());
//        });

//        ObservableList<String> titles = FXCollections.observableArrayList(repository.findAll().stream().map(book -> book.getTitle()).collect(Collectors.toList()));
//        ListView<String> listView = new ListView<>(titles);
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(listView);
    }

}
