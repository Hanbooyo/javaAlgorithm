package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //행 열 갯수
		int Q = Integer.parseInt(st.nextToken()); //케이스 갯수
		int[][] S = new int[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine()); // 테스트케이스 열 읽어오기
			int[] T = new int[4]; // Test Case 배열
			int sum=0;
			for(int j=0; j<4; j++) {
				T[j] = Integer.parseInt(st.nextToken()); //테스트 케이스 시작점 2개, 끝점 2개 담는 배열
			}
			for(int s=T[0]; s<=T[2]; s++) {
				for(int e=T[1]; e<=T[3]; e++) {
					sum += S[s-1][e-1];
				}
			}
			System.out.println(sum);
		}
	}
	//시간초과
}
