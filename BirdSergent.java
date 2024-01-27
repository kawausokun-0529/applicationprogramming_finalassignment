import java.util.ArrayList;

public class BirdSergent extends Piece{
    public BirdSergent(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        pieceID = 10;
        this.position = new Coordinate(x, y);
    }

    ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
            case 1:
                while(canMoveInDirection(board, xCo-1, yCo-1)){
                    if(board.getPiece(xCo-1, yCo-1) != null){
                        possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                    xCo = xCo - 1;
                    yCo = yCo - 1;
                }
                xCo = position.getX();
                yCo = position.getY();
                while(canMoveInDirection(board, xCo+1, yCo-1)){
                    if(board.getPiece(xCo+1, yCo-1) != null){
                        possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                    xCo = xCo + 1;
                    yCo = yCo - 1;
                }
                xCo = position.getX();
                yCo = position.getY();
                while(canMoveInDirection(board, xCo+1, yCo+1)){
                    if(board.getPiece(xCo+1, yCo+1) != null){
                        possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                    xCo = xCo + 1;
                    yCo = yCo + 1;
                }
                xCo = position.getX();
                yCo = position.getY();
                while(canMoveInDirection(board, xCo-1, yCo+1)){
                    if(board.getPiece(xCo-1, yCo+1) != null){
                        possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                    xCo = xCo - 1;
                    yCo = yCo + 1;
                }
                xCo = position.getX();
                yCo = position.getY();
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
                if(canMoveInDirection(board, xCo+1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                }
                if(canMoveInDirection(board, xCo+1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                }
                if(canMoveInDirection(board, xCo, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                }
                if(canMoveInDirection(board, xCo-1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                }
                if(canMoveInDirection(board, xCo-1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                }
                if(canMoveInDirection(board, xCo-1, yCo)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                }
        }

        return possibleMoves;
    }
}
