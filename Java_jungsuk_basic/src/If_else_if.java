import java.util.Scanner;

public class If_else_if {
	/*
	 * else if문 예제
	 */
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if ( score >= 90) {
			grade = 'A';
		} else if (score >= 80) { 
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+ grade +" 입니다.");
		/*  
		    '80 <= score && score < 90' 를 쓰지 않고 'score >= 80'을 쓸수 있는 것은 
		     첫번째 조건인 'score >= 90' 이 거짓이기 때문이다.
		     거짓이라는 것은 'score < 90'이 참이라는 뜻이므로 
		     두번째 조건식에서 'score < 90'이라는 조건을 중복해서 확인할 필요가 없다.
		*/
	}

}
