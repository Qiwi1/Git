package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "sicktype")
public class SickTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sicktype", nullable = false)
    private Long id;

    @Column(name = "typename", nullable = false, length = 100)
    private String typename;

    public SickTypeEntity() {
    }

    public SickTypeEntity(Long id, String typename) {
        this.id = id;
        this.typename = typename;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
