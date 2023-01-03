package loop;

public class WhileEx {
	/*
	 * while문
	 * 조건을 만족시키는 동안 블럭{} 을 반복 - 반복횟수 모를 때 사용
	 */
	public static void main(String[] args) {
		// 예제
		int i = 5;
		
		while (i-- !=0) {
			System.out.println(i + " - I can Do it!");
			
		}
		System.out.println();
		// 예제 2
		int sum = 0;
		i = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum <= 100)	{
			System.out.printf("%d - %d%n", i,sum);
			sum += ++i;
		}
	}

}
