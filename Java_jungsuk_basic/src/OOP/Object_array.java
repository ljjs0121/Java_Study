package OOP;

public class Object_array {
	/*
	 * 객체배열
	 * 많은 수의 객체를 다뤄야할 때, 배열로 다루면 편하다.
	 */
	public static void main(String[] args) {
		Tv t1, t2, t3; 
		
		 Tv[] tvArr = new Tv[3];
		/* 객체 배열은 참조변수 배열이기 때문에 객체를 만들어서 배열에 넣어줘야 한다. 밑에 참고 */
		 
		 tvArr[0] = new Tv();		
		 tvArr[1] = new Tv();		
		 tvArr[2] = new Tv();
	
	//   >	Tv[] tvArr = { new Tv(), new Tv(), new Tv() };
	}

}
