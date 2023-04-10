package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.VacationTypeEntity;
import com.developer.KivSportAPI.models.WarehouseEntity;

import java.util.List;
import java.util.Optional;

public interface WarehouseService {
    List<WarehouseEntity> findAllWarehouse();
    Optional<WarehouseEntity> findById(Long id);
    WarehouseEntity saveWarehouse(WarehouseEntity warehouse);
    WarehouseEntity updateWarehouse(WarehouseEntity warehouse);
    void deleteWarehouse(Long id);
}
