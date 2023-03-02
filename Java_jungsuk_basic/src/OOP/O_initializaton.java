package OOP;

//public class O_initializaton {
/*
 * 멤버변수 초기화
 * 1. 클래스 변수(cv) 초기화 - 인스턴스 변수(iv) 초기화
 * 2. 자동 초기화 - 명시적 초기화(간단) - 초기화 블럭, 생성자(복잡)
 */
class init {
	static {
		System.out.println("static { }"); // 클래스 초기화 블럭
	}
	
	{
		System.out.println("{ }");	// 인스턴스 초기화 블럭
	}
	
	public init() {
		System.out.println("생성자");
	}
//}
	public static void main(String[] args) {
		System.out.println("init bt = new init(); ");
		init bt = new init();
		
		System.out.println("init bt2 = new init(); ");
		init bt2 = new init();
	
	}
}