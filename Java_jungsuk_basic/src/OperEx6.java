
public class OperEx6 {
	/*
	 * 논리 부정 연산자 !
	 */
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();	// println을 쓴 이유는 밑에 출력 값과 구분짓기 위해
	
		System.out.printf("ch=%c%n", ch);
		System.out.printf("   ch < 'a' || ch > 'z'   =%b%n", ch < 'a' || ch > 'z'); // ch의 값이 소문자가 아닌지 비교
		System.out.printf("!('a' <= ch && ch <= 'z') =%b%n", !('a'<=ch && ch <= 'z')); // 밑에 식의 부정 
		System.out.printf("  'a' <= ch && ch <= 'z'  =%b%n", 'a'<=ch && ch <= 'z');
	/*
	 * 	ch < 'a' || ch > 'z' <-> !('a' <= ch && ch <= 'z')
	 *  왼쪽 식보다 오른쪽 부정 연산자'!'를 사용하는 것이 알기 쉽다.
	 */
	}

}
