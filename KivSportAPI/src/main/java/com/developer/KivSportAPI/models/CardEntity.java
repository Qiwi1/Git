package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Card")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card", nullable = false)
    private Long id;

    @Column(name = "card_number", nullable = false, length = 30)
    private String cardnumber;

    @Column(name = "card_holder", nullable = false, length = 30)
    private String cardholder;

    @Column(name = "card_expiry_date", nullable = false)
    private Date cardexpirydate;

    @Column(name = "cvc_ccv", nullable = false, length = 3)
    private String cvcccv;

    @Column(name = "typecard_id", nullable = false)
    private Long typecardid;

    @Column(name = "payment_system_id", nullable = false)
    private Long paymentsystemid;

    @Column(name = "bank_id", nullable = false)
    private Long bankid;

    public CardEntity() {
    }

    public CardEntity(Long id, String cardnumber, String cardholder, Date cardexpirydate, String cvcccv, Long typecardid, Long paymentsystemid, Long bankid) {
        this.id = id;
        this.cardnumber = cardnumber;
        this.cardholder = cardholder;
        this.cardexpirydate = cardexpirydate;
        this.cvcccv = cvcccv;
        this.typecardid = typecardid;
        this.paymentsystemid = paymentsystemid;
        this.bankid = bankid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public Date getCardexpirydate() {
        return cardexpirydate;
    }

    public void setCardexpirydate(Date cardexpirydate) {
        this.cardexpirydate = cardexpirydate;
    }

    public String getCvcccv() {
        return cvcccv;
    }

    public void setCvcccv(String cvcccv) {
        this.cvcccv = cvcccv;
    }

    public Long getTypecardid() {
        return typecardid;
    }

    public void setTypecardid(Long typecardid) {
        this.typecardid = typecardid;
    }

    public Long getPaymentsystemid() {
        return paymentsystemid;
    }

    public void setPaymentsystemid(Long paymentsystemid) {
        this.paymentsystemid = paymentsystemid;
    }

    public Long getBankid() {
        return bankid;
    }

    public void setBankid(Long bankid) {
        this.bankid = bankid;
    }
}
