package OOP;

public class O_stack {
	/*
	 * stack - 밑이 막힌 상자. 위에 차곡차곡 쌓인다.
	 * 
	 * call stack - 메소드 수행에 필요한 메모리가 저장되는 공간
	 * 				메소드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
	 */
	public static void main(String[] args) { 
	System.out.println("Hello Java");
	// jvm에 의해 main메소드가 호출되서 main메소드가 스택에 담긴다
	// main메소드에서 println()를 호출한 상태가 되고 main메소드가 끝난것은 아니므로 호출스택에 대기상태로 남아있는다.
	// println메소드가 수행이 시작된다. println메소드에 의해 'Hello Java'가 화면에 출력된다.
	// println메소드의 수행이 완료되서 호출스택에서 사라지고 main메소드로 되돌아간다.
	// 대기 중이던 main메소드는 println()을 호출한 이후부터 수행 재개한다.
	// main메소드에서도 수행할 코드가 것이 없으므로 종료되어, 호출스택은 비워지게 되고 프로그램은 종료된다.
}
}