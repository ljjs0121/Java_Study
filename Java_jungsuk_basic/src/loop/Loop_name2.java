package loop;
import java.util.Scanner;

public class Loop_name2 {
	/*
	 * 이름 붙은 반복문
	 * 사용은 드물다. 이렇게 사용이 가능하다 라고만 알고 있자.
	 */
	public static void main(String[] args) {
		int menu = 0, num = 0;				
		Scanner sc = new Scanner(System.in);
		
		outer :
		while(true) { // 무한 반복
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0) > ");
			
			String tmp = sc.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); // 입력받은 문자열 (tmp)을 숫자로 변환
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // 0을 누르면 반복문 빠져나감
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0) >");
				continue; // 1번에서 3번을 안누르면 무한 반복
			}
			for(;;) {
				System.out.print("계산할 값을 입력하세요.(계산종료:0, 전체종료: 99) >");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break;
				
				if(num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("계산 값은=" + num*num);
					break;
				case 2:
					System.out.println("계산 값은=" + Math.sqrt(num));
					break;
				case 3:
					System.out.println("계산 값은= " + Math.log(num));
					break;
				}
			}
		}
		System.out.println("프로그램이 종료되었습니다...");
	}

}
