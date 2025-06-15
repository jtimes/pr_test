package com.prtest.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Apple {

	private long weight;
	private String color;
	
	public Apple(long weight) {
		this.weight = weight;
	}

	public boolean isHeavy() {
		if(this.weight > 10) return true;
		else return false;
	}
}
