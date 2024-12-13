package com.example.controle;

import com.example.controle.models.Membre;
import com.example.controle.utils.CsvImporter;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String cheminFichier = "/Users/macm2/controle/src/main/java/com/example/controle/membres.csv"; // Chemin absolu ou relatif du fichier CSV
        Set<Membre> membres = CsvImporter.chargerListeMembre(cheminFichier);

        for (Membre membre : membres) {
            System.out.println("Membre ajouté depuis CSV : " + membre.getNom() + " " + membre.getPrenom());
        }
    }
}
