package com.xworkz.java;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,3,6,8,10,15,21,29};
		int key = 10;
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if (arr[mid] == key) {
				System.out.println("key is found at index"+mid);
				return;
			}
			if (key < arr[mid])
				end = mid -1 ;
			else
				start = mid +1;
		} 
		System.out.println("key is not found");
	}
}
