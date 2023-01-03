package 생활코딩;

public class Loop_while {
/*
   	while 문은 반복조건이 참(true)이면 중괄호 구간을 반복적으로 실행한다. 조건이 false면 반복문이 실행되지 않는다. 
*/
			public static void main(String[] args) {
			/* 무한 반복 */
			while (true) {
				System.out.println("Coding Everybody");
			}
			/* 무한 반복 */
	}
			/* 변수의 값을 지정하고 false 조건을 성립시켜 무한반복이 되지 않는 예제 */
			public static void main1(String[] args) {
			int i = 0;
			// i의 값이 10보다 작다면 true, 크다면 false가 된다. 현재 i의 값은 0이기 때문에 
			// 이 반복문은 실행된다.
			while (i < 10) {
				System.out.println("Coding Everybody" + i);
				// i의 값에 1을 더한다. 반복문의 중괄호의 마지막 라인에 도달하면 반복문을 재호출한다.
				// 이때 i < 10의 값을 검사하게 된다.
				i++;
			}
		}
}