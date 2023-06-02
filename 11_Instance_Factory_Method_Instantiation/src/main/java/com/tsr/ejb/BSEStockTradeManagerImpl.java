package com.tsr.ejb;

import java.security.SecureRandom;

public class BSEStockTradeManagerImpl implements StockTradeManager {
	@Override
	public double getStockPrice(String stockName) {
		return new SecureRandom().nextDouble() * 100;
	}
}