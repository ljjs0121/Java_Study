package fuction;

public class If_ex3 extends If {
		public static void main(String[] args) {
				String id = args[0];      //  args[0] < 입력값
				if(id.equals("jins")) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}

			}

		}
		/* 
		   	id.equals("jins") 
		>> id 와 equals뒤에 있는 값("jins")이 true > right 출력, false > wrong 출력
		 	## 입력값 전달하는 방법
		 	Run 옆에 버튼 > Run Configurations.. 버튼 > New launch configuration 버튼 > 
		 	Arguments 탭에서 입력값 입력하고 출력
		 */
