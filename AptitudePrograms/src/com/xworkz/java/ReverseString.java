package com.xworkz.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		str = input.nextLine();
		char[] arr = str.toCharArray();
		int y = str.length() - 1;
		for(int i=0;i<str.length()/2;i++) {
			char temp = arr[i];
			arr[i] = arr[y];
			arr[y] = temp;
			y--;
		}
		str = new String(arr);
		System.out.println("After converting,"+str);
		input.close();
	}
}

