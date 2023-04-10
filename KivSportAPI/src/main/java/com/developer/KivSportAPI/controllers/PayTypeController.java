package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.PayTypeEntity;
import com.developer.KivSportAPI.service.PayTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paytype")
public class PayTypeController {
    private final PayTypeService payTypeService;

    public PayTypeController(PayTypeService payTypeService) {
        this.payTypeService = payTypeService;
    }

    @GetMapping
    public List<PayTypeEntity> findAllPayType(){
        return payTypeService.findAllPayType();
    }

    @GetMapping("/{id}")
    public Optional<PayTypeEntity> findPayTypeById(@PathVariable("id") Long id){
        return payTypeService.findById(id);
    }

    @PostMapping
    public PayTypeEntity savePayType(@RequestBody PayTypeEntity payType){
        return payTypeService.savePayType(payType);
    }

    @PutMapping
    public PayTypeEntity updatePayType(@RequestBody PayTypeEntity payType){
        return payTypeService.updatePayType(payType);
    }

    @DeleteMapping("/{id}")
    public void deletePayType(@PathVariable("id") Long id){
        payTypeService.deletePayType(id);
    }
}
