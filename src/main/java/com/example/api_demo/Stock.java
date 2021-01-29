package com.example.api_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {
	
	@SerializedName("01. symbol")
	private String symbol;
	
	@SerializedName("02. open")
	private String open;
	
	@SerializedName("03. high")
	private String high;
	
	@SerializedName("04. low")
	private String low;
	
	@SerializedName("05. price")
	private String price;
	
	@SerializedName("06. volume")
	private String volume;
	
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
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

	
//	@Override
//	public String toString() {
//		return String.format("symbol:%s, open:%s, high:%s, low:%s, price:%s, volumn:%s", symbol, open, high, low, price, volumn);
//	}
}
