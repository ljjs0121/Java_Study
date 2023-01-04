package array;

import java.util.Arrays;

public class Arr_2 {
	/*
		배열의 출력
		for문 이용한 출력 방법
		Arrays.toString() 을 이용한 출력	(간단하게 배열 출력하는 방법)	
	 */
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		for(int i= 0; i<iArr.length; i++) {
			System.out.println(iArr[i]);	// for문을 이용한 배열 출력
		}
		System.out.println(Arrays.toString(iArr)); // 간단하게 배열 출력 하는 방법
		// Arary.toString() 을 사용하려면, import java.util.Arrays;를 추가해야한다. 단축키 ctrl + shift + o
		
	}
	
}
