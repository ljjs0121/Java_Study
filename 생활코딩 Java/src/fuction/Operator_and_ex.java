package fuction;

public class Operator_and_ex {
	
	public static void main(String[] args) {
		String id = args[0];      
		String password = args[1];
		if(id.equals("jins")) {
			if (password.equals("123456")) {
					System.out.println("right");
			} else {
					System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}
	}
	/* 위의 예제를 && 를 활용 */
		public static void main1(String[] args) {
		String id = args[0];      
		String password = args[1];
		if(id.equals("jins") && password.equals("123456")) {
					System.out.println("right");
		} else {
					System.out.println("wrong");
		}	
		// id 값("jins") 과 password 값("123456") 이 일치했을 경우 "right" 실행
	}
}
