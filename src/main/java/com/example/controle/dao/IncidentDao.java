package com.example.controle.dao;

import com.example.controle.models.Incident;

import java.util.Set;

public interface IncidentDao {
    /**
     * Insérer un incident unique dans le système.
     *
     * @param incident l'incident à insérer
     */
    void inserer(Incident incident);

    /**
     * Insérer un ensemble d'incidents dans le système.
     *
     * @param incidents l'ensemble des incidents à insérer
     */
    void inserer(Set<Incident> incidents);
}
