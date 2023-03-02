package OOP;
/*
 * 생성자 this()
 * - 생성자의 이름으로 클래스 이름 대신 this를 사용한다.
 * - 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 */
class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color,String gearType, int door) {
		this.color = color; // this.color는 iv color는 lv
		this.gearType = gearType;
		this.door = door;
	}
}
public class This {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType +", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType +", door=" + c2.door);
	}
	
}
/*
 * 참조변수 this
 * - 인스턴스 자신을 가리키는 참조변수
 * - 인스턴스 메서드(생성자 포함)에서 사용가능
 * - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
 */
class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() {}
	
	Car3(String c, String g, int d) {
		color = c; // color = iv c = lv
		gearType = g;
		door = d;
		// this 생략 가능
	}

	Car3(String color, String gearType, int door) { // this.color는 iv, color는 lv
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		// iv와 lv 구분이 안가기 떄문에 this를 쓰지 않으면 iv가 lv로 취급되기 때문에 
		// this를 써야 구분이 가능하다.
	}
}