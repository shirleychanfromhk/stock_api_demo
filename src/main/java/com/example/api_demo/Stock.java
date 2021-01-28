package com.example.api_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {
	
	@JsonProperty("01. symbol")
	private String symbol;
	
	@JsonProperty("02. open")
	private String open;
	
	@JsonProperty("03. high")
	private String high;
	
	@JsonProperty("04. low")
	private String low;
	
	@JsonProperty("05. price")
	private String price;
	
	@JsonProperty("06. volume")
	private String volumn;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVolumn() {
		return volumn;
	}
	public void setVolumn(String volumn) {
		this.volumn = volumn;
	}
	
//	@Override
//	public String toString() {
//		return String.format("symbol:%s, open:%s, high:%s, low:%s, price:%s, volumn:%s", symbol, open, high, low, price, volumn);
//	}
}
