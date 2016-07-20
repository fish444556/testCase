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
		char[][] tc1 = ts.testCase();
		
		Solution tt = new Solution();
		tt.solveSudoku(tc1);
//		int res = tt.calculate("1+ 1");
//		for (int i = 0; i < res.size(); i++) {
//			System.out.print(res.get(i) + "\t");
//		}
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				System.out.print(tc1[i][j]);				
			}
			System.out.println("");
		}
//		System.out.print(tc1);
	}
	
	
	
	
}

/**
 * 
 * @authors Jialin (fish444555@gmail.com)
 * @date 2016-07-18
 * @version $1.0$
 * @refer 
 * @problem 
 */



/**
 * 
 * @authors Jialin (fish444555@gmail.com)
 * @date 2016-07-19
 * @version $1.0$
 * @refer 
 * @problem 
 */


class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
        	return ;
        }
        helper(board);
        
    }

    private boolean helper(char[][] board) {
    	for (int i = 0; i < 9; i++) {
        	for (int j = 0; j < 9; j++) {
        		if (board[i][j] == '.') {
        			// char ch = board[i][j];
        			for (char k = '1'; k <= '9'; k++) {
        				
        				if (isValid(board, i, j, k)) {
        					board[i][j] = k;
        					if (helper(board)) {
        						return true;
        					}
        					else {
        						board[i][j] = '.';        						
        					}
        						
        				}
        			}
        			// board[i][j] = ch;
        			return false;
        		}
        	}
        }
        return true;
    }

    private boolean isValid(char[][] board, int x, int y, char ch) {
    	// boolean[] used = new boolean[9];
    	for (int i = 0; i < 9; i++) {
    		if (board[i][y] == ch) {
    			return false;
    		}
    	}
    	for (int i = 0; i < 9; i++) {
    		if (board[x][i] == ch) {
    			return false;
    		}
    	}
    	for (int i = x / 3 * 3; i < x / 3 * 3 + 3; i++) {
    		for (int j = y / 3 * 3; j < y / 3 * 3 + 3; j++) {
				if (board[i][j] == ch) {
					return false;
				}
    		}
    	}
    	return true;
    }
}


