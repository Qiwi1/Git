package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Bilet_History")
public class BiletHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bilet_history", nullable = false)
    private Long id;

    @Column(name = "status_record", nullable = false)
    private String statusrecord;

    @Column(name = "bilet_info", nullable = false)
    private String biletinfo;

    @Column(name = "characteristicz_info", nullable = false)
    private String characteristiczinfo;

    @Column(name = "date_create")
    private Date dateCreate;

    public BiletHistoryEntity() {
    }

    public BiletHistoryEntity(Long id, String statusrecord, String biletinfo, String characteristiczinfo, Date dateCreate) {
        this.id = id;
        this.statusrecord = statusrecord;
        this.biletinfo = biletinfo;
        this.characteristiczinfo = characteristiczinfo;
        this.dateCreate = dateCreate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusrecord() {
        return statusrecord;
    }

    public void setStatusrecord(String statusrecord) {
        this.statusrecord = statusrecord;
    }

    public String getBiletinfo() {
        return biletinfo;
    }

    public void setBiletinfo(String biletinfo) {
        this.biletinfo = biletinfo;
    }

    public String getCharacteristiczinfo() {
        return characteristiczinfo;
    }

    public void setCharacteristiczinfo(String characteristiczinfo) {
        this.characteristiczinfo = characteristiczinfo;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
