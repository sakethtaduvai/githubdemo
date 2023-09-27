package com.manager.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" ")
public class MutualFund {
	@Id
	int mutualFundId;
	String mutualFundName;
	double cashBalance,entryLoad,exitLoad ,expenseRatio,currentNav ;
	public int getMutualFundId() {
		return mutualFundId;
	}
	public void setMutualFundId(int mutualFundId) {
		this.mutualFundId = mutualFundId;
	}
	public String getMutualFundName() {
		return mutualFundName;
	}
	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}
	public double getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}
	public double getEntryLoad() {
		return entryLoad;
	}
	public void setEntryLoad(double entryLoad) {
		this.entryLoad = entryLoad;
	}
	public double getExitLoad() {
		return exitLoad;
	}
	public void setExitLoad(double exitLoad) {
		this.exitLoad = exitLoad;
	}
	public double getExpenseRatio() {
		return expenseRatio;
	}
	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}
	public double getCurrentNav() {
		return currentNav;
	}
	public void setCurrentNav(double currentNav) {
		this.currentNav = currentNav;
	}
	@Override
	public String toString() {
		return "MutualFund [mutualFundId=" + mutualFundId + ", mutualFundName=" + mutualFundName + ", cashBalance="
				+ cashBalance + ", entryLoad=" + entryLoad + ", exitLoad=" + exitLoad + ", expenseRatio=" + expenseRatio
				+ ", currentNav=" + currentNav + "]";
	}
	public MutualFund(int mutualFundId, String mutualFundName, double cashBalance, double entryLoad, double exitLoad,
			double expenseRatio, double currentNav) {
		super();
		this.mutualFundId = mutualFundId;
		this.mutualFundName = mutualFundName;
		this.cashBalance = cashBalance;
		this.entryLoad = entryLoad;
		this.exitLoad = exitLoad;
		this.expenseRatio = expenseRatio;
		this.currentNav = currentNav;
	}
	public MutualFund() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
