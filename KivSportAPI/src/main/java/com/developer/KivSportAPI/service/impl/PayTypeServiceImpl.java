package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.PayTypeEntity;
import com.developer.KivSportAPI.repository.PayTypeRepository;
import com.developer.KivSportAPI.service.PayTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayTypeServiceImpl implements PayTypeService {

    private final PayTypeRepository payTypeRepository;

    public PayTypeServiceImpl(PayTypeRepository payTypeRepository) {
        this.payTypeRepository = payTypeRepository;
    }

    @Override
    public List<PayTypeEntity> findAllPayType() {
        return payTypeRepository.findAll();
    }

    @Override
    public Optional<PayTypeEntity> findById(Long id) {
        return payTypeRepository.findById(id);
    }

    @Override
    public PayTypeEntity savePayType(PayTypeEntity payType) {
        return payTypeRepository.save(payType);
    }

    @Override
    public PayTypeEntity updatePayType(PayTypeEntity payType) {
        return payTypeRepository.save(payType);
    }

    @Override
    public void deletePayType(Long id) {
        payTypeRepository.deleteById(id);
    }
}
