package 생활코딩;

public class Else_if {
		public static void main(String[] args) {
				if (false) {
						System.out.println(1);
					} else if (true) {				// 1번
						System.out.println(2);
					} else if (true) {				// 2번
						System.out.println(3);
					} else {
						System.out.println(4);
					}
					
				}

		} /*
		 if 절부터 2번 else if 까지 true가 처음으로 등장한 구간이 실행되고 if문은 종료되고
		 if문이 끝나는 구간부터 다시 실행이 시작된다.
		 !! 1번 2번 true여도 처음으로 등장한 1번까지 실행되고 2번은 실행되지 않는다.
		 따라서 출력 값은 2 
		 1번 false 2번 true일 경우는 출력 값은 3 
		 1번 2번 false일 경우는 else 값인 4 가 출력
			*/

