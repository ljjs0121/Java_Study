package OOP;
/*
 * 생성자란? = 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
 * 인스턴스 초기화란? = 인스턴스변수들을 초기화하는 것을 뜻한다.
 * 
 * 생성자의 조건
 * 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
 * 2. 생성자는 리턴 값이 없다.
 * 
 * class Card {
 * 	Card () {	// 매개변수 없는 생성자
 * 	// 인스턴스 초기화 작업
 * }
 * 
 * 	Card(String kind, int number) { // 매개변수 있는 생성자
 * 	// 인스턴스 초기화 작업
 * }
 */

// 예제
 	// 생성자가 하나도 없을 때 컴파일러가 기본 생성자 자동 추가
	class Data_1 {
		int value;
	}
	class Data_2 {
		int value;
//		Data_2() {} // 클래스를 만들 때 기본 생성자를 넣어주도록 습관들이기
		Data_2(int x) { // 매개변수가 있는 생성자.
			value = x;
		}
	}
 class Constructor {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
		// 에러가 발생하지 않도록 하기 위해서는 
		// Data_2 d2 = new Data_2(10);
	}

}
