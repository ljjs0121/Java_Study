package gugudan;
import java.util.Scanner;
public class Gugudan_if {

	public static void main(String[] args) {
			// 8단
			System.out.println("구구단 중 출력할 단은? : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
				System.out.println("입력 값 : " + number );
			if (number < 2) {
				System.out.println("입력 값을 잘못 입력 하셨습니다.");
			} else if (number > 10) {
				System.out.println("입력 값을 잘못 입력 하셨습니다.");
			} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i );
			}
			}
	}
}
