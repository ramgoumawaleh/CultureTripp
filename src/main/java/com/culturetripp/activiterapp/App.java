package com.culturetripp.activiterapp;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import tools.DBconnexion;

import java.io.IOException;

public class App extends Application {
    double x,y = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/Fmxl/reservation.fxml"));
            primaryStage.setTitle("Gestion de reservation");
            primaryStage.setScene(new Scene(root, 993, 616));
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            showErrorDialog("Failed to load the FXML file", "Could not load the user interface. Please check the console for more information.");
        }
    }


    private void showErrorDialog(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        // Ici, nous créons une instance de DBconnexion pour tester la connexion à la base de données
        DBconnexion mc = DBconnexion.getInstance();

        // Lancement de l'application JavaFX
        launch(args);
    }
}