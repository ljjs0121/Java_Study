package 생활코딩;

public class Operator_not {
/*
	 !(not) not이라고 읽는다. Boolean의 값을 역전시키는 역할을 한다. 
	
	true에 !를 붙이면 false가 되고 false에 !를 붙이면 true가 된다.
 */
	public static void main(String[] args) {
		if (!true) {
				System.out.println(1);
		}
		if (!false) {
				System.out.println(2);
		}
		// false 앞에 !가 붙기 때문에 true로 되서 실행하면 2 가 출력된다
	}

}
