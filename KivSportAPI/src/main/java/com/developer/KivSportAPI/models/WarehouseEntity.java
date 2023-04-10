package com.developer.KivSportAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Warehouse")
public class WarehouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_warehouse", nullable = false)
    private Long id;

    @Column(name = "warehouse_cell", nullable = false, length = 5)
    private String warehousecell;

    @Column(name = "bilet_availability", nullable = false)
    private Boolean biletavailability = false;

    public WarehouseEntity() {
    }

    public WarehouseEntity(Long id, String warehousecell, Boolean biletavailability) {
        this.id = id;
        this.warehousecell = warehousecell;
        this.biletavailability = biletavailability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWarehousecell() {
        return warehousecell;
    }

    public void setWarehousecell(String warehousecell) {
        this.warehousecell = warehousecell;
    }

    public Boolean getBiletavailability() {
        return biletavailability;
    }

    public void setBiletavailability(Boolean biletavailability) {
        this.biletavailability = biletavailability;
    }
}
