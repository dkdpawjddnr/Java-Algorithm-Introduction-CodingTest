package chapter04;

import java.util.HashMap;
import java.util.Scanner;

public class Ch04_04 {
	
	public int solution(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		int answer = 0;
		char[] arr = s.toCharArray();
		char[] arr2 = t.toCharArray();
		int lt = 0;
		for(int i = 0; i < t.length(); i++) {
			map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) +1);
		}
		
		for(int i = 0; i < t.length()-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
			if(map.equals(map2)) {
				answer++;
			}
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		return answer;
	}
	
	public int solution2(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < t.length()-1; i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) +1);
		}
		for(char c : t.toCharArray()) {
			map2.put(c , map2.getOrDefault(c, 0) +1);
		}
		
		int lt = 0;
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			map1.put(s.charAt(rt), map1.getOrDefault(s.charAt(rt), 0) +1);
			if(map1.equals(map2)) {
				answer++;
			}
			map1.put(s.charAt(lt), map1.get( s.charAt(lt))-1);
			
			if(map1.get(s.charAt(lt)) == 0) {
				map1.remove(s.charAt(lt));
			}
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Ch04_04 T = new Ch04_04();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(T.solution2(s, t));
	}

}
