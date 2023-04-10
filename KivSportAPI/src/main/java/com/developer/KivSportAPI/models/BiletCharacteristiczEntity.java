package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "biletcharacteristicz")
public class BiletCharacteristiczEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biletcharacteristicz", nullable = false)
    private Long id;

    @Column(name = "bilet_id", nullable = false)
    private Long biletid;

    @Column(name = "characteristicz_id", nullable = false)
    private Long characteristiczid;

    public BiletCharacteristiczEntity() {
    }

    public BiletCharacteristiczEntity(Long id, Long biletid, Long characteristiczid) {
        this.id = id;
        this.biletid = biletid;
        this.characteristiczid = characteristiczid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBiletid() {
        return biletid;
    }

    public void setBiletid(Long biletid) {
            this.biletid = biletid;
    }

    public Long getCharacteristiczid() {
        return characteristiczid;
    }

    public void setCharacteristiczid(Long characteristiczid) {
        this.characteristiczid = characteristiczid;
    }
}
