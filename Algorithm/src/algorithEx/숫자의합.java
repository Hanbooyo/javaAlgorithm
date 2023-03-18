package algorithEx;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// �엯�젰媛믪쓣 String 蹂��닔 sNum �뿉 ���옣�븳 �썑 char[] �삎 蹂��닔濡� 蹂��솚
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0; 
		for(int i=0; i<N; i++) {
			sum += cNum[i] - '0';  //臾몄옄 '0'�쓽 �븘�뒪�궎肄붾뱶�뒗 48�씠怨�, 臾몄옄 '9'�쓽 �븘�뒪�궎肄붾뱶�뒗 57�씠二�. �븯�굹�뵫 而ㅼ��뒗 �뀍�엯�땲�떎.
								   // 利�, �떎�쓬泥섎읆 �븘�뒪�궎 肄붾뱶瑜� �씠�슜�빐�꽌 �뿰�궛�쓣 �빐踰꾨━硫� char瑜� Int濡� 蹂��솚�븳 寃껉낵 �룞�씪�븳 寃곌낵媛� �굹�삤寃� �릺二�.
//			sum += Character.getNumericValue(cNum[i]); 		//Character.getNumeicValue() 瑜� �씠�슜�븳 諛⑸쾿
		}
		System.out.println(sum);
	}

}
