package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Bilet_Check")
public class BiletCheckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bilet_check", nullable = false)
    private Long id;

    @Column(name = "check_number", nullable = false, length = 20)
    private String checknumber;

    @Column(name = "shift_number", nullable = false, length = 20)
    private String shiftnumber;

    @Column(name = "purchase_date", nullable = false)
    private Date purchasedate;

    @Column(name = "total_sum", nullable = false, precision = 38, scale = 2)
    private BigDecimal totalsum;

    @Column(name = "input_sum", nullable = false, precision = 38, scale = 2)
    private BigDecimal inputsum;

    @Column(name = "stadion_id", nullable = false)
    private Long stadionid;

    @Column(name = "profile_card_id", nullable = false)
    private Long profilecardid;

    @Column(name = "profile_id", nullable = false)
    private Long profileid;


    public BiletCheckEntity() {
    }

    public BiletCheckEntity(Long id, String checknumber, String shiftnumber, Date purchasedate, BigDecimal totalsum, BigDecimal inputsum, Long stadionid, Long profilecardid, Long profileid) {
        this.id = id;
        this.checknumber = checknumber;
        this.shiftnumber = shiftnumber;
        this.purchasedate = purchasedate;
        this.totalsum = totalsum;
        this.inputsum = inputsum;
        this.stadionid = stadionid;
        this.profilecardid = profilecardid;
        this.profileid = profileid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    public String getShiftnumber() {
        return shiftnumber;
    }

    public void setShiftnumber(String shiftnumber) {
        this.shiftnumber = shiftnumber;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public BigDecimal getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(BigDecimal totalsum) {
        this.totalsum = totalsum;
    }

    public BigDecimal getInputsum() {
        return inputsum;
    }

    public void setInputsum(BigDecimal inputsum) {
        this.inputsum = inputsum;
    }

    public Long getStadionid() {
        return stadionid;
    }

    public void setStadionid(Long stadionid) {
        this.stadionid = stadionid;
    }

    public Long getProfilecardid() {
        return profilecardid;
    }

    public void setProfilecardid(Long profilecardid) {
        this.profilecardid = profilecardid;
    }

    public Long getProfileid() {
        return profileid;
    }

    public void setProfileid(Long profileid) {
        this.profileid = profileid;
    }
}
