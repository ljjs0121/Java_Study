package 생활코딩;
// ## 중첩
public class If_ex4 extends If {
	public class Main {
		public static void main(String[] args) {
				String id = args[0];      
				String password = args[1];
				if(id.equals("jins")) {
					if (password.equals("123456")) {
							System.out.println("right");
					} else {
							System.out.println("wrong");
					}
					
				} else {
					System.out.println("wrong");
				}
				/* id 와 password 의 입력값이 둘다 일치해야 "right" 출력
				   예를들어 id 입력값이 "jins" password 입력값이 "1234" 라면 출력값은 "wrong"
				   */
			}

		}
}