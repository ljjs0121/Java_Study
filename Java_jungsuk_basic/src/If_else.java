import java.util.Scanner;

public class If_else {
	/*
	 * if else 예제
	 */
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요. = ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		/*
		 * if 문으로 바꾸면
		 * if(i == 0) {
		 * 	System.out.println("입력하신 숫자는 0입니다.")
		 * }
		 * if(i != 0) {
		 *  System.out.println("입력하신 숫자는 0이 아닙니다.")
		 * }
		 */
	}

}
