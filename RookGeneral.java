import java.util.ArrayList;

public class RookGeneral extends Piece{
    public RookGeneral(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 138;
        this.pieceRank = 2;
        this.position = new Coordinate(x, y);
    }

    ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();

        switch(owner){
            case 0:
            case 1:
                if(canMoveInDirection(board, xCo, yCo)){
                    possibleMoves.add(new Coordinate(xCo, yCo));
                }
        }

        return possibleMoves;
    }
}
