
public class Board {
	private Cell[][] cells;

    public Board() {
        cells = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin(MarkType mark) {
        for (int i = 0; i < 3; i++) {
            if (cells[i][0].getMark() == mark && cells[i][1].getMark() == mark && cells[i][2].getMark() == mark) {
                return true;
            }
            if (cells[0][i].getMark() == mark && cells[1][i].getMark() == mark && cells[2][i].getMark() == mark) {
                return true;
            }
        }
        if (cells[0][0].getMark() == mark && cells[1][1].getMark() == mark && cells[2][2].getMark() == mark) {
            return true;
        }
        if (cells[0][2].getMark() == mark && cells[1][1].getMark() == mark && cells[2][0].getMark() == mark) {
            return true;
        }
        return false;
    }

    public void setCellMark(int row, int col, MarkType mark)  {
    	
                	

        cells[row][col].setMark(mark);
    }

    public Cell[][] getCells() {
        return cells;
    }
}



