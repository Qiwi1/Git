package com.developer.KivSportAPI.controllers;

import com.developer.KivSportAPI.models.ConsumerCartEntity;
import com.developer.KivSportAPI.service.ConsumerCartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consumercart")
public class ConsumerCartController {
    private final ConsumerCartService consumerCartService;

    public ConsumerCartController(ConsumerCartService consumerCartService) {
        this.consumerCartService = consumerCartService;
    }

    @GetMapping
    public List<ConsumerCartEntity> findAllConsumerCart(){
        return consumerCartService.findAllConsumerCart();
    }

    @GetMapping("/{id}")
    public Optional<ConsumerCartEntity> findConsumerCartById(@PathVariable("id") Long id){
        return consumerCartService.findById(id);
    }

    @PostMapping
    public ConsumerCartEntity saveConsumerCart(@RequestBody ConsumerCartEntity consumerCart){
        return consumerCartService.saveConsumerCart(consumerCart);
    }

    @PutMapping
    public ConsumerCartEntity updateConsumerCart(@RequestBody ConsumerCartEntity consumerCart){
        return consumerCartService.saveConsumerCart(consumerCart);
    }

    @DeleteMapping("/{id}")
    public void deleteConsumerCart(@PathVariable("id") Long id){
        consumerCartService.deleteConsumerCart(id);
    }
}
