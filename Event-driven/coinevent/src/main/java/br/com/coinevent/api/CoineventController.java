package br.com.jevent.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.br.com.coinevent.dto.RequestUser;
import main.java.br.com.coinevent.service.CoinStreaminService;

@RestController
@RequestMapping("/api/v1/coinevent")
public class CoineventController{
    
    private CoinStreaminService service;

    @PostMapping("/coin-price")
    public String coinCurrentPrice(RequestUser request){

        service.callProducer(request);
        return "OK Man!";
    }

}