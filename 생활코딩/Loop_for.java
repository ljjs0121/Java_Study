package 생활코딩;

public class Loop_for {
/*
 	 while문을 보면 반복의 횟수를 지정하기 위해서 while문 외부에 변수 i의 값을 초기화하고, while문  안에서 i의 값을 증가시키고 있다. 
 	 이것은 코드를 산만하게 할 수 있다. 
 	 for문은 특정한 횟수만큼 반복 실행을 하는 경우에 자주 사용된다. 
 	 
 */
	public static void main(String[] args) {
		/*  for문 형식 
		 * for(초기화; 종료조건; 반복실행) {
			반복적으로 실행될 구문 
			} 
		*/
		for (int  i = 0;  i < 10;  i++)  {
			System.out.println("Coding Everybody" + i);
		}
	}

}
