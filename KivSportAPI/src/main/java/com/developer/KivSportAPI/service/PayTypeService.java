package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.PayTypeEntity;
import com.developer.KivSportAPI.models.PaymentSystemEntity;

import java.util.List;
import java.util.Optional;

public interface PayTypeService {
    List<PayTypeEntity> findAllPayType();
    Optional<PayTypeEntity> findById(Long id);
    PayTypeEntity savePayType(PayTypeEntity payType);
    PayTypeEntity updatePayType(PayTypeEntity payType);
    void deletePayType(Long id);
}
