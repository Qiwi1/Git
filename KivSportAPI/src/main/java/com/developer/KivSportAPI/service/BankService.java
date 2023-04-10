package com.developer.KivSportAPI.service;

import com.developer.KivSportAPI.models.BankEntity;

import java.util.List;
import java.util.Optional;

public interface BankService {

    List<BankEntity> findAllBank();
    Optional<BankEntity> findById(Long id);
    BankEntity saveBank(BankEntity bank);
    BankEntity updateBank(BankEntity bank);
    void deleteBank(Long id);
}
