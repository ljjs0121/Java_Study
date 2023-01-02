import java.util.Scanner;

public class Switch {
		/*
		 * Switch 
		 * 경우의 수가 많을 때 유용한 조건문.
		 */
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		int season = sc.nextInt();
		
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
			System.out.println("현재의 계절은 겨울입니다.");
		}	
			// break; 항상 쓰는 버릇 들이기 default: 가 if문의 else
		/*
		 * 위 switch문을 if문 변경 	
		 */
		if (season == 3 || season == 4 || season == 5 ) {
			System.out.println("현재는 봄입니다.");
		} else if (season == 6 || season == 7 || season == 8) {
			System.out.println("현재는 여름입니다.");
		} else if (season == 9 || season == 10 || season == 11) {
			System.out.println("현재는 가을입니다.");
		} else {
			System.out.println("현재는 겨울입니다.");
		}
	}
}
