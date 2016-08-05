package com.java.strategy.design.patterns;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy ;
	}
	
	public long execute(long numberA, long numberB){
		return strategy.findStartingNumber(numberA, numberB);
	}
		
}
