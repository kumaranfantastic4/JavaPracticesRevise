package com.java.ninebynine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class UrlParts {
	public static void main(String[] args) 
			    {
				URL url;
				Scanner scan = new Scanner(System.in) ;
				System.out.println("enter https url :");
				String urlPath = scan.nextLine();
				
				String datas[] = urlPath.split(" ");
				System.out.println( datas.length);
				}

}
