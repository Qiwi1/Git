package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile", nullable = false)
    private Long id;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "firstname", nullable = false, length = 100)
    private String firstname;

    @Column(name = "middlename", length = 100)
    private String middlename;

    @Column(name = "profile_login", nullable = false, length = 100)
    private String profilelogin;

    @Column(name = "profile_password", nullable = false, length = 100)
    private String profilepassword;

    @Column(name = "roles_id", nullable = false)
    private Long rolesid;

    public ProfileEntity() {
    }

    public ProfileEntity(Long id, String lastname, String firstname, String middlename, String profilelogin, String profilepassword, Long rolesid) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.profilelogin = profilelogin;
        this.profilepassword = profilepassword;
        this.rolesid = rolesid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getProfilelogin() {
        return profilelogin;
    }

    public void setProfilelogin(String profilelogin) {
        this.profilelogin = profilelogin;
    }

    public String getProfilepassword() {
        return profilepassword;
    }

    public void setProfilepassword(String profilepassword) {
        this.profilepassword = profilepassword;
    }

    public Long getRolesid() {
        return rolesid;
    }

    public void setRolesid(Long rolesid) {
        this.rolesid = rolesid;
    }
}
