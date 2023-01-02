import java.util.Scanner;

public class OperEx5 {
	/*
	 * 논리 연산자 && || 예제 변형
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if('a' <= ch && ch <= 'z') {
			System.out.printf("입력하신 문자는 소문자입니다.%n"); 
		}
		if('A' <= ch && ch <= 'Z') {
			System.out.printf("입력하신 문자는 대문자입니다.%n");
		
		}
			
		/*
		 * next() 과 nextLine() 차이
		 * next() - 스페이스 즉, 공백 전까지 입력받은 문자열을 리턴한다는 뜻.
		 * nextLine() - Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 뜻.
		 */
		}
		
	}


