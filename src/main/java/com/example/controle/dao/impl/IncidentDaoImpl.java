package com.example.controle.dao.impl;

import com.example.controle.dao.IncidentDao;
import com.example.controle.models.Incident;

import java.util.HashSet;
import java.util.Set;

public class IncidentDaoImpl implements IncidentDao {
    private final Set<Incident> incidents; // Stockage en mémoire (HashSet pour éviter les doublons)

    public IncidentDaoImpl() {
        this.incidents = new HashSet<>();
    }

    @Override
    public void inserer(Incident incident) {
        if (incident != null) {
            incidents.add(incident);
            System.out.println("Incident ajouté : " + incident.getReference());
        } else {
            System.out.println("Incident invalide.");
        }
    }

    @Override
    public void inserer(Set<Incident> newIncidents) {
        if (newIncidents != null && !newIncidents.isEmpty()) {
            incidents.addAll(newIncidents);
            System.out.println(newIncidents.size() + " incidents ajoutés.");
        } else {
            System.out.println("Aucun incident à ajouter.");
        }
    }
}
