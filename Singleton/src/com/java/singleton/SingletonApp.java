package com.java.singleton;

public class SingletonApp {

	public static void main(String[] args) {
		
		SingleObject singleObject = SingleObject.getInstance();
		
		singleObject.showMessage();// o/p Single Object class method call
				
	}

}
