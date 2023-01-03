package fuction;

public class Operator_and {
	/*
    && (and)
	&&는 좌항과 우항의 값이 모두 참(true)일 때 실행된다. And라고 읽는다.
	 */
	public static void main(String[] args) {
		if (true && true) {
			System.out.println(1);
		} /*
		if (true && false) {
			System.out.println(2);
		}
		if (false && true) {
			System.out.println(3);
		}
		if (false && false) {
			System.out.println(4);
		} */
	}
	// 좌항과 우항의 값이 모두 true 인것은 true && true 이기 때문에 값은 1만 출력된다.
}
