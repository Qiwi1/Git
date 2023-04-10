package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class RolesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles", nullable = false)
    private Long id;

    @Column(name = "role_name", nullable = false, length = 100)
    private String rolename;

    public RolesEntity() {
    }

    public RolesEntity(Long id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
