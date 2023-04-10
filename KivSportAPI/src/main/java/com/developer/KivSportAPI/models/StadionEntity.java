package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Stadion")
public class StadionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stadion", nullable = false)
    private Long id;

    @Column(name = "stadionname", nullable = false, length = 100)
    private String stadionname;

    @Column(name = "stadionaddress", nullable = false, length = 100)
    private String stadionaddress;

    public StadionEntity() {
    }

    public StadionEntity(Long id, String stadionname, String stadionaddress) {
        this.id = id;
        this.stadionname = stadionname;
        this.stadionaddress = stadionaddress;
    }

    public String getStadionaddress() {
        return stadionaddress;
    }

    public void setStadionaddress(String stadionaddress) {
        this.stadionaddress = stadionaddress;
    }

    public String getStadioname() {
        return stadionname;
    }

    public void setStadionname(String stadionname) {
        this.stadionname = stadionname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
