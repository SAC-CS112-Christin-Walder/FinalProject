
public class TicTacToe {

	private char[][] board;
	private char player;
	
	public TicTacToe() {
			board = new char[3][3];
			player='x';
			initialize();
	}
	
	public void initialize() {
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				board[i][j]='-';
			}
		}
	}
	
	public void board() {
		System.out.println("-------------");
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	public boolean full() {
		boolean fullBoard = true;
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<3; j++) {
				if (board[i][j] == '-') {
					fullBoard = false;
				}
			}
		}
		
		return fullBoard;
	}
	
	private boolean checkBoard(char c1, char c2, char c3) {
		return ((c1 != '-')&&(c1==c2)&&(c2==c3));
	}
	
	private boolean checkRows() {
		for (int i=0; i<3; i++) {
				if (checkBoard(board[0][i], board[1][i], board[2][i])==true) 
						{ return true; }
		}
		
		return false;
	}
	
	private boolean checkColumns() {
			for (int i=0; i<3; i++) {
				if (checkBoard(board[0][i], board[1][i], board[2][i])==true)
						{ return true; }
			}
			return false;
	}
	
	private boolean checkDiagonals() {
		return ((checkBoard(board[0][0], board[1][1], board[2][2])==true) 
				|| (checkBoard(board[0][2], board[1][1], board[2][0])==true));
	}
	
	public boolean checkWin() {
			return (checkRows() || checkColumns() || checkDiagonals());
	}
		
		
}
