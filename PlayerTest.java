import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PlayerTest {
	 
	@Test

		public void testGetName() {
	        Player player = new Player("sai", MarkType.X);
	        assertEquals("sai", player.getName());
	    }

	    @Test
	    public void testGetMark() {
	        Player player = new Player("sunny", MarkType.O);
	        assertEquals(MarkType.O, player.getMark());
	    }
	}


