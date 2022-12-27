import java.util.Scanner;

public class Gugudan_if {

	public static void main(String[] args) {
			System.out.println("구구단 출력할 단은? : ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("당신이 입력 값 : " + number);
			if (number < 2) {
				System.out.println("입력 값이 잘못되었습니다.");
			} else if (number >10) {
				System.out.println("입력 값이 잘못되었습니다.");				
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.println(number * i);
				}
			}
	}

}
