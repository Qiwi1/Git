package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.DeliveryEntity;
import com.developer.KivSportAPI.service.DeliveryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping
    public List<DeliveryEntity> findAllDelivery(){
        return deliveryService.findAllDelivery();
    }

    @GetMapping("/{id}")
    public Optional<DeliveryEntity> findDeliveryById(@PathVariable("id") Long id){
        return deliveryService.findById(id);
    }

    @PostMapping
    public DeliveryEntity saveDelivery(@RequestBody DeliveryEntity delivery){
        return deliveryService.saveDelivery(delivery);
    }

    @PutMapping
    public DeliveryEntity updateDelivery(@RequestBody DeliveryEntity delivery){
        return deliveryService.updateDelivery(delivery);
    }

    @DeleteMapping("/{id}")
    public void deleteDelivery(@PathVariable("id") Long id){
        deliveryService.deleteDelivery(id);
    }
}
