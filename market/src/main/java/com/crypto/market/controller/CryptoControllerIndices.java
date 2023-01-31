package com.crypto.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crypto.market.service.CryptoService;
import com.crypto.market.service.impl.CryptoServiceImpl;

@Controller
@RequestMapping(path = "/")
public class CryptoControllerIndices {
	
	private CryptoService cryptoService = new CryptoServiceImpl();

	@PostMapping("las24history")
	public List<String> cryptoList24h() {
		//List<String> cryptoList = this.cryptoService.searchCryptoLast24hHistory();
		return new ArrayList<>();
	}
	
	@GetMapping("exchangeInfo")
	public List<String> exchangeInfo() {
		//List<String> cryptoList = this.cryptoService.searchCryptoLast24hHistory();
		return new ArrayList<>();
	}
}
