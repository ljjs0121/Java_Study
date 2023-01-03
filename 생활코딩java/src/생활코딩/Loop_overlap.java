package 생활코딩;

public class Loop_overlap {

	public static void main(String[] args) {
			for (int i = 0; i < 10; i++ ) { 						/* 1번 */
		    for ( int j = 0; j < 10; j++ ) { 						/* 2번 */
				System.out.println( i + "" + j );
			}
		/*
		  	  1번 for문 실행되고 출력으로 넘어가는데 2번 for문이 끝날때 까지 실행 그후 다시 1번 for문으로 반복 실행
			  따라서 실행 값은 1,2,3,4,5,6,7,8,9,10,11 ... 97,98,99
		 */
		}

	}

}