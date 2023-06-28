package com.api.Finnhub.service;

import com.api.Finnhub.model.StockQuote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class FinnhubClient {
    private static final String API_BASE_URL = "https://finnhub.io/api/v1";
    private static final String API_KEY = "cidakbpr01qgf7g0iidgcidakbpr01qgf7g0iie0";
    private static final HttpClient httpClient = HttpClients.createDefault();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static StockQuote getStockQuote(String symbol) throws IOException {
        String url = API_BASE_URL + "/quote?symbol=" + symbol + "&token=" + API_KEY;
        HttpGet request = new HttpGet(url);
        
        HttpResponse response = httpClient.execute(request);
        
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String json = EntityUtils.toString(entity);
            return objectMapper.readValue(json, StockQuote.class);
        }

        return null;
    }
}
