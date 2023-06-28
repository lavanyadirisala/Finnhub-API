package com.api.Finnhub;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.Finnhub.model.StockQuote;
import com.api.Finnhub.service.FinnhubClient;

@SpringBootApplication
public class FinnhubApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(FinnhubApplication.class, args);
		StockQuote stockQuote = FinnhubClient.getStockQuote("AAPL");
        System.out.println("Current Price: " + stockQuote.getCurrentPrice());
	}

}
