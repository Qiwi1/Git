package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Provider")
public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider", nullable = false)
    private Long id;

    @Column(name = "nameprovider", nullable = false)
    private String nameprovider;

    public ProviderEntity() {
    }

    public ProviderEntity(Long id, String nameprovider) {
        this.id = id;
        this.nameprovider = nameprovider;
    }

    public String getNameprovider() {
        return nameprovider;
    }

    public void setNameprovider(String nameprovider) {
        this.nameprovider = nameprovider;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
