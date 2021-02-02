package com.example.api_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {
	@SerializedName("Global Quote")
	private GlobalQuote globalQuote;

	public GlobalQuote getGlobalQuote() {
		return globalQuote;
	}

	public void setGlobalQuote(GlobalQuote globalQuote) {
		this.globalQuote = globalQuote;
	}
	
	
//	@Override
//	public String toString() {
//		return String.format("symbol:%s, open:%s, high:%s, low:%s, price:%s, volumn:%s", symbol, open, high, low, price, volumn);
//	}
}
