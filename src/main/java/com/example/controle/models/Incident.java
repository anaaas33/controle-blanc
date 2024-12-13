package com.example.controle.models;

import java.time.LocalDateTime;

public class Incident {
    private String reference;
    private LocalDateTime time;
    private String status;
    private Membre membre; // Association avec Membre

    public Incident(String reference, LocalDateTime time, String status) {
        this.reference = reference;
        this.time = time;
        this.status = status;
    }

    // Getters et Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }
}
