package com.eazybytes.loans.model;





public class Customer {

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private int customerId;

}
