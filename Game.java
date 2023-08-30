
public class Game {
	  private Player[] players;
	    private Board board;
	    private Player currentPlayer;

	    public Game(String player1Name, String player2Name) {
	        players = new Player[2];
	        players[0] = new Player(player1Name, MarkType.X);
	        players[1] = new Player(player2Name, MarkType.O);

	        board = new Board();
	        currentPlayer = players[0];
	    }

	    public void play(int row, int col)  {
	        if (board.isBoardFull()) {
	            System.out.println("It's a draw!");
	            System.exit(0);
	        } else if (!board.getCells()[row][col].isEmpty()) {
	            System.out.println("Cell already occupied. Try again.");
	        } else {
	            board.setCellMark(row, col, currentPlayer.getMark());
	            if (board.checkForWin(currentPlayer.getMark())) {
	                System.out.println(currentPlayer.getName() + " wins!");
	                System.exit(0);
	            }
	            switchPlayer();
	        }
	    }

	    public void switchPlayer() {
	        currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
	    }

	    public Player getCurrentPlayer() {
	        return currentPlayer;
	    }

	    public Board getBoard() {
	        return board;
	    }
	}

	
