import java.util.Scanner;

public class MainTest {
	 public static void main(String[] args)  {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Player 1 name: ");
	        String player1Name = scanner.nextLine();
	        System.out.print("Enter Player 2 name: ");
	        String player2Name = scanner.nextLine();

	        Game game = new Game(player1Name, player2Name);

	        while (true) {
	            Player currentPlayer = game.getCurrentPlayer();
	            System.out.println(currentPlayer.getName() + "'s turn.");
	            System.out.print("Enter row and column (e.g., 0 1): ");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();
	            game.play(row, col);
	            displayBoard(game.getBoard());
	        }
	    }
	private static void displayBoard(Board board) {
	        Cell[][] cells = board.getCells();
	        System.out.println("Current Board:");
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                MarkType mark = cells[row][col].getMark();
	                String markSymbol = mark == MarkType.X ? "X" : (mark == MarkType.O ? "O" : " ");
	                System.out.print(" " + markSymbol + " ");
	                if (col < 2) {
	                    System.out.print("|");
	                }
	            }
	            System.out.println();
	            if (row < 2) {
	                System.out.println("-----------");
	            }
	        }
	        System.out.println();
	    }
	}


