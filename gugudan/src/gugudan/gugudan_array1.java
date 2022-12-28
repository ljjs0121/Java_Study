package gugudan;

public class gugudan_array1 {

	public static void main(String[] args) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) { // 값을 저장 / length = 배열의 크기
			result[i] = 2 * (i + 1); // 우리가 아는 사칙연산과 같다.
		}
		for (int i = 0; i < result.length; i++) { // 값을 출력
			System.out.println(result[i]);
		}
		int[] result3 = new int[9];
		for (int i = 0; i < result3.length; i++) {
			result[i] = 3 * (i + 1);
		}
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
	}
}