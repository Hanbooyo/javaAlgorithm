package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합2_Fixed {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //행 열 갯수
		int Q = Integer.parseInt(st.nextToken()); //케이스 갯수
		int[][] S = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//구간 합 배열 만들기
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + S[i][j];
			}
		}
		
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine()); // 테스트케이스 열 읽어오기
			int[] T = new int[4]; // Test Case 배열
			int sum=0;
			for(int j=0; j<4; j++) {
				T[j] = Integer.parseInt(st.nextToken()); //테스트 케이스 시작점 2개, 끝점 2개 담는 배열
			}
			int result = D[T[2]][T[3]] - D[(T[0]-1)][T[3]] - D[T[2]][(T[1]-1)] + D[(T[0]-1)][(T[1]-1)] ;
			System.out.println(result);
		}
		
	}

}
