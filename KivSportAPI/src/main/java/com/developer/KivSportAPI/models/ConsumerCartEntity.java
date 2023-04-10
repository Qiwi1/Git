package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Consumer_Cart")
public class ConsumerCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consumer_cart", nullable = false)
    private Long id;

    @Column(name = "quantity_of_bilet", nullable = false)
    private Integer quantityOfBilet;

    @Column(name = "bilet_id", nullable = false)
    private Long biletid;

    @Column(name = "bilet_check_id", nullable = false)
    private Long biletcheckid;

    public ConsumerCartEntity() {
    }

    public ConsumerCartEntity(Long id, Integer quantityOfBilet, Long biletid, Long biletcheckid) {
        this.id = id;
        this.quantityOfBilet = quantityOfBilet;
        this.biletid = biletid;
        this.biletcheckid = biletcheckid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantityOfBilet() {
        return quantityOfBilet;
    }

    public void setQuantityOfBilet(Integer quantityOfBilet) {
        this.quantityOfBilet = quantityOfBilet;
    }

    public Long getBiletid() {
        return biletid;
    }

    public void setBiletid(Long biletid) {
        this.biletid = biletid;
    }

    public Long getBiletcheckid() {
        return biletcheckid;
    }

    public void setBiletcheckid(Long biletcheckid) {
        this.biletcheckid = biletcheckid;
    }
}
