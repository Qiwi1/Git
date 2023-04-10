package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.LocationWarehouseEntity;
import com.developer.KivSportAPI.models.PaymentSystemEntity;

import java.util.List;
import java.util.Optional;

public interface PaymentSystemService {
    List<PaymentSystemEntity> findAllPaymentSystem();
    Optional<PaymentSystemEntity> findById(Long id);
    PaymentSystemEntity savePaymentSystem(PaymentSystemEntity paymentSystem);
    PaymentSystemEntity updatePaymentSystem(PaymentSystemEntity paymentSystem);
    void deletePaymentSystem(Long id);
}
