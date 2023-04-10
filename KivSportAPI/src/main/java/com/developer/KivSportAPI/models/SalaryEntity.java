package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Salary")
public class SalaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salary", nullable = false)
    private Long id;

    @Column(name = "paydate", nullable = false)
    private Date paydate;

    @Column(name = "paysum", nullable = false, precision = 38, scale = 2)
    private BigDecimal paysum;

    @Column(name = "employee_id", nullable = false)
    private Long employeeid;

    @Column(name = "bookkeeper_id", nullable = false)
    private Long bookkeeperid;

    @Column(name = "paytype_id", nullable = false)
    private Long paytypeid;

    public SalaryEntity() {
    }

    public SalaryEntity(Long id, Date paydate, BigDecimal paysum, Long employeeid, Long bookkeeperid, Long paytypeid) {
        this.id = id;
        this.paydate = paydate;
        this.paysum = paysum;
        this.employeeid = employeeid;
        this.bookkeeperid = bookkeeperid;
        this.paytypeid = paytypeid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public BigDecimal getPaysum() {
        return paysum;
    }

    public void setPaysum(BigDecimal paysum) {
        this.paysum = paysum;
    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public Long getBookkeeperid() {
        return bookkeeperid;
    }

    public void setBookkeeperid(Long bookkeeperid) {
        this.bookkeeperid = bookkeeperid;
    }

    public Long getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(Long paytypeid) {
        this.paytypeid = paytypeid;
    }
}
