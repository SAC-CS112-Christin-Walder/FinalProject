import java.util.Scanner;

public class Main 
{

	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		TicTacToe game = new TicTacToe();
		
		game.board();
		
		if (game.checkWin()) {
				System.out.println("WIN!"); }
		else if (game.full()) {
			System.out.println("DRAW"); }
		
	}
	
}