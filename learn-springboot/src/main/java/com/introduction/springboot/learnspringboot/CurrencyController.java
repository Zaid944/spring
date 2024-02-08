package com.introduction.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class CurrencyController
{
    @Autowired
    CurrencyConfig currencyConfig;

    @GetMapping("/currency")
    public CurrencyConfig getCurrencyConfig(){
        return currencyConfig;
    }
}
