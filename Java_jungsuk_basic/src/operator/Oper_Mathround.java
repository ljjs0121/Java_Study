package operator;

public class Oper_Mathround {
	/*
	 * 반올림
	 */
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortpi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortpi);
		/*
		 * Math.round(pi * 1000) / 1000.0
		 * > Math.round(3.1415292 * 1000) / 1000.0
		 * > Math.round(3141.5292) / 1000.0
		 * > 3142 / 1000.0
		 * > 3.142
		 */
		// 1000.0 이 아닌 1000으로 나누었으면 값은 3.142가 아닌 3이 된다.
		// int와 int의 나눗셈 결과는 int 이기 때문이다.
		
		/*
		 * 3.141의 값을 얻으려면?
		 */
		double shortpi1 = (int)(pi*1000)/1000.0;
		System.out.println(shortpi1);
		// int로 형변환 후 1000.0으로 나누면 3.141의 값을 얻을 수 있다.
	}

}
