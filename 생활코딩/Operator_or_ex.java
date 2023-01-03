package 생활코딩;

public class Operator_or_ex {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("jins") || id.equals("ljjs0121") || id.equals("hia"))
				&& password.equals("123456")) {
				System.out.println("right");
		} else {
				System.out.println("wrong");
		}
		// id 입력시 jins, ljjs0121, hia 셋 중 하나라도 일치할 시 right 출력
	}

}
