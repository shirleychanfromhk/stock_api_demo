package com.example.api_demo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GlobalQuote {
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

}
