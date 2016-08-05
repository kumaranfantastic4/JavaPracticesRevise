package com.java.strategy.design.patterns;


public class FindFourthDimensionHypercube implements Strategy {

	@Override
	public long findStartingNumber(long matrixOrHyperCubicNumber, long valueLookingFor) {
		// TODO Auto-generated method stub
		return (valueLookingFor / matrixOrHyperCubicNumber) - (((matrixOrHyperCubicNumber*matrixOrHyperCubicNumber*matrixOrHyperCubicNumber*matrixOrHyperCubicNumber) - 1)/2) ;
	}

}
