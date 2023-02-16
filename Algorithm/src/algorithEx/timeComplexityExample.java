package algorithEx;

public class timeComplexityExample {
	public static void main(String[] args) {
        // 1~100 사이 값 랜덤 선택
        int findNumber = (int)(Math.random() * 100);
        for(int i = 0; i < 100; i++) {
    	  if(i == findNumber) {
          	System.out.println(i);
            break;
            
            
           // 빅-오메가의 시간 복잡도는 1번
           // 빅-세타 기준 N/2번
           // 빅-오 표기법은 N번

           //  - 코딩테스트 에서는 빅-오 표기법을 기준으-로 수행시간을 계산하는게 좋다.
          }
      }
    }
}