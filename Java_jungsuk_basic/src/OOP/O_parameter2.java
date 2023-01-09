package OOP;

class Data2 { int x; }
public class O_parameter2 {
	/*
	 * 참조형 매개변수
	 * 변수의 값을 읽고 변경할 수 있다. (read & write)
	 */
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data2 d) { // 참조형 매개변수 - Data2
		d.x = 100;
		System.out.println("change() : x = " + d.x);
	}
}
