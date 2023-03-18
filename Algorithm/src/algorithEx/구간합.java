package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken()); // �뜲�씠�꽣�쓽 媛쒖닔
		int N = Integer.parseInt(st.nextToken()); // case�쓽 媛쒖닔
		
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
			int start = Integer.parseInt(st.nextToken()); // �떆�옉 �젏
			int end = Integer.parseInt(st.nextToken()); // �걹 �젏

			System.out.println(S[end] - S[start-1]);
		}
	}

}
