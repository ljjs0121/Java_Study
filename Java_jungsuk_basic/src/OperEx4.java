
public class OperEx4 {
	/*
	 * 문자열 비교 예제
	 */
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); // 내용은 같지만 다른 객체라서 false 
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); 
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); 
																			  
		/*
		 * printf  %b = boolean 값 출력
		 * 문자열을 비교할때는 항상 equals()를 사용 ( 대소문자 구분 O)
		 * 문자열을 대소문자 구별하지 않고 비교하려면 equalsIgnoreCase() 를 사용.
		 */
	}

}
