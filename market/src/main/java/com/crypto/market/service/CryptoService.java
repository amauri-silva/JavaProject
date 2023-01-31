package com.crypto.market.service;

import java.util.List;

public interface CryptoService {

	/**
	 * List all crypto transaction
	 * @return a list of crypto
	 */
	List<String> searchCrypto();
	
	/**
	 * Get all crypto data by its name
	 * @return a list of crypto
	 */
	List<String> searchCryptoLast24hHistory();
	
	
}
