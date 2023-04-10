package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.LocationWarehouseEntity;
import com.developer.KivSportAPI.repository.LocationWarehouseRepository;
import com.developer.KivSportAPI.service.LocationWarehouseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationWarehouseServiceImpl implements LocationWarehouseService {

    private final LocationWarehouseRepository locationWarehouseRepository;

    public LocationWarehouseServiceImpl(LocationWarehouseRepository locationWarehouseRepository) {
        this.locationWarehouseRepository = locationWarehouseRepository;
    }

    @Override
    public List<LocationWarehouseEntity> findAllLocationWarehouse() {
        return locationWarehouseRepository.findAll();
    }

    @Override
    public Optional<LocationWarehouseEntity> findById(Long id) {
        return locationWarehouseRepository.findById(id);
    }

    @Override
    public LocationWarehouseEntity saveLocationWarehouse(LocationWarehouseEntity locationWarehouse) {
        return locationWarehouseRepository.save(locationWarehouse);
    }

    @Override
    public LocationWarehouseEntity updateLocationWarehouse(LocationWarehouseEntity locationWarehouse) {
        return locationWarehouseRepository.save(locationWarehouse);
    }

    @Override
    public void deleteLocationWarehouse(Long id) {
        locationWarehouseRepository.deleteById(id);
    }
}
