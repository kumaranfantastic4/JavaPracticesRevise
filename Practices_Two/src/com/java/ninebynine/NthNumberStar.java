package com.java.ninebynine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthNumberStar{

	private static int i; 
	private static int j;
	private static int k;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter Nth Number star ");

		int n_star = Integer.parseInt( bufferedReader.readLine());  
		
		/**
		 * club two triangle top down and bottom up 
		 */
		
		// giving n-th line by line stars which forms triangle shape in top down
		star_topdown_triangle(n_star);

		// giving ( n-1 )th line by line stars which forms triangle shape in bottom up
		star_bottomup_triangle(n_star);

	}

	private static void star_topdown_triangle(int nth_star){

		for(i=1;i<=nth_star;i++)
		{
			for(j=i;j<nth_star;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void star_bottomup_triangle(int nth_star){
		for(i=nth_star-1;i>=1;i--)
		{
			for(j=nth_star-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


