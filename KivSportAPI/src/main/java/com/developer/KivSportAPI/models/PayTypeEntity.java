package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paytype")
public class PayTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paytype", nullable = false)
    private Long id;

    @Column(name = "typename", nullable = false, length = 100)
    private String typename;

    public PayTypeEntity() {
    }

    public PayTypeEntity(Long id, String typename) {
        this.id = id;
        this.typename = typename;
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
}
