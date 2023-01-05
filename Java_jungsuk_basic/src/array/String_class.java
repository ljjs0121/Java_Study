
package array;
	
import java.util.Arrays;
	
public class String_class {
		/*
		 * String 클래스
		 * String클래스는 char배열에 메서드를 추가한 것이다.
		 * String 객체는 읽을 수만 있고, 내용을 변경할 수 없다.
		 */
	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(3); // At은 문자열에서 해당 위치(index)에 있는 문자를 반환
		System.out.println(ch);
		System.out.println(str.length()); // 문자열의 길이 반환
		String str2 = str.substring(1,4); // 해당 범위(from~ to) 의 문자열을 반환 (to 는 포함 안됨.)
		String str3 = str.substring(1); // 1부터 4까지
		String str4 = str.substring(1, str.length()); // 1부터 문자열 길이까지 반환
		
		System.out.println(str2); 
		System.out.println(str3); 
		System.out.println(str4); // str3 와 같은 의미
		
	}
	
}