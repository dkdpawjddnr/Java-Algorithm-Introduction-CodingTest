package chapter05;

import java.util.Scanner;
import java.util.Stack;

public class Ch05_03 {
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int move : moves) {
			int col = move -1;
			
			for(int row = 0; row < board.length; row++) {
				
				if(board[row][col] != 0) {
					int pick = board[row][col];
					board[row][col] = 0;
					
					if(!stack.isEmpty() && stack.peek() == pick){
						stack.pop();
						answer += 2;
					} else {
						stack.push(pick);
					}
					
					break;
				}
				
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ch05_03 T = new Ch05_03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int m = sc.nextInt();
		int[] moves = new int [m];
	
		for(int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}

		System.out.println(T.solution(board, moves));
	}
}
