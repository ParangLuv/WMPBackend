package com.parangluv.withmypet.common.util;

public enum NumberPerPage {
	FIVE(5), TEN(10), FIFTEEN(15), TWELVE(20), THIRTY(30), FIFTY(50);
	
	private int value;
	
	private NumberPerPage(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

		
}
