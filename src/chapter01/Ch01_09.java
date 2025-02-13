package chapter01;

import java.util.Scanner;

public class Ch01_09 {
	
	public int solution1(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x >= 48 && x<= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		return answer;
		
	}
	

	public static void main(String[] args) {
		
		Ch01_09 T = new Ch01_09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution2(str));
		

	}

}
