package OOP;

public class O_class2 {
	/*
	 * 클래스 정의
	 * 1. 설계도와 같은 의미
	 * 2. 데이터 + 함수 
	 * 3. 사용자 정의 타입 - 서로 관련된 변수들을 묶어서 하나의 타입으로 새로 추가하는 것.
	 */
	public static void main(String[] args) {
		/* 비 객체지향적 코드 */
		// 1 
		int hour1, hour2, hour3;
		int minute1, minute2, minute3;
		float second1, second2, second3;
		// 2
		int[] hour = new int[3];
		int[] minute = new int[3];
		float[] second = new float[3];
		
		/* 객체지향적 코드 */ // 유지보수 하기 좋은 코드
		// 1 
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
	
		// 2 
		Time[] t = new Time[3];
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();

	}
}


