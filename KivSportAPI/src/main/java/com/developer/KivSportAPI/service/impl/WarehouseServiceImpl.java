package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.WarehouseEntity;
import com.developer.KivSportAPI.repository.WarehouseRepository;
import com.developer.KivSportAPI.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<WarehouseEntity> findAllWarehouse() {
        return warehouseRepository.findAll();
    }

    @Override
    public Optional<WarehouseEntity> findById(Long id) {
        return warehouseRepository.findById(id);
    }

    @Override
    public WarehouseEntity saveWarehouse(WarehouseEntity warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @Override
    public WarehouseEntity updateWarehouse(WarehouseEntity warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @Override
    public void deleteWarehouse(Long id) {
        warehouseRepository.deleteById(id);
    }
}
