package com.example.controle.dao;

import com.example.controle.models.Membre;

import java.util.List;

public interface MembreDao {
    /**
     * Insérer un membre dans le système.
     *
     * @param membre le membre à insérer
     */
    void inserer(Membre membre);

    /**
     * Charger la liste des incidents associés à tous les membres.
     *
     * @return une liste de tous les membres avec leurs incidents
     */
    List<Membre> chargerListIncidents();
}
