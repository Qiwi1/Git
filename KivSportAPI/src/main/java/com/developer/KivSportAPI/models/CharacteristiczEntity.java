package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Characteristicz")
public class CharacteristiczEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_characteristicz", nullable = false)
    private Long id;

    @Column(name = "namecharacteristicz", nullable = false)
    private String namecharacteristicz;

    public CharacteristiczEntity() {
    }

    public CharacteristiczEntity(Long id, String namecharacteristicz) {
        this.id = id;
        this.namecharacteristicz = namecharacteristicz;
    }

    public String getNamecharacteristicz() {
        return namecharacteristicz;
    }

    public void setNamecharacteristicz(String namecharacteristicz) {
        this.namecharacteristicz = namecharacteristicz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
