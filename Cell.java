
public class Cell {
	private MarkType mark;

    public Cell() {
        mark = MarkType.Empty;
    }

    public boolean isEmpty() {
        return mark == MarkType.Empty;
    }

    public MarkType getMark() {
        return mark;
    }

    public void setMark(MarkType mark)
    {
     
        this.mark = mark;
    }

}
