package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합2_Fixed {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //�뻾 �뿴 媛��닔
		int Q = Integer.parseInt(st.nextToken()); //耳��씠�뒪 媛��닔
		int[][] S = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//援ш컙 �빀 諛곗뿴 留뚮뱾湲�
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + S[i][j];
			}
		}
		
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine()); // �뀒�뒪�듃耳��씠�뒪 �뿴 �씫�뼱�삤湲�
			int[] T = new int[4]; // Test Case 諛곗뿴
			int sum=0;
			for(int j=0; j<4; j++) {
				T[j] = Integer.parseInt(st.nextToken()); //�뀒�뒪�듃 耳��씠�뒪 �떆�옉�젏 2媛�, �걹�젏 2媛� �떞�뒗 諛곗뿴
			}
			int result = D[T[2]][T[3]] - D[(T[0]-1)][T[3]] - D[T[2]][(T[1]-1)] + D[(T[0]-1)][(T[1]-1)] ;
			System.out.println(result);
		}
		
	}

}
