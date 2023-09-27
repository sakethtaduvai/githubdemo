package com.utilities.models;

public class StockPrice {
	public StockPrice() {
		// TODO Auto-generated constructor stub
	}
	int stockId ;
	String businessDate; 
	double openingPrice ;
	double closingPrice;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}
	public double getOpeningPrice() {
		return openingPrice;
	}
	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}
	public double getClosingPrice() {
		return closingPrice;
	}
	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}
	@Override
	public String toString() {
		return "StockPrice [stockId=" + stockId + ", businessDate=" + businessDate + ", openingPrice=" + openingPrice
				+ ", closingPrice=" + closingPrice + "]";
	}
	public StockPrice(int stockId, String businessDate, double openingPrice, double closingPrice) {
		super();
		this.stockId = stockId;
		this.businessDate = businessDate;
		this.openingPrice = openingPrice;
		this.closingPrice = closingPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessDate == null) ? 0 : businessDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(closingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(openingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stockId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPrice other = (StockPrice) obj;
		if (businessDate == null) {
			if (other.businessDate != null)
				return false;
		} else if (!businessDate.equals(other.businessDate))
			return false;
		if (Double.doubleToLongBits(closingPrice) != Double.doubleToLongBits(other.closingPrice))
			return false;
		if (Double.doubleToLongBits(openingPrice) != Double.doubleToLongBits(other.openingPrice))
			return false;
		if (stockId != other.stockId)
			return false;
		return true;
	}
	

}
