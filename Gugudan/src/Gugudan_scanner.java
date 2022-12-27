import java.util.Scanner; 

public class Gugudan_scanner {
	public static void main(String[] args) {
		// 5단
		System.out.println("구구단 중 출력할 단은? :  "); 
		Scanner scanner = new Scanner(System.in); 
		int number = scanner.nextInt(); // nextInt = 입력 값이 int 값이다 라는 뜻
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
		
/*		   
  		   Scanner 사용 시 import 구문 추가 
	   	   Scanner scanner = new Scanner(System.in);
		   int (변수 이름) = scanner.nextInt();
*/	
	}
}
