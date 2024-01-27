import java.util.ArrayList;

public class Knight extends Piece{
    public Knight(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 90;
        this.position = new Coordinate(x, y);
    }
    
    ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
                if(canMoveInDirection(board, xCo+2, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo+1));
                }
                if(canMoveInDirection(board, xCo+2, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo-1));
                }
                break;
            case 1:
                if(canMoveInDirection(board, xCo-2, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo+1));
                }
                if(canMoveInDirection(board, xCo-2, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo-1));
                }
                break;
        }

        return possibleMoves;
    }

    public ArrayList<Coordinate> promote(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
            case 1:
                if(canMoveInDirection(board, xCo+1, yCo)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                }
                if(canMoveInDirection(board, xCo+2, yCo)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo));
                }
                if(canMoveInDirection(board, xCo-1, yCo)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                }
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
