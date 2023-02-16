package algorithEx;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 입력값을 String 변수 sNum 에 저장한 후 char[] 형 변수로 변환
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0; 
		for(int i=0; i<N; i++) {
			sum += cNum[i] - '0';  //문자 '0'의 아스키코드는 48이고, 문자 '9'의 아스키코드는 57이죠. 하나씩 커지는 셈입니다.
								   // 즉, 다음처럼 아스키 코드를 이용해서 연산을 해버리면 char를 Int로 변환한 것과 동일한 결과가 나오게 되죠.
//			sum += Character.getNumericValue(cNum[i]); 		//Character.getNumeicValue() 를 이용한 방법
		}
		System.out.println(sum);
	}

}
