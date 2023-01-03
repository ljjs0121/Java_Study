package loop;

public class Continue {
	/*
	 * continue문
	 * 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
	 * 전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
	 */
	public static void main(String[] args) {
		// 예제
		for(int i=0;i <= 10; i++)	{
			if (i%3 == 0)
				continue;
			// i의 값이 3의 배수인 경우에 continue 넘어가서 결과값은 1 2 4 5 7 8 10
			System.out.println(i);
		}
	}

}
