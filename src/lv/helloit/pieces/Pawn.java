package lv.helloit.pieces;

public class Pawn extends Figure {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String toString() {
        if (this.isWhite) {
            return "\u2659";
        } else {
            return "\u265F";
        }
    }
}
