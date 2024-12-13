package com.example.controle;

import com.example.controle.dao.impl.MembreDaoImpl;
import com.example.controle.models.Membre;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.UUID;

public class MainApp extends Application {
    private final MembreDaoImpl membreDao = new MembreDaoImpl();

    @Override
    public void start(Stage primaryStage) {
        // Champs de saisie
        TextField nomField = new TextField();
        nomField.setPromptText("Nom");

        TextField prenomField = new TextField();
        prenomField.setPromptText("Prénom");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField phoneField = new TextField();
        phoneField.setPromptText("Phone");

        // Bouton pour insérer
        Button insererButton = new Button("Insérer");
        insererButton.setOnAction(e -> {
            String identifiant = UUID.randomUUID().toString(); // Identifiant généré aléatoirement
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            Membre membre = new Membre(identifiant, nom, prenom, email, phone);
            membreDao.inserer(membre);

            // Clear des champs
            nomField.clear();
            prenomField.clear();
            emailField.clear();
            phoneField.clear();

            System.out.println("Membre ajouté : " + membre.getNom());
        });

        // Layout
        VBox layout = new VBox(10, nomField, prenomField, emailField, phoneField, insererButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-spacing: 10;");

        // Scene
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Ajouter un membre");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
