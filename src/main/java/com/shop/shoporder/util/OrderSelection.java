package com.shop.shoporder.util;

public enum OrderSelection {

	ALL(1), UNPAID(2), PAID(3), PAIDONEDELI(4),DELIVERD(5), UNDELI(6),
	DONE(7), CANCELED(8), APPLYCAN(9), APPLYRETURN(10);
	
	private int code;
	
	OrderSelection (int code) {
		this.code = code;
	}
	
	public int getCode () {
		return this.code;
	}
	
	public void setCode (int code) {
		this.code = code;
	}
}
