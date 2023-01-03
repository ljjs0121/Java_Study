package loop;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class WhileEx2_1 {
	/*
	 * while문 예제 2-1
	 * 예제 2번 for문 변경
	 */
	public static void main(String[] args) {
		int num = 12345, sum = 0;
		
		// 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
		for (num=12345; num>0;num = num/10) {
			System.out.println(num%10);
			sum += num %10;
		}
			System.out.println("각 자리수의 합 ="+sum);
	}

}
