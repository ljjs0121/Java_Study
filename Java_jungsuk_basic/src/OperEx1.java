
public class OperEx1 {
	/*
	 * 사칙연산자 예제
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b); // 정수 / 정수 = 소수점 이하는 버려진다.
		System.out.printf("%d / %f = %f%n", a, (float) b, a / (float) b); // 소수점 이하의 값도 출력하려면 형변환을 해야한다.

	}

}
