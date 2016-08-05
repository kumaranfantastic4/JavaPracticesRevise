package com.java.strategy.design.patterns;

public class FindTwoDimensionMatrix implements Strategy {

	@Override
	public long findStartingNumber(long matrixOrHyperCubicNumber, long valueLookingFor) {
		return (valueLookingFor / matrixOrHyperCubicNumber) - (((matrixOrHyperCubicNumber*matrixOrHyperCubicNumber) - 1)/2) ;
	}

}
