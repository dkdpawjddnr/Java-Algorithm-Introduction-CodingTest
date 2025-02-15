package chapter01;

import java.util.Scanner;

public class Ch01_11 {
	
	public String solution(String s) {
		String answer = "";
		int count = 1;
		s = s + " ";
		
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count ++;
			} else {
				answer += s.charAt(i);
				if(count >1) {
					answer += String.valueOf(count);
					count = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Ch01_11 T = new Ch01_11();
		System.out.print(T.solution(s));
	}
}
