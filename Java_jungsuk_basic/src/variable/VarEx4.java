package variable;


public class VarEx4 {
	/*
	 * 자바의 정석 연습문제 2-8
	 */
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		// x = 2 y = 3 z = 1
		// 배운 내용으로 풀이
		int tmp;
		tmp = x;
		x = y;
		y = z;
		z = tmp;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		// 쉬운 방법
		x = 2;
		y = 3;
		z = 1;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
