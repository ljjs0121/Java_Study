package OOP;
	/*
	 * 타입이 void 인 경우 return 생략 가능
	 * 			아닌 경우	return 생략 불가능
	 */
public class O_return {
		public static void main(String[] args) {
		MyMat mm = new MyMat();
		long result = mm.max(5, 3);
		mm.printgugudan(3);
	
		System.out.println("max(5L, 3L) = " + result);
	}
}

class MyMat {
		void printgugudan(int dan) {
		if (!(2<= dan && dan <= 9)) 
			return;			// 입력받은 단이 2~9가 아니면, 메소드 종료하고 돌아가기
		
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i); 
		}
		// return; 생략 가능
	}

		long max(int a, int b) { 
			if (a > b) 
				return a;
			else {
				return b;
			}
		}

}
