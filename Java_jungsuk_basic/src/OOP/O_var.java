package OOP;

public class O_var {
	/*
	 * 클래스 변수와 인스턴스 변수
	 * 클래스 변수 - 공통 속성
	 * 인스턴스 변수 - 개별 속성
	 */
	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);
		// 클래스 변수는 객체생성없이 '클래스이름.클래스 변수'로 직접 사용 가능
		Card c1 = new Card();
		// 인스턴스 변수의 값을 변경
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("+ c1.width + ", " + c1.height +")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 ("+ c2.width + ", " + c2.height +")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		// 클래스 변수의 값을 변경
		//c1.width = 50;
		//c1.height = 80;
		/*
		 * 클래스 변수의 값을 참조변수를 사용해서 변수의 값을 변경하게 되면
		 * 인스턴스 변수의 값을 변경으로 착각하기 쉽기 때문에 클래스이름.클래스변수 를 사용하는게 좋다. 
		 */
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("+ c1.width + ", " + c1.height +")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 ("+ c2.width + ", " + c2.height +")");	
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
