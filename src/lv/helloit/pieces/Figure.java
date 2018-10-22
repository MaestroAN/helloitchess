package lv.helloit.pieces;

public class Figure {
    protected boolean isWhite;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public String toString() {
        throw new AbstractMethodError();
    }
}
