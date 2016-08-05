package com.java.misc;

public class DiscreteFourierTransform {

	/* 
	 * Computes the discrete Fourier transform (DFT) 
	 * pre-condition : All arrays must have same length
	 * 
	 */
	@SuppressWarnings("unused")
	private static void calculateDFT(double[] inputReal, double[] inputImaginary, double[] outpuReal, double[] outputImaginary) {
		
		int n = inputReal.length;
		
		for (int k = 0; k < n; k++) {  // For each output element : sample frequency
			double sumReal = 0;
			double sumImaginary = 0;
			for (int t = 0; t < n; t++) {  // For each input element : sample time 
				double angle = determineAngle(t, k, n);
				sumReal +=  realPartOfComplexNumbers(inputReal, angle, inputImaginary, t);
				sumImaginary +=  imagnaryiPartOfComplexNumbers(inputReal, angle, inputImaginary, t);
			}
			outpuReal[k] = sumReal;
			outputImaginary[k] = sumImaginary;
		}
		
	}
	
	/**
	 * 
	 * determining Angle
	 * 
	 * @param time
	 * @param frequency
	 * @param size
	 * @return
	 */
	private static double determineAngle(int time, int frequency, int size){
		return 2 * Math.PI * time * frequency / size;
	}
	
	/**
	 * 
	 * @param inputReal
	 * @param angle
	 * @param inputImaginary
	 * @param time
	 * @return
	 */
	private static double realPartOfComplexNumbers(double inputReal[], double angle, double inputImaginary[], int time){
		return  inputReal[time] * Math.cos(angle) + inputImaginary[time] * Math.sin(angle);
	}
	
	/**
	 * 
	 * @param inputReal
	 * @param angle
	 * @param inputImaginary
	 * @param time
	 * @return
	 */
	private static double imagnaryiPartOfComplexNumbers(double inputReal[], double angle, double inputImaginary[], int time){
		return  inputImaginary[time] * Math.cos(angle) - inputReal[time] * Math.sin(angle) ;
	} 
	
}
