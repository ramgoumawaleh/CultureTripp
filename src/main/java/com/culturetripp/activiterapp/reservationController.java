package com.culturetripp.activiterapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class reservationController implements Initializable {

    @FXML
    private Button btnSAVE;

    @FXML
    private TextField tFname;

    @FXML
    private TextField tLNAME;

    @FXML
    private TextField tNPEOPLE;

    @FXML
    private TextField temail;

    @FXML
    void createreservation(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}