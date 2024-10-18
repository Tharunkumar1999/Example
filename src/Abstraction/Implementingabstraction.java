package Abstraction;

import java.io.PrintStream;

public class Implementingabstraction extends AbstractClass {

	@Override
	int add(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	void Mathss() {
		System.out.println("output printed");
		
	}
	


public static void main(String[] args) {
	Implementingabstraction i=new Implementingabstraction();
	
	System.out.println(i.add(2, 5, 8));
	System.out.println(i.sub(2, 5));
	System.out.println(i.multiply(2, 5));
	i.Mathss();
}
}

