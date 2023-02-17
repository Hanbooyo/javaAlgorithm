package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken()); // 데이터의 개수
		int N = Integer.parseInt(st.nextToken()); // case의 개수
		
		st = new StringTokenizer(br.readLine());
//		int A[] = new int[D];
//		for(int i=0; i<D; i++) {
//			A[i] = Integer.parseInt(st.nextToken());
//		}
		long[] S = new long[D+1];
		for(int i=1; i<= D; i++) { 
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<N; j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()); // 시작 점
			int end = Integer.parseInt(st.nextToken()); // 끝 점

			System.out.println(S[end] - S[start-1]);
		}
	}

}
