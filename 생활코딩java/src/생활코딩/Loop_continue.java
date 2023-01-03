package 생활코딩;

public class Loop_continue {
	/*
	 *  if 조건의 참인 조건만 빼고 반복 실행
	 */
	public static void main(String[] args) {
			for (int i  = 0; i < 10; i++) {
			if (i == 5)
					continue;            // if 조건의 참인 조건까지 반복 후 종료
			System.out.println("Coding Everybody" +  i);
			}
	}

}
/* 
 * 출력 1 2 3 4 6 7 8 9
 */