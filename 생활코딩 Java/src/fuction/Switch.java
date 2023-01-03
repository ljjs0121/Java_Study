package fuction;

public class Switch {
	/* ### 조건문의 대표적인 문법은 if문이다. 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다.

	switch문의 가장 마지막은 default로 끝난다. 즉, 주어진 케이스가 없는 경우 default 문이 실행되는 것을 알 수 있다. */
	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
			}
		// switch(1) switch뒤에 ( ) 값과 case 값이 일치할 경우 case 값 차례대로 출력 ex) 2일 경우 출력 > "two","three" 
		
		// 만약 switch 값과 일치하는 case 값만 출력하고 싶을 경우 break 를 사용하면 된다. 아래와 같다
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
			}
			// break 가 등장하기 떄문에 switch 값이 1일 경우 출력 값은 "one"
		}
	
	   // switch 문 >  if 문
	public static void main1(String[] args) {
	int val = 1;
	if ( val == 1) {
			System.out.println("one");
	} else if ( val == 2) {
			System.out.println("two");
	} else if ( val == 3) {
			System.out.println("three");
	}
	// switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. 

	/* byte, short, char, int, enum, String, Character, Byte, Short, Integer */
	
		System.out.println("switch(1)");
		switch(1){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		// case 뒤에 default 구문이 정의되어 있다면, switch 조건값이 case문에 속하지 않는다면 default 값이 실행된다.
	}
	
}


