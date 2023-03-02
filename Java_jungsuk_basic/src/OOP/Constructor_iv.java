package OOP;
// 매개변수 생성자 예제
class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // 기본 생성자 생성
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
 class Constructor_iv {
	public static void main(String[] args) {
	Car c1 = new Car();
	c1.color	= "White";
	c1.gearType	= "auto";
	c1.door	= 4;
	
	Car c2 = new Car("white","auto", 4); 
	// 매개변수 생성자를 잘 입력해놓으면 이렇게 코드가 간결해진다.
	
	System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door="+ c1.door);
	
	System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door="+ c2.door);
	}
	
}
