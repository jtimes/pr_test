package com.prtest.test;

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

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
