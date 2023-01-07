package OOP;

public class O_method {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5 , 3);
		long result0 = mm.min(5, 3);
		long result1 = mm.add(5L, 3L);		
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		
		System.out.println("max(5, 3) = " + result);
		System.out.println("min(5, 3) = " + result0);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}

}

class MyMath {
	
	long add(long a, long b) {
		long result = a + b;
		return result;
	/* result 에 a + b 값을 넣어서 return을 하거나 a + b 값을 바로 return하거나 똑같기 때문에 
		위의 두줄을 밑에와 같이 한 줄로 간단히 할 수 있다. */ 
//		return a + b;
	}
	/* 두 값을 받아서 둘중에 큰 값을 반환하시오 */
	long max(long a, long b) {
//		long result = 0;
//		if (a>b) {
//			result = a;
//		} else {
//			result = b;
//		}
//		return result;
		/*
		 * 위 조건식을 삼항연산자로 바꾸면
		 */
		// long result = 0;
		// result = a > b ? a : b;
		// return result;
		 return a > b ? a : b;
	}
	// 두 값을 받아서 둘 중에 작은 값을 반환하시오 
	long min(long a, long b) {
		return a < b ? a : b;
	}
	// 두 값을 받아서 둘중에 작은 값을 반환하시오
//	long min(long a, long b) {
//		return a < b ? a : b;
//	}
	long subtract(long a, long b) {return a - b; }
	long multiply(long a, long b) {return a * b; }
	double divide(double a, double b) {return a / b;}
	
	}
