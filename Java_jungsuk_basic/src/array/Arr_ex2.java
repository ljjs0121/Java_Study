package array;

public class Arr_ex2 {
	/*
	 * 배열 예제 2
	 */
	public static void main(String[] args) {
		int sum = 0;		// 총합을 저장하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4]; 코드가 기억이 안날 때 쉽게 푼다음 for문으로 작성하는게 좋다.
 
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ average);
		
	}

}
