package chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch01_04 {
	public ArrayList<String> solution(int x, String[] str){
		
		ArrayList<String> answer = new ArrayList<>();
		/* for(String s : str) {
			String tmp = new StringBuilder(s).reverse().toString();
			answer.add(tmp);
		}	*/ 
		for(String s : str) {
			char[] c = s.toCharArray();
			int lt = 0;
			int rt = s.length()-1;
			while(lt<rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(c);
			answer.add(tmp);
 		}
		return answer;
	}
	
	

	public static void main(String[] args) {
		Ch01_04 T = new Ch01_04();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strArray = new String[n]; 
		
		for(int x = 0; x < n; x ++) {
			strArray[x] = sc.next();
		}
		
		for(String x : T.solution(n, strArray) ) {
			System.out.println(x);
		}
	}
}
