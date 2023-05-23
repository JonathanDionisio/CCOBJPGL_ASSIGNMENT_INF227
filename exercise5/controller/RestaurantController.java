package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Inasal inasal = new Inasal();
    Mcdo mcdo = new Mcdo();
    Jolliebee jabi = new Jolliebee();
    Shakeys shakeys = new Shakeys();
    Maxs maxs = new Maxs();

    public void initialize() {

        inasal.setReviews("Sarap unli rice");
        inasal.setTagline("The more many-er");

        jabi.setReviews("Laki ng pwet ng jabi");
        jabi.setTagline("Langhap-Sarap Bida ang sarap");

        mcdo.setReviews("Sira Ice cream machine");
        mcdo.setTagline("I'm lovin it");

        shakeys.setReviews("May pizza ba dito");
        shakeys.setTagline("We serve fun at Shakey's... also pizza");

        maxs.setReviews("Sarap ng candy keme keme");
        maxs.setTagline("Sarap to the bones!");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("inasal's review is " + inasal.getReviews() + " and it's tagline is " + inasal.getTagline());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Mcdo's review is " + mcdo.getReviews() + " and it's tagline is " + mcdo.getTagline());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Joliebee's review is " + jabi.getReviews() + " and it's tagline is " + jabi.getTagline());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("max's review is " + maxs.getReviews() + " and it's tagline is " + maxs.getTagline());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Shakey's review is " + shakeys.getReviews() + " and it's tagline is " + shakeys.getTagline());
        }

        alert.showAndWait();

    }
}