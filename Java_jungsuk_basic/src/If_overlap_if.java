import java.util.Scanner;

public class If_overlap_if {
	/*
	 * 중첩 if 예제
	 */
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.print("당신의 점수를 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
//		System.out.printf("당신의 점수는 %d점 입니다.%n", score); 
		
		if (score >= 90) {
			grade = 'A';
			if(score >= 98 ) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}			
		}	else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
			else {
				grade = 'C';
			}
		}
		System.out.printf("당신의 점수는 %d점 입니다.%n당신의 학점은 %c%c입니다.%n", score, grade, opt);
		}
	}
	/*
	 *  {} 블럭 주의하고 코드 작성 후에 테스트 해보면서 이상없는지 확인 이상있을 시 {} 블럭 문제
	 */

