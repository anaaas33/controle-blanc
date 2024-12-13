package com.example.controle.dao.impl;

import com.example.controle.dao.MembreDao;
import com.example.controle.models.Membre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembreDaoImpl implements MembreDao {
    private final Map<String, Membre> membres; // Stockage en mémoire (HashMap avec l'identifiant comme clé)

    public MembreDaoImpl() {
        this.membres = new HashMap<>();
    }

    @Override
    public void inserer(Membre membre) {
        if (membre != null && !membres.containsKey(membre.getIdentifiant())) {
            membres.put(membre.getIdentifiant(), membre);
            System.out.println("Membre ajouté : " + membre.getNom());
        } else {
            System.out.println("Membre déjà existant ou invalide.");
        }
    }

    @Override
    public List<Membre> chargerListIncidents() {
        return new ArrayList<>(membres.values());
    }
}
