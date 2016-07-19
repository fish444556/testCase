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

		testTree tet = new testTree();
		
		
		Solution tt = new Solution();
		int res = tt.kthSmallest(tet.tmpTree(), 4);
//		int res = tt.calculate("1+ 1");
//		for (int i = 0; i < res.size(); i++) {
//			System.out.print(res.get(i) + "\t");
//		}
		
		System.out.print(res);
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
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
    	num = k;
        return preOrder(root, --num).val;
    }

    private int num;
    private TreeNode preOrder(TreeNode root, int k) {
    	if (root == null ) {
        	return root;
        }
        TreeNode left = null, right = null;
        if (root.left != null) {
        	left = preOrder(root.left, --num);
        }
        if ( num == 0) {
        	return left;
        }
        if (root.right != null) {
	        right = preOrder(root.right, --num);
	    }
        return left != null ? left : right;
    }
}
