package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Bilet")
public class BiletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bilet", nullable = false)
    private Long id;

    @Column(name = "biletname", nullable = false, length = 30)
    private String biletname;

    @Column(name = "biletprice", nullable = false, precision = 38, scale = 2)
    private BigDecimal biletprice;

    @Column(name = "bilettype_id", nullable = false)
    private Long bilettypeid;

    public BiletEntity(Long bilettypeid) {
        this.bilettypeid = bilettypeid;
    }

    public BiletEntity() {

    }

    public Long getBilettypeid() {
        return bilettypeid;
    }

    public void setBilettypeid(Long bilettypeid) {
        this.bilettypeid = bilettypeid;
    }

    public BiletEntity(Long id, String biletname, BigDecimal biletprice, Long bilettypeid) {
        this.id = id;
        this.biletname = biletname;
        this.biletprice = biletprice;
        this.bilettypeid = bilettypeid;
    }

    public BigDecimal getBiletprice() {
        return biletprice;
    }

    public void setBiletprice(BigDecimal biletprice) {
        this.biletprice = biletprice;
    }

    public String getBiletname() {
        return biletname;
    }

    public void setBiletname(String biletname) {
        this.biletname = biletname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
