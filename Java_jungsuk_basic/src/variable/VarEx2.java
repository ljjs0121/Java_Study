package variable;


public class VarEx2 {

	public static void main(String[] args) {
		final int MAX_VALUE;
		MAX_VALUE = 100;
//		MAX_VALUE = 200;  !! 에러
		/*
		 * 변수 앞에 final이 붙으면 상수가 되기 때문에 값을 변경하는 것이 허용되지 않는다. 상수의 이름은 모두 대문자로 하는것이 관례이다.
		 * 여러 단어로 이루어져있는 경우 '_' 로 구분한다.
		 */
		int score = 100;
		score = 200;
		System.out.println("MAX_VALUE = " + MAX_VALUE);
		System.out.println("score = " + score);

	}

}
