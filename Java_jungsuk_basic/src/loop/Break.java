package loop;

public class Break {
	/*
	 * break문
	 * 자신이 포함된 하나의 반복문을 벗어난다.
	 */
	public static void main(String[] args) {
		// 예제 1
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			// 무한 반복문에는 조건문과 break문이 항상 같이 사용된다.
			++i;
			sum += i;
		} // end of while
		System.out.println("i=" +i);
		System.out.println("sum="+ sum);
	}

}
