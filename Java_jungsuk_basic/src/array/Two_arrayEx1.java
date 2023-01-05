<<<<<<< HEAD
package array;
	
public class Two_arrayEx1 {
		/*
		 * 2차원 배열 예제 1		  
		 */
	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100},
				{ 20, 20, 20},
				{ 30, 30, 30},
				{ 40, 40, 40}
		};
		int sum = 0;
		/*  new int[4][3] > 4행 3열
		 	4행 > score.length
		 	3열 > score[i].length
		 	왠만하면 조건식에 상수를 적는 것보다 length를 적는것이 좋다.
		*/
		for (int i = 0; i < score.length; i++) { // score.length 의 값은 4
			for (int j = 0; j < score[i].length; j++) { // score[i].length 의 값은 3
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];		// sum = sum + score[i][j];		
			} // 이중 배열 for문 식은 외워야 한다.
		}
		System.out.println("sum = "+sum);
	}
	
}
=======
package array;
	
public class Two_arrayEx1 {
		/*
		 * 2차원 배열 예제 1		  
		 */
	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100},
				{ 20, 20, 20},
				{ 30, 30, 30},
				{ 40, 40, 40}
		};
		int sum = 0;
		/*  new int[4][3] > 4행 3열
		 	4행 > score.length
		 	3열 > score[i].length
		 	왠만하면 조건식에 상수를 적는 것보다 length를 적는것이 좋다.
		*/
		for (int i = 0; i < score.length; i++) { // score.length 의 값은 4
			for (int j = 0; j < score[i].length; j++) { // score[i].length 의 값은 3
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];		// sum = sum + score[i][j];		
			} // 이중 배열 for문 식은 외워야 한다.
		}
		System.out.println("sum = "+sum);
	}
	
}
>>>>>>> branch 'master' of https://github.com/ljjs0121/Java_Study.git
