package OOP;

class Data { int x; }
public class O_parameter {
	/*
	 * 기본형 매개변수
	 * 변수의 값을 읽기만 할 수 있다. (only read)
	 */
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) { // 기본형 매개변수 - int
		x = 100;
		System.out.println("change() : x = " + x);
	}
}
