package 생활코딩;

public class Operator_or {
/*
	 ||(or)는 좌우항 중에 하나라도 참(true)라면 전체가 true가 되는 논리 연산자다.
	
	좌우항이 false일 경우 실행 안된다.
 */
	public static void main(String[] args) {
				if (true || true) {
			System.out.println(1); // 1번
		}
		if (true || false) {
			System.out.println(2); // 2번
		}
		if (false || true) {
			System.out.println(3); // 3번
		}
		if (false || false) {
			System.out.println(4); // 4번
		}
// 4번만 좌우항이 false 이기 때문에 4번을 제외한 1번,2번,3번 값이 실행되서 출력값은 1,2,3
	}

}
