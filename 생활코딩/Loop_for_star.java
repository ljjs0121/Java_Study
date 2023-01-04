package 생활코딩;

public class Loop_for_star {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
