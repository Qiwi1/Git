package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Bank")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Bank", nullable = false)
    private Long id;


    @Column(name = "bankname", nullable = false, length = 100)
    private String bankname;

    public BankEntity() {

    }

    public BankEntity(Long id, String bankname) {
        this.id = id;
        this.bankname = bankname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}
