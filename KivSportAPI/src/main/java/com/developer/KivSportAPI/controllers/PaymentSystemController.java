package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.PaymentSystemEntity;
import com.developer.KivSportAPI.service.PaymentSystemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paymentsystem")
public class PaymentSystemController {
    private final PaymentSystemService paymentSystemService;

    public PaymentSystemController(PaymentSystemService paymentSystemService) {
        this.paymentSystemService = paymentSystemService;
    }

    @GetMapping
    public List<PaymentSystemEntity> findAllPaymentSystem(){
        return paymentSystemService.findAllPaymentSystem();
    }

    @GetMapping("/{id}")
    public Optional<PaymentSystemEntity> findPaymentSystemById(@PathVariable("id") Long id){
        return paymentSystemService.findById(id);
    }

    @PostMapping
    public PaymentSystemEntity savePaymentSystem(@RequestBody PaymentSystemEntity paymentSystem){
        return paymentSystemService.savePaymentSystem(paymentSystem);
    }

    @PutMapping
    public PaymentSystemEntity updatePaymentSystem(@RequestBody PaymentSystemEntity paymentSystem){
        return paymentSystemService.updatePaymentSystem(paymentSystem);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentSystem(@PathVariable("id") Long id){
        paymentSystemService.deletePaymentSystem(id);
    }
}
