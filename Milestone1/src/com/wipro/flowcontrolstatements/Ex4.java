package com.wipro.flowcontrolstatements;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input1,input2;
		System.out.println("Enter input1 value");
		Scanner s=new Scanner(System.in);
		input1=s.next().charAt(0);
		System.out.println("Enter input2 value");
		input2=s.next().charAt(0);
		s.close();
		if(input1>input2)
			System.out.println(input2+","+input1);
		else
			System.out.println(input1+","+input2);
			

	}

}
