package com.java.strategy.design.patterns;


public class FindThreeDimensionCube implements Strategy{

	@Override
	public long findStartingNumber(long matrixOrHyperCubicNumber, long valueLookingFor) {
		
		return (valueLookingFor / matrixOrHyperCubicNumber) - 
				(((matrixOrHyperCubicNumber*matrixOrHyperCubicNumber*matrixOrHyperCubicNumber) - 1)/2) ;
		
	}

}
