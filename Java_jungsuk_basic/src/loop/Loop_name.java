package loop;

public class Loop_name {
	/*
	 * 이름 붙은 반복문
	 * 사용은 드물다. 이렇게 사용이 가능하다 라고만 알고 있자.
	 */
	public static void main(String[] args) {
		Loop1 :
			for (int i =2; i <= 9; i++ ) {
				for (int j= 1; j <= 9; j++) {
					if (j==6)
						break Loop1;
//						break; 
//						continue Loop1;
//						continue;
						System.out.println(i+" * "+j+" = "+(i*j));
				} 
				System.out.println();
			}
	}

}
