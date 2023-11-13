package student;

public class Queen {
    private int row;
    private int column;

    public Queen(int row, int column) {
        super();
        this.row = row;
        this.column = column;
    }

    public void move() {
        // Enter your code here
        if (row != Node.N - 1) this.setRow(row++);
        else this.setRow(0);
    }

    /**
     * check whether this Queen can attack the given Queen (q)
     * @param q
     * @return  TRUE if conflict
     */
    public boolean isConflict(Queen q) {
        if (getRow() == q.getRow() || (Math.abs(getColumn() - q.getColumn()) == Math.abs(getRow() - q.getRow()))) return true;
        return false;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}
