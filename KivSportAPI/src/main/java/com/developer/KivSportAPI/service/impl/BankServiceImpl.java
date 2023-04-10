package com.developer.KivSportAPI.service.impl;

import com.developer.KivSportAPI.models.BankEntity;
import com.developer.KivSportAPI.repository.BankRepository;
import com.developer.KivSportAPI.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<BankEntity> findAllBank() {
        return bankRepository.findAll();
    }

    @Override
    public Optional<BankEntity> findById(Long id) {
        return bankRepository.findById(id);
    }

    @Override
    public BankEntity saveBank(BankEntity bank) {
        return bankRepository.save(bank);
    }

    @Override
    public BankEntity updateBank(BankEntity bank) {
        return bankRepository.save(bank);
    }

    @Override
    public void deleteBank(Long id) {
        bankRepository.deleteById(id);
    }
}
