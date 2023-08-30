import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
    Board board;
    @BeforeEach
   void init() {
	   board=new Board();
   }
	@Test
	void testIsBoardFull()  {
		assertFalse(board.isBoardFull());
		MarkType mark=MarkType.X;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				board.setCellMark(i, j,MarkType.X);
		
			}
			
		}
		assertTrue(board.isBoardFull());
		
	}
	@Test
	void testSetCellMark() {
		board.setCellMark(0, 2,MarkType.X);
		Cell[][] cells=board.getCells();
		assertEquals(MarkType.X, cells[0][2].getMark());
		
		
		
	}
	   
	
	

}
