package lv.helloit.pieces;

public abstract class Figure  {
    protected boolean isWhite;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public abstract String toString();
}
