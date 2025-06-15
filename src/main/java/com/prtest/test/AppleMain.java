package com.prtest.test;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class AppleMain {

	public static void main(String[] args) {
		AppleMain main = new AppleMain();
		main.test();
	}
	
	private List<Apple> inventory = new ArrayList<Apple>();

	public void test() {
		List<Apple> list = getData();
		
		List<Apple> apples1 = AppleUtil.filtering(list, Apple::isHeavy);
		System.out.println(">>> apples1 : " + apples1);
		List<Apple> apples2 = AppleUtil.filtering(list, (Apple a) -> a.getWeight() > 20);
		System.out.println(">>> apples2 : " + apples2);
	}
	
	private List<Apple> getData() {
		List<Apple> list = new ArrayList();
		list.add(new Apple(8));
		list.add(new Apple(11));
		list.add(new Apple(22));
		return list;
	}
	
	private List<Apple> getData2() {
		List<Apple> list = inventory.stream().filter((Apple a) -> a.getWeight() > 15)
					.collect(toList());
		return list;
	}
}
