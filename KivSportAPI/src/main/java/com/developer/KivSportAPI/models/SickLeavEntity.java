package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "sickleav")
public class SickLeavEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sickleav", nullable = false)
    private Long id;

    @Column(name = "startdate", nullable = false)
    private Date startdate;

    @Column(name = "enddate", nullable = false)
    private Date enddate;


    @Column(name = "employee_id", nullable = false)
    private Long employeeid;

    @Column(name = "hrmanager_id", nullable = false)
    private Long hrmanagerid;

    @Column(name = "sicktype_id", nullable = false)
    private Long sicktypeid;

    public SickLeavEntity() {
    }

    public SickLeavEntity(Long id, Date startdate, Date enddate, Long employeeid, Long hrmanagerid, Long sicktypeid) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.employeeid = employeeid;
        this.hrmanagerid = hrmanagerid;
        this.sicktypeid = sicktypeid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public Long getHrmanagerid() {
        return hrmanagerid;
    }

    public void setHrmanagerid(Long hrmanagerid) {
        this.hrmanagerid = hrmanagerid;
    }

    public Long getSicktypeid() {
        return sicktypeid;
    }

    public void setSicktypeid(Long sicktypeid) {
        this.sicktypeid = sicktypeid;
    }
}
