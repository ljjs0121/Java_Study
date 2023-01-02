
public class For {
	/*
	 * for문
	 * for(초기화; 조건식; 증감식) {
	 * 	수행될 문장
	 * }
	 */
	public static void main(String[] args) {
		/*
		 *  예제 1
		 */
			System.out.println("for문 예제 1");
			for (int i = 1; i <= 3; i++) {
			System.out.println("Hello");
		}
		/*
		 *  예제 2
		 */
			System.out.println("for문 예제 2");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
			for (int i = 1; i <=5; i++) { 
				System.out.print(i); // print는 가로로 출력
			}
			/*
			 *  예제 3
			 */
			System.out.printf("%nfor문 예제 3%n");
			int sum = 0;
			
			for (int i = 1; i <=5; i++) {
				sum += i; // sum = sum + i;
				System.out.printf("1부터 %2d 까지의 합: %2d%n",i ,sum); // %2d %와 d사이에 오는 숫자만큼 자리를 확보 
			}
	
	}

}
