package loop;

public class For_gugudan2 {
	/*
	 * 구구단 응용
	 */
	public static void main(String[] args) {
		// 2의 배수만 구구단 출력
		for (int x = 2; x <= 9; x++) {
			if (x%2 == 0)
				for (int y = 1; y <= 9; y++) {
					System.out.println(x+"*"+y+"="+(x*y));
				}
			System.out.println();
		}
		// 2의 배수거나 3의 배수 구구단 출력
		for (int i = 2; i <=9; i++)	{
			if (i%2 == 0 || i%3 == 0) {
				for (int j = 1; j <=9; j++)	{
					System.out.println(i+" * "+j+" = "+(i*j));
			}
				System.out.println();
			}
			
		}
	}
	
}
