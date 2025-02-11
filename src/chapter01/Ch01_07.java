package chapter01;

import java.util.Scanner;

public class Ch01_07 {
	
	public String solution(String str) {
		
		String answer = "YES";
		int len = str.length();
		
		str = str.toUpperCase();
		for(int i = 0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return "NO";
			}
		}
		return answer;
	}
	public String solution2(String str) {
		String answer = "NO";
		StringBuilder sb = new StringBuilder(str);
		String str2 = sb.reverse().toString();
		if(str.equalsIgnoreCase(str2)) {
			return "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		Ch01_07 T = new Ch01_07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution2(str));

	}

}
