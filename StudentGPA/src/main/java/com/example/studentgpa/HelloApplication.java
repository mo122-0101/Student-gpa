package com.example.studentgpa;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        @FXML
        private Button btncal;

        @FXML
        private Button btnclear;

        @FXML
        private TextField txtc1;

        @FXML
        private TextField txtc2;

        @FXML
        private TextField txtc3;

        @FXML
        private TextField txtc4;

        @FXML
        private TextField txtc5;

        @FXML
        private TextField txtc6;

        @FXML
        private TextField txth;

        @FXML
        private TextField txttot;

        @FXML
        void cal(ActionEvent event) {

        }

        @FXML
        void clear(ActionEvent event) {

        }

    }

    public static void main(String[] args) {
        launch();
    }
}