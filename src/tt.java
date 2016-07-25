import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class tt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3,4};
		
//		int[] nums = { 21,2,6,5,0,3};
		String s1 = "I am a bad boy";
		String s2 = "gxybakbkabbfmbnnnjjjyxqg";
		int[][] mat = {{-3}, {-7}};
		
		
		String[] s3 = {"aba","baa","bab","aaab","aaa","aaaa","aaba"};
//		int[][] position = {{0,2},{1,2},{2,0}};
		int[][] position = {{0,1}};
		// int[][] position = {{5,4},{6,1},{6,7},{2,3}};

		Random rand = new Random();
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = rand.nextInt((20) ) - 5;
//			System.out.print(nums[i] + "\t");
//		}
//		char[][] board = {	{'o', 'a', 'a', 'n'}, 
//							{'e', 't', 'a', 'e'},
//							{'i', 'h', 'k', 'r'},
//							{'i', 'f', 'l', 'v'}};

		testSudoku ts = new testSudoku();
		
		Solution tt = new Solution();
		char[][] tc1 = ts.testCase();
		boolean res = tt.isValidSudoku(tc1);
//		int res = tt.calculate("1+ 1");
//		for (int i = 0; i < res.size(); i++) {
//			System.out.print(res.get(i) + "\t");
//		}
//		for(int i=0; i<9; i++){
//			for(int j=0; j<9; j++){
//				System.out.print(tc1[i][j]);				
//			}
//			System.out.println("");
//		}
		System.out.print(res);
	}
	
	
	
	
}



class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
        	return true;
        }

        int m = board.length;
        boolean[] used = new boolean[m];

        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < m; j++) {
        		if (board[i][j] != '.') {
		        	if (used[board[i][j] - '1']) {
		        		return false;
		        	}
		        	else {
		        		used[board[i][j] - '1'] = true;
		        	}
        		}
        	}
        	Arrays.fill(used, false);
        }

        Arrays.fill(used, false);
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < m; j++) {
        		if (board[j][i] != '.') {
		        	if (used[board[j][i] - '1']) {
		        		return false;
		        	}
		        	else {
		        		used[board[j][i] - '1'] = true;
		        	}
		        }
        	}
        	Arrays.fill(used, false);
        }
        Arrays.fill(used, false);

        for (int i = 0; i < m; i += 3) {
        	for (int j = 0; j < m; j += 3) {
	        	for (int ii = i / 3 * 3; ii < i / 3 * 3 + 3; ii++) {
	        		for (int jj = j / 3 * 3; jj < j / 3 * 3 + 3; jj++) {
	        			if (board[ii][jj] != '.') {
		        			if (used[board[ii][jj] - '1']) {
				        		return false;
				        	}
				        	else {
				        		used[board[ii][jj] - '1'] = true;
				        	}
		        		}
		        	}
	        	}
	        	Arrays.fill(used, false);
	        }
        	
        }
        return true;
    }
}
