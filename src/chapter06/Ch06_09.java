package chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_09 {
	public int count(int [] arr, int capacity) {
		int cnt = 1; // cnt = dvd 장수
		int sum = 0; // dvd에 담아내는  곡들의 합
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++; // dvd 장수 새로운 장
				sum = x;// 현재 녹음 되고 있는 cd의 용량 다시 sum 초기화
			} else {
				sum += x; // 누적
			}
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); 
		// 배열에서 stram 반복자를 이용해서 최대,최소,합 구할 수 있음
		// 자료구조를 탐색하기 위한 반복자
		// 리덕션 함수가 제공된다. 큰 데이터에서 의미있는 값을 뽑아오는 것을 리덕션
		// .getAsInt() max()는 리턴 값이 옵셔널인트라서 기본형 int형으로 바꿔줘야 함.
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt) /2; // mid = dvd 한장의 용량 capacity
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid-1;
			} else {
				lt = mid + 1;
				}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch06_09 T = new Ch06_09();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt(); // 장수
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}