package com.prtest.test;

import java.util.ArrayList;
import java.util.List;

public class AppleUtil {

	public interface Predicate<T> {
		boolean test(T t);
	}
	
	public static List<Apple> filtering(List<Apple> list, Predicate<Apple> p) {
		List<Apple> result = new ArrayList();
		for(Apple apple : list) {
			if(p.test(apple))
				result.add(apple);
		}
		return result;
	}
	
}
