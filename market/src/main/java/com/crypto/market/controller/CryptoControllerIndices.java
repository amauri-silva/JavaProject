package com.crypto.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
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


	public String UnknownEndPoint(){
		return "Unemplemented method!"
	}
	
	public String getFullName(String name, String secondName){

		return String.concat(name,secondName);
	}

}
