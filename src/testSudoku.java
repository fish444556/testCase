
public class testSudoku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public char[][] testCase() {
		char[][] case1_t = 
				{{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
				};
		
		char[][] case2_f =
				{{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
				 {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
				 {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
				 {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
				 {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
				 {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
				 {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
				 {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
				 {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
		
		char[][] case3_s = 
				{{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
				 {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
				 {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
				 {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
				 {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
				 {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
				 {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
				 {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
				 {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
		return case3_s;
	}

}
