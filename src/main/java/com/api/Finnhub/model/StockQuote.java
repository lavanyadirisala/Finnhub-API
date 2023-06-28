package com.api.Finnhub.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockQuote {
	
    private String symbol;
    
    @JsonProperty("c")
    private double currentPrice;

    @JsonProperty("d")
    private double d;

    @JsonProperty("dp")
    private double dp;

    @JsonProperty("h")
    private double high;

    @JsonProperty("l")
    private double low;

    @JsonProperty("pc")
    private double pc;
    
    @JsonProperty("o")
    private double o;
    
    public double getO() {
		return o;
	}

	public void setO(double o) {
		this.o = o;
	}

	@JsonProperty("t")
    private double t;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getDp() {
		return dp;
	}

	public void setDp(double dp) {
		this.dp = dp;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getPc() {
		return pc;
	}

	public void setPc(double pc) {
		this.pc = pc;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}


}
