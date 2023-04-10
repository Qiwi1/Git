package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.ConsumerCartEntity;
import com.developer.KivSportAPI.models.DeliveryEntity;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    List<DeliveryEntity> findAllDelivery();
    Optional<DeliveryEntity> findById(Long id);
    DeliveryEntity saveDelivery(DeliveryEntity delivery);
    DeliveryEntity updateDelivery(DeliveryEntity delivery);
    void deleteDelivery(Long id);
}
