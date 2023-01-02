
public class OperEx3 {
	/*
	 * 나머지 연산자
	 */
	public static void main(String[] args) {
		/*
		 * 예제 1
		 */
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/ y, x % y);
		
		/*
		 *  예제 2
		 */
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		/*
		 * 피연산자의 부호는 모두 무시하고, 나머지 연산을 한 결과에 왼쪽 피연산자 부호를 붙이면 된다.
		 * 따라서, 결과값은 -2 , 2, -2
		 */
	}

}
