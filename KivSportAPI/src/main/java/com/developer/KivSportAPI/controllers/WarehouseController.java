package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.WarehouseEntity;
import com.developer.KivSportAPI.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public List<WarehouseEntity> findAllBank(){
        return warehouseService.findAllWarehouse();
    }

    @GetMapping("/{id}")
    public Optional<WarehouseEntity> findWarehouseById(@PathVariable("id") Long id){
        return warehouseService.findById(id);
    }

    @PostMapping
    public WarehouseEntity saveWarehouse(@RequestBody WarehouseEntity warehouse){
        return warehouseService.saveWarehouse(warehouse);
    }

    @PutMapping
    public WarehouseEntity updateWarehouse(@RequestBody WarehouseEntity warehouse){
        return warehouseService.updateWarehouse(warehouse);
    }

    @DeleteMapping("/{id}")
    public void deleteWarehouse(@PathVariable("id") Long id){
        warehouseService.deleteWarehouse(id);
    }
}
