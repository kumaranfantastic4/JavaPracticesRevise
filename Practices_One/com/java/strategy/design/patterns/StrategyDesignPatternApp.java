package com.java.strategy.design.patterns;

public class StrategyDesignPatternApp {

	public static void main(String[] args) {
		Context context = new Context(new FindTwoDimensionMatrix());
		System.out.println("5 -- 75 = " + context.execute(5, 75)); // expected o/p 3
		

		 context = new Context(new FindThreeDimensionCube());
		System.out.println("3 -- 51 = " + context.execute(3, 51)); // expected o/p 4
		

		context = new Context(new FindFourthDimensionHypercube());
		System.out.println("3 -- 132 = " + context.execute(3, 132)); // expected o/p 4
		
	}

}
