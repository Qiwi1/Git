package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.BankEntity;
import com.developer.KivSportAPI.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bank")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping
    public List<BankEntity> findAllBank(){
        return bankService.findAllBank();
    }

    @GetMapping("/{id}")
    public Optional<BankEntity> findBankById(@PathVariable("id") Long id){
        return bankService.findById(id);
    }

    @PostMapping
    public BankEntity saveBank(@RequestBody BankEntity bank){
        return bankService.saveBank(bank);
    }

    @PutMapping
    public BankEntity updateBank(@RequestBody BankEntity bank){
        return bankService.updateBank(bank);
    }

    @DeleteMapping("/{id}")
    public void deleteBank(@PathVariable("id") Long id){
        bankService.deleteBank(id);
    }
}
