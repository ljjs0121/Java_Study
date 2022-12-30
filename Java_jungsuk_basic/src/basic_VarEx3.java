
public class basic_VarEx3 {

	public static void main(String[] args) {
		System.out.println("풀이하기 전의 값");

		int x = 5;
		int y = 10;

		System.out.println("x =" + x);
		System.out.println("y =" + y);
		// x의 값을 y로 y의 값을 x로 교체할 수 있는 방법 ! 변수를 추가

		System.out.println("배운 내용으로 풀이");

		int tmp;
		tmp = x; // x > tmp
		x = y; // y > x
		y = tmp; // tmp > y

		System.out.println("x =" + x);
		System.out.println("y =" + y);

		// 간결하게 바꾸는 방법 ! 초기화
		System.out.println("간결한 방법");

		x = 10;
		y = 5;

		System.out.println("x =" + x);
		System.out.println("y =" + y);
	}

}
