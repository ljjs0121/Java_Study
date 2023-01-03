package loop;

public class Math_random {
	/*
	 *  임의의 정수 만들기
	 *  간단한 게임, 섞기 할 때 사용
	 */
	public static void main(String[] args) {
		int num = 0;
		/*
		 * 예제 1
		 */
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println((int)(Math.random() *6)+1);
		}
		/*
		 * 응용 1
		 */
		// -3 ~ 3
		// -3 -2 -1 0 1 2 3 = 7
		for (int i = 1; i <= 5; i++) {
			System.out.println((int)(Math.random() * 7) -3);
		} 
		/*
		 * 응용 2
		 */
		// -6 ~ 6
		// -6 -5 -4 -3- 2- -1 0 1 2 3 4 5 6 = 13
		for (int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random() * 13) -6);
		}
	}

}
