package chapter01;

import java.util.Scanner;

public class Ch01_08 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			return "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		Ch01_08 T = new Ch01_08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}
}
