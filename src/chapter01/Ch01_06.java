package chapter01;

import java.util.Scanner;

public class Ch01_06 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			} else {
				continue;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Ch01_06 T = new Ch01_06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
