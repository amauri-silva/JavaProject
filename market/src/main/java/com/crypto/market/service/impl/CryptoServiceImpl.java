package com.crypto.market.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crypto.market.service.CryptoService;

@Service
public class CryptoServiceImpl  implements CryptoService{

	@Override
	public List<String> searchCrypto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> searchCryptoLast24hHistory() {
		// TODO Auto-generated method stub
		
		List<String> test = new ArrayList<>();
		test.add("Well come 24h history !");
		
		return test;
	}

	@Override
	public List<String> exchangeInfo() {
		List<String> test = new ArrayList<>();
		test.add("Well come, exchange info !");
		
		return test;
	}

}
