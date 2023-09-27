package com.utilities.models;

public class NavHistory {
  public NavHistory() {
	// TODO Auto-generated constructor stub
}
  int mutualFundId;
	String businessDate;
	double nav;
	public int getMutualFundId() {
		return mutualFundId;
	}
	public void setMutualFundId(int mutualFundId) {
		this.mutualFundId = mutualFundId;
	}
	public String getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}
	public double getNav() {
		return nav;
	}
	public void setNav(double nav) {
		this.nav = nav;
	}
	@Override
	public String toString() {
		return "NavHistory [mutualFundId=" + mutualFundId + ", businessDate=" + businessDate + ", nav=" + nav + "]";
	}
	public NavHistory(int mutualFundId, String businessDate, double nav) {
		super();
		this.mutualFundId = mutualFundId;
		this.businessDate = businessDate;
		this.nav = nav;
	}
	
	
}
