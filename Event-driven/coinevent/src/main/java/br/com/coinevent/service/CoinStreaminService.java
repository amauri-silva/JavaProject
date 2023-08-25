package main.java.br.com.coinevent.service;

import main.java.br.com.coinevent.dto.RequestUser;

public interface CoinStreaminService {

    void callProducer(final RequestUser request);
    
}
