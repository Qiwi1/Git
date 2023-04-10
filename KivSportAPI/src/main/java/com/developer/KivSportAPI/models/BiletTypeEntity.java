package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Bilet_Type")
public class BiletTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bilettype", nullable = false)
    private Long id;

    @Column(name = "typename", nullable = false, length = 100)
    private String typename;

    public BiletTypeEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public BiletTypeEntity(Long id, String typename) {
        this.id = id;
        this.typename = typename;
    }
}
