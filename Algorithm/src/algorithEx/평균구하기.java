package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 평균구하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int A[] = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			sum += A[i];
		}   
		for(int i=0; i<N; i++) {
			if(max < A[i]) {
				max=A[i];
			}
		}
		System.out.println((sum * 100.0 /max)/N);
		
		
	}

}
