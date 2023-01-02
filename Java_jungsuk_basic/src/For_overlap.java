
public class For_overlap {
	/*
	 * 중첩 for문 
	 * for(초기화; 조건식; 증감식) {
	 * 	for(초기화; 조건식; 증감식)	{
	 * 		수행될 문장
	 *  }
	 * }
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}

}
 
