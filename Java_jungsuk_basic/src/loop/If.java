package loop;

public class If {
	/*
	 *  if 문 예제
	 */
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d일 때, 참인것은%n", x);
		if(x == 0) System.out.println("x == 0");
		if(x != 0) System.out.println("x != 0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d일 때, 참인 것은%n", x);
		
		if(x == 0) System.out.println("x == 0");
		if(x != 0) System.out.println("x != 0");
		if(!(x == 0)) System.out.println("!(x == 0)");
		if(!(x != 0)) System.out.println("!(x != 0)");
	}

}
