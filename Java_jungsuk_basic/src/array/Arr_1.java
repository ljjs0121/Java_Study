package array;

public class Arr_1 {
	/*
	 * 배열 (array)
	 * 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
	 * int[] score; - java
	 * int score[]; - c언어
	 * 인덱스(index)의 범위는 0부터 '배열길이 -1' 까지
	 */
	public static void main(String[] args) {
		int[] score = new int[] {200, 100, 300, 400, 0}; // 배열 초기화 기억하기.
//		int[] score;
//		socre = {200, 100, 300, 400, 0}; 				// 두줄로 
		// 배열의 인덱스는 0부터 시작해서 조건은 0부터 시작
		for(int i = 0; i <5; i++)	{
			System.out.println(score[2]);
		}
		System.out.println();
		// 배열의 길이를 줄이면  조건의 범위도 변경을 해주어야 하는데, 그 방법보다 length를 사용하는 것이 좋다.
		for(int j = 0; j <score.length; j++)	{
			System.out.println(score[j]);
		}
		// for문을 이용한 배열 초기화
		System.out.println();
		for(int x = 0; x <score.length; x++) {
			score[x] = x * 10 + 50;
			System.out.println(score[x]);
		}
	}
}
