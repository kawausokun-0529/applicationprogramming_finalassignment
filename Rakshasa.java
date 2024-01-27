import java.util.ArrayList;

public class Rakshasa extends Piece{
    public Rakshasa(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 125;
        this.position = new Coordinate(x, y);
    }

    ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
            case 1:
                while(canMoveInDirection(board, xCo-1, yCo)){
                    if(board.getPiece(xCo-1, yCo) != null){
                        possibleMoves.add(new Coordinate(xCo-1, yCo));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                    xCo = xCo - 1;
                }
                xCo = position.getX();
                while(canMoveInDirection(board, xCo+1, yCo)){
                    if(board.getPiece(xCo+1, yCo) != null){
                        possibleMoves.add(new Coordinate(xCo+1, yCo));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                    xCo = xCo + 1;
                }
                xCo = position.getX();
                while(canMoveInDirection(board, xCo, yCo+1)){
                    if(board.getPiece(xCo, yCo+1) != null){
                        possibleMoves.add(new Coordinate(xCo, yCo+1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                    yCo = yCo + 1;
                }
                yCo = position.getY();
                while(canMoveInDirection(board, xCo, yCo-1)){
                    if(board.getPiece(xCo, yCo-1) != null){
                        possibleMoves.add(new Coordinate(xCo, yCo-1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                    yCo = yCo - 1;
                }
                yCo = position.getY();
                break;
        }

        return possibleMoves;
    }
}
