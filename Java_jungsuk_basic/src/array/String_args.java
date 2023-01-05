package array;
	
public class String_args {
		/*
		 * 커맨드 라인을 통해 입력받기 
		 *  화면을 통해 사용자로부터 값을 입력받을 수 있는 방법
		 */
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i< args.length; i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	// 이클립스에서 실행하려면
	// Run > Run Configuration..를 클릭
	// Arguments탭 클릭 > 'Program arguments'에 입력
	// 입력 후 Run
	}
	
}
