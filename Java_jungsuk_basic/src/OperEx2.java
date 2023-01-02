
public class OperEx2 {
	/*
	 * 산술변환
	 */
	public static void main(String[] args) {
		/*
		 * 예제 1
		 */
		System.out.println(5 / 2);
		System.out.println(5 / (float) 2); // 소수점 이하의 값을 얻으려면 어느 한쪽을 실수형으로 형변환해야한다.
		/*
		 * 예제 2
		 */
		byte c = 10;
		byte d = 30;
		byte e = (byte) (c * d); /*
								 * byte e = c * d; 컴파일러 에러발생 형변환해야 에러가 발생안한다. 단, 10 * 30의 값은 300 이지만, 큰 자료형에서 작은
								 * 자료형으로 변환하면 데이터 손실이 발생하므로 값이 바뀔 수 있다. 300은 byte형의 범위를 넘기 때문에 데이터 손실발생하여 44가
								 * byte형 변수 c에 저장
								 */
		System.out.println(e);
		/*
		 * 예제 3
		 */
		int f = 1_000_000;
		int g = 2_000_000;

		long h = f * g; /*
						 * int타입과 int타입의 연산결과는 int타입이기 때문에 전혀 다른 값을 출력한다. 올바른 결과를 얻으려면 변수 a 또는 b의 타입을
						 * 'long'으로 형변환 해야한다.
						 */
		long h1 = (long) f * g;
		System.out.println("형변환 안된 값 = " + h);
		System.out.println("형변환된 값 = " + h1);

		/*
		 * 예제 4
		 */
		long a1 = 1_000_000 * 1_000_000;  // int+int = int타입 이므로 오버플로우 발생
		long b2 = 1_000_000 * 1_000_000L; // int+long = long타입으로 형변환 되어서 올바른 값 출력

		System.out.println("a1 = " + a1);
		System.out.println("b2 = " + b2);

	}

}
