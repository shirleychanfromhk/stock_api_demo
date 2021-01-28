package com.example.api_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_demo.ApiService;
import com.example.api_demo.Stock;
import com.example.api_demo.StockRespond;
import com.example.api_demo.exception.ApplicationException;

@RestController
@RequestMapping(value= "/api/stocks")
public class ApiController {
	
	ApiService repo = new ApiService();

	@GetMapping()
	public Stock getDetails(
			@RequestParam(value = "function", required = false) String function,
			@RequestParam(value = "symbol", required = false) String symbol,
			@RequestParam(value = "apikey", required = false) String apikey) throws ApplicationException{
//		for(int i = 0; i < repo.getPosts().getPost().length; i++) {
//			System.out.println("Posts: " + repo.getPosts().getPost());
//		}
		//if(function==null)sortBy = "id";
		//if(direction == null)direction = "asc";
		if(function.equals("")) {
			throw new ApplicationException("This API function () does not exist.");
		}
		if(symbol.equals("")) {
			throw new ApplicationException("Invalid API call.");
		}

		System.out.println("Stocks: " + repo.getSingleStock(function, symbol, apikey));
	    return repo.getSingleStock(function, symbol, apikey);
	}
}
