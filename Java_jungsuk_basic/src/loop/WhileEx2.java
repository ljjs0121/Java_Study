package loop;
import java.util.Scanner;

public class WhileEx2 {
	/*
	 * while문 예제 3
	 * 
	 */
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요.(예:12345) > ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		// (타입).parse(타입) String 을 해당 타입으로 변환해주는 
		
		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;		// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10; 		// num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합: "+sum);
	}

}
