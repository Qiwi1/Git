package com.developer.KivSportAPI.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "vacation")
public class VacationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacation", nullable = false)
    private Long id;

    @Column(name = "startvacationdate", nullable = false)
    private Date startvacationdate;

    @Column(name = "endvacationdate", nullable = false)
    private Date endvacationdate;

    @Column(name = "employee_id", nullable = false)
    private Long employeeid;

    @Column(name = "hrmanager_id", nullable = false)
    private Long hrmanagerid;

    @Column(name = "vacationtype_id", nullable = false)
    private Long vacationtypeid;


    public VacationEntity() {
    }

    public VacationEntity(Long id, Date startvacationdate, Date endvacationdate, Long employeeid, Long hrmanagerid, Long vacationtypeid) {
        this.id = id;
        this.startvacationdate = startvacationdate;
        this.endvacationdate = endvacationdate;
        this.employeeid = employeeid;
        this.hrmanagerid = hrmanagerid;
        this.vacationtypeid = vacationtypeid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartvacationdate() {
        return startvacationdate;
    }

    public void setStartvacationdate(Date startvacationdate) {
        this.startvacationdate = startvacationdate;
    }

    public Date getEndvacationdate() {
        return endvacationdate;
    }

    public void setEndvacationdate(Date endvacationdate) {
        this.endvacationdate = endvacationdate;
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

    public Long getVacationtypeid() {
        return vacationtypeid;
    }

    public void setVacationtypeid(Long vacationtypeid) {
        this.vacationtypeid = vacationtypeid;
    }
}
