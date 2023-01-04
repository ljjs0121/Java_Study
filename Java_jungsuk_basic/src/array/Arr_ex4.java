package array;

import java.util.Arrays;

public class Arr_ex4 {
	/*
	 * 배열 예제 4
	 * 섞기 예제
	 */
public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i < numArr.length; i++) { // 예제는 0만 바뀌도록 되있었는데 이 방법이 더 효율적으로 섞는다
			int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻기 위해 배열의 개수 입력
			int tmp = numArr[i];			// 예제 numArr[0]; 
			numArr[0] = numArr[n];
			numArr[n] = tmp;			// numArr[0]과 numArr[n]의 값을 서로 바꾸기 위해 임의의 변수 추가
		}
		System.out.println(Arrays.toString(numArr));
	
	}

}
