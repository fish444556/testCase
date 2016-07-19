import java.util.ArrayList;
import java.util.List;


public class testTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTree tt = new testTree();
		TreeNode res = tt.BST();
		tt.displayTree(res, 0);
	}
	
	public TreeNode tmpTree() {
		TreeNode root = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		root.right = t4;
		root.left = t1;
		t1.right = t2;
		return root;
	}

	public TreeNode normalTree() {
		// preOrder 3->4->5->7->9->20->8
		// inOrder 4->3->9->7->20->5->8
		// postOrder 4->9->20->7->8->5->3
		TreeNode root = new TreeNode(3);
//		TreeNode t4 = new TreeNode(4);
//		TreeNode t5 = new TreeNode(5);
//		root.left = t4;
//		root.right = t5;

//		TreeNode t7 = new TreeNode(7);
//		TreeNode t8 = new TreeNode(8);
//		t5.left = t7;
//		t5.right = t8;
//		t4.left = t7;
//		t4.right = t8;

//		TreeNode t9 = new TreeNode(9);
//		TreeNode t20 = new TreeNode(20);
//		t7.left = t9;
//		t7.right = t20;

		return root;
	}

	public TreeNode BST() {
		TreeNode root = new TreeNode(10);
		TreeNode t5 = new TreeNode(5);
		TreeNode t20 = new TreeNode(20);
		root.left = t5;
		root.right = t20;

		TreeNode t3 = new TreeNode(3);
		TreeNode t8 = new TreeNode(8);
		t5.left = t3;
		t5.right = t8;
		
		
		TreeNode t28 = new TreeNode(28);
		t8.right = t28;
		TreeNode t38 = new TreeNode(38);
		t28.right = t38;

		TreeNode t15 = new TreeNode(15);
		TreeNode t30 = new TreeNode(30);
		t20.left = t15;
		t20.right = t30;

		TreeNode t25 = new TreeNode(25);
		t30.left = t25;

		return root;
	}
	
	public TreeLinkNode completeTree(){
//		{0,1,2,3,4,5,6}
		TreeLinkNode root = new TreeLinkNode(0);
		TreeLinkNode t1 = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		root.left = t1;
		root.right = t2;

		TreeLinkNode t3 = new TreeLinkNode(3);
		TreeLinkNode t4 = new TreeLinkNode(4);
		t1.left = t3;
		t1.right = t4;

		TreeLinkNode t5 = new TreeLinkNode(5);
		TreeLinkNode t6 = new TreeLinkNode(6);
		t2.left = t5;
		t2.right = t6;

		return root;
		
	}

	void displayTree(TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		List<List<Integer>> res = traversalByLevel(root);
		String gap = "";
		String newLineGap = "";
		for (int i=0; i<res.size(); i++) {
			System.out.print(gap);
			for (int j=0; j<res.get(i).size(); j++) {
				if(res.get(i).get(j) == 0){
					newLineGap += " ";
					System.out.print("  ");
				}
				else{
					System.out.print(res.get(i).get(j) + "   ");
				}
				
			}
			gap = newLineGap;
			newLineGap = "";
			System.out.println("");
		}
	}

	private List<List<Integer>> traversalByLevel(TreeNode root){
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}
		traversalByLevel(root, res, 0);
		return res; 
	}

	private void traversalByLevel(TreeNode root, List<List<Integer>> res, int depth){

		if (depth >= res.size()) {
			List<Integer> tmp = new ArrayList<Integer>();
			res.add(tmp);
		}
		List<Integer> cur = res.get(depth);
		if (root == null) {
			cur.add(0);
			return ;	
		}
		cur.add(root.val);
		traversalByLevel(root.left, res, depth+1);
		traversalByLevel(root.right, res, depth+1);
	}
	
	

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){val = x;}
}

class TreeLinkNode{
	int val;
	TreeLinkNode left;
	TreeLinkNode right;
	TreeLinkNode next;
	TreeLinkNode(int x){val = x;}
}
