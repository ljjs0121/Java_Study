package OOP;

public class OOP {
	/*
	 * 객체 생성 및 사용
	 * 클래스명 변수명;
	 * 변수명 = new 클래스명();
	 */
	public static void main(String[] args) {
		Tv t;					// Tv인스턴스를 참조하기 위한 변수
		t = new Tv();			// Tv인스턴스를 생성
		t.channel = 7;			// Tv인스턴스의 멤버변수 channel의 값을 7로 한다. 
		t.channelUp();			
//		t.channelDown();        // Tv인스턴스의 메소드 channelDown()을 호출
		System.out.println("현재 채널은 " + t.channel  +" 입니다.");
	}
}

class Tv {
	// TV의 속성(멤버변수)
	String color;				// 색상
	boolean power;				// 전원상태 on/off
	int channel;				// 채널
	
	// Tv의 기능(메소드)
	void power() {power = !power; }			// Tv를 켜거나 끄는 기능 메소드
	void channelUp() { ++channel; }			// Tv의 채널을 높이는 기능 메소드
	void channelDown() { --channel; }		// Tv의 채널을 낮추는 기능 메소드
	
}
