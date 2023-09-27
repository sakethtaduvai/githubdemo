package com.transaction.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class InvestorTransaction {
	public InvestorTransaction() {
		// TODO Auto-generated constructor stub
	}
	@Id
	int transactionId;
	int investorId ;
	int mutualFundId;
	String transactionType;
	double units;
	double transactionAmount;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public int getMutualFundId() {
		return mutualFundId;
	}
	public void setMutualFundId(int mutualFundId) {
		this.mutualFundId = mutualFundId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + investorId;
		result = prime * result + mutualFundId;
		long temp;
		temp = Double.doubleToLongBits(transactionAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + transactionId;
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		temp = Double.doubleToLongBits(units);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		InvestorTransaction other = (InvestorTransaction) obj;
		if (investorId != other.investorId)
			return false;
		if (mutualFundId != other.mutualFundId)
			return false;
		if (Double.doubleToLongBits(transactionAmount) != Double.doubleToLongBits(other.transactionAmount))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		if (Double.doubleToLongBits(units) != Double.doubleToLongBits(other.units))
			return false;
		return true;
	}
	public InvestorTransaction(int transactionId, int investorId, int mutualFundId, String transactionType,
			double units, double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.investorId = investorId;
		this.mutualFundId = mutualFundId;
		this.transactionType = transactionType;
		this.units = units;
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "InvestorTransaction [transactionId=" + transactionId + ", investorId=" + investorId + ", mutualFundId="
				+ mutualFundId + ", transactionType=" + transactionType + ", units=" + units + ", transactionAmount="
				+ transactionAmount + "]";
	}
	

}
