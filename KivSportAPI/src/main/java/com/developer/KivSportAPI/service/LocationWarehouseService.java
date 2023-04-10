package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.DeliveryEntity;
import com.developer.KivSportAPI.models.LocationWarehouseEntity;

import java.util.List;
import java.util.Optional;

public interface LocationWarehouseService {
    List<LocationWarehouseEntity> findAllLocationWarehouse();
    Optional<LocationWarehouseEntity> findById(Long id);
    LocationWarehouseEntity saveLocationWarehouse(LocationWarehouseEntity locationWarehouse);
    LocationWarehouseEntity updateLocationWarehouse(LocationWarehouseEntity locationWarehouse);
    void deleteLocationWarehouse(Long id);
}
