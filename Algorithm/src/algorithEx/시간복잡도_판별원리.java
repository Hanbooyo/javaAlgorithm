package algorithEx;

public class 시간복잡도_판별원리 {

	public static void main(String[] args) {
//		int N = 100000;
//		int cnt = 0;
//		for(int i=0; i<N; i++) {
//			System.out.println("�뿰�궛 �슏�닔 : " + cnt++);
//		}
		int N = 100000;
		int cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
			System.out.println("�뿰�궛 �슏�닔 : " + cnt++);
			}
		}
		// �떆媛꾨났�옟�룄 N짼
	}

}
