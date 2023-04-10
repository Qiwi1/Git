package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentsystem")
public class PaymentSystemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paymentsystem", nullable = false)
    private Long id;

    @Column(name = "namesystem", nullable = false, length = 100)
    private String namesystem;

    public PaymentSystemEntity() {
    }

    public PaymentSystemEntity(Long id, String namesystem) {
        this.id = id;
        this.namesystem = namesystem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamesystem() {
        return namesystem;
    }

    public void setNamesystem(String namesystem) {
        this.namesystem = namesystem;
    }
}
