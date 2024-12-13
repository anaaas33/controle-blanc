package com.example.controle.utils;

import com.example.controle.models.Membre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class CsvImporter {

    public static Set<Membre> chargerListeMembre(String nomFichier) {
        Set<Membre> membres = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;

            while ((ligne = br.readLine()) != null) {
                // Découper la ligne en colonnes
                String[] colonnes = ligne.split(",");
                if (colonnes.length == 4) {
                    String identifiant = UUID.randomUUID().toString(); // Identifiant aléatoire
                    String nom = colonnes[0].trim();
                    String prenom = colonnes[1].trim();
                    String email = colonnes[2].trim();
                    String phone = colonnes[3].trim();

                    Membre membre = new Membre(identifiant, nom, prenom, email, phone);
                    membres.add(membre); // HashSet élimine les doublons automatiquement
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier CSV : " + e.getMessage());
        }

        return membres;
    }
}
