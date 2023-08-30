import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	 Game game;
	    @BeforeEach
	   void init() {
		   game=new Game("player1","player2");
	   }

	@Test
	void testPlayAndSwitchPlayer() {
		Player currentPlayer=game.getCurrentPlayer();
		assertEquals("player1",currentPlayer.getName());
		game.play(0, 0);
		currentPlayer=game.getCurrentPlayer();
		assertEquals("player2",currentPlayer.getName());
		
	
	}
	
	@Test
	public void testPlayValidMove() {
	    Player currentPlayer=game.getCurrentPlayer();
	    game.play(0, 0);
	    Player newPlayer=game.getCurrentPlayer();
	    assertNotEquals(currentPlayer, newPlayer);
	    assertFalse(game.getBoard().getCells()[0][0].isEmpty());
	    
	}

	@Test
	public void testPlayOccupiedMove(){
	    game.getBoard().setCellMark(0, 0, MarkType.X);
	    Player currentPlayer=game.getCurrentPlayer();
	    game.play(0, 0);
	    Player newPlayer=game.getCurrentPlayer();
	    assertEquals(currentPlayer,newPlayer);
	    
	}

	@Test
	public void testWinningMove()  {
		game.getBoard().setCellMark(0, 0, MarkType.X);
        game.getBoard().setCellMark(0, 1, MarkType.X);
        game.getBoard().setCellMark(0, 2, MarkType.X);
        Player currentPlayer = game.getCurrentPlayer();
        assertEquals(currentPlayer, game.getCurrentPlayer()); 
 
}
	 @Test
	    public void testDrawCondition() {
	        game.getBoard().setCellMark(0, 0, MarkType.X);
	        game.getBoard().setCellMark(0, 1, MarkType.O);
	        game.getBoard().setCellMark(0, 2, MarkType.X);
	        game.getBoard().setCellMark(1, 0, MarkType.O);
	        game.getBoard().setCellMark(1, 1, MarkType.X);
	        game.getBoard().setCellMark(1, 2, MarkType.O);
	        game.getBoard().setCellMark(2, 0, MarkType.O);
	        game.getBoard().setCellMark(2, 1, MarkType.X);
	        game.getBoard().setCellMark(2, 2, MarkType.O);
	        assertFalse(game.getBoard().checkForWin(MarkType.X));
	        assertFalse(game.getBoard().checkForWin(MarkType.O));
	        assertTrue(game.getBoard().isBoardFull());
	        Player currentPlayer = game.getCurrentPlayer();
	        assertEquals(currentPlayer, game.getCurrentPlayer());
	    }
		
}