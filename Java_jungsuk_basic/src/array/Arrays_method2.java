package array;

import java.util.Arrays;

public class Arrays_method2 {
	/*
	 * Arrays 배열 다루기
	 * 배열의 복사 - copyOf() , copyOfRange()
	 * copyOf() - 배열 전체 복사
	 * copyOfRange() - 배열 일부 복사 ( 지정된 범위의 끝은 포함되지 않는다.)
	 */
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2= [0,1,2,3,4]
		int[] arr3 = Arrays.copyOf(arr, 3); 		// arr3= [0,1,2]
		int[] arr4 = Arrays.copyOf(arr, 7);			// arr4= [0,1,2,3,4,0,0]
		int[] arr5 = Arrays.copyOfRange(arr,2, 4);  // arr5= [2,3] < 2~4까지 (4는 불포함)
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr6 = [0,1,2,3,4,0,0]
		
		/*
		 * 배열의 정렬 - sort()
		 * 배열을 정렬할 때 사용
		 */
		int[] arr1 = {3,2,4,1,5,0};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); // [0,1,2,3,4,5]
		/* 출력은 Arrays 클래스 toString() 메서드로 출력 */
	
	
	}

}
