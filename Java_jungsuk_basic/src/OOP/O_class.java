package OOP;

public class O_class {
	/*
	 * 클래스 정의
	 * 1. 설계도와 같은 의미
	 * 2. 데이터 + 함수 
	 * 3. 사용자 정의 타입 - 서로 관련된 변수들을 묶어서 하나의 타입으로 새로 추가하는 것.
	 */
	public static void main(String[] args) {
		int hour;
		int minute;
		float second;
		
		// 3개의 시간을 다룬다면?
		int hour1, hour2, hour3;
		int minute1, minute2, minute3;
		float second1, second2, second3;
		
		//데이터의 개수가 많아지면?
		int[] hourA = new int[3];
		int[] minuteA = new int[3];
		float[] secondA = new float[3];
		/*
		 * 배열로 구성을 하게 된다면 시, 분, 초가 서로 분리되기 때문에
		 * 프로그램 수행과정에서 시, 분, 초가 따로 뒤섞여서 올바르지 않은 데이터가 될 가능성이 있다.
		 */
		
		// 그래서 시, 분, 초를 하나로 묶는 사용자정의 타입
		/* 즉, 클래스를 정의하여 사용한다.*/
		class Time {
			int hour;
			int minute;
			float second;
		}
	}
}


