package sort;

import java.util.Vector;
/**
 * @file_name : AscSort.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 1.
 * @story     : 오름차순 정렬
 */

public class AscSort {
	public static void main(String[] args) {
		System.out.println("===오름차순===");
		Vector<Integer> vec= new Vector<Integer>();
		int[] arr = {2,5,68,79,123,4,9};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp = arr[i]; //스왑정렬
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vec.add(i);
		}
		System.out.println(vec.toString());
		
		System.out.println("===내림차순===");
		Vector<Integer> vec2= new Vector<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i]; //스왑정렬
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vec2.add(i);
		}
		System.out.println(vec2.toString());
	}
	
}
