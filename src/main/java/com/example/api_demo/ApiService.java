package com.example.api_demo;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

public class ApiService {
    public Stock getSingleStock(String function, String symbol, String apikey){
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        Gson gson = new Gson();
        String url = "https://www.alphavantage.co/query?function="+ function + "&" + "symbol=" + symbol + "&"+"apikey="+ apikey;
        System.out.println("calling url: " + url);
        String json =  rest.getForObject(url, String.class);
        System.out.println(json.substring(22, json.length()-1));
       // String ans = gson.fromJson(json.substring(22), String.class);
        Stock stock = gson.fromJson(json.substring(22, json.length()-1), Stock.class);
        
        return stock;
    }
}
