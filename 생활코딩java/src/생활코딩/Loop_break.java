package 생활코딩;

public class Loop_break {
/*
 * 반복작업을 중간에 중단시키고 싶다면 어떻게 해야 할까? break를 사용하면 된다.
 */
	public static void main(String[] args) {
		for (int i  = 0; 1 < 10; i++) {
			if (i == 5)
					break;            // if 조건의 참인 조건까지 반복 후 종료
			System.out.println("Coding Everybody" +  i);
			}
	}
			// 변수 지정한 값부터 출력
}
