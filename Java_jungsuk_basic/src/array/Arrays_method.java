package array;

import java.util.Arrays;

public class Arrays_method {
	/*
	 * Arrays 배열 다루기
	 * equals() , toString()
	 * 1차원일 때는 equals(), toString() 사용
	 * 2차원일 대는 앞에 deep이 붙는다. deepequals() , deeptoString()
	 */
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2d = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr)); // 1차원 배열 
		System.out.println(Arrays.deepToString(arr2d)); // 2차원 배열
		
		String[][] str2d1 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2d2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2d1, str2d2)); /* 일차원 배열에만 사용 가능 */
		System.out.println(Arrays.deepEquals(str2d1, str2d2)); /* 다차원 배열에는 deepEquals 사용 */
		
		
		
	
	
	}

}
