package algorithEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //�뻾 �뿴 媛��닔
		int Q = Integer.parseInt(st.nextToken()); //耳��씠�뒪 媛��닔
		int[][] S = new int[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine()); // �뀒�뒪�듃耳��씠�뒪 �뿴 �씫�뼱�삤湲�
			int[] T = new int[4]; // Test Case 諛곗뿴
			int sum=0;
			for(int j=0; j<4; j++) {
				T[j] = Integer.parseInt(st.nextToken()); //�뀒�뒪�듃 耳��씠�뒪 �떆�옉�젏 2媛�, �걹�젏 2媛� �떞�뒗 諛곗뿴
			}
			for(int s=T[0]; s<=T[2]; s++) {
				for(int e=T[1]; e<=T[3]; e++) {
					sum += S[s-1][e-1];
				}
			}
			System.out.println(sum);
		}
	}
	//�떆媛꾩큹怨�
}
