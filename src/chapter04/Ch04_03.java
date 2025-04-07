package chapter04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ch04_03 {
	
	public ArrayList<Integer> solution1(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
			}
		
		answer.add(map.size());
		
		for(int rt = k; rt < n; rt++) {
			int key = arr[lt];
			
			if(map.containsKey(key)) {
				map.put(key,map.getOrDefault(key, 0) -1);
			}
			
			if(map.get(key) <= 0) {
				map.remove(key);
			}
			lt++;
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);

			answer.add(map.size());
		}
		
		
		return answer;
	}
	public ArrayList<Integer> solution2 (int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int i = 0; i < k -1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		
		for(int rt = k-1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
			answer.add(map.size());
			
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Ch04_03 T = new Ch04_03();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int a : T.solution2(n, k, arr)) {
			System.out.print(a + " ");
		}
	}

}
