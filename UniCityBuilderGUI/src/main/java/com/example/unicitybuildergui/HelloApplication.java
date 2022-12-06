package com.example.unicitybuildergui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static GameMangaer gm;
    @Override
    //Starts our stage
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("newStyle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 515);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    //our main method
    public static void main(String[] args) {
        GameMangaer gameMangaer = new GameMangaer();
        gm = gameMangaer;
        gm.moneyManager.setCurrentMoney(1000);
        launch();
    }
}
