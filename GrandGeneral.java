import java.util.ArrayList;

public class GrandGeneral extends Piece{
    public GrandGeneral(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 75;
        this.pieceRank = 4;
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
                while(canMoveInDirection(board, xCo, yCo+1)){
                    if(board.getPiece(xCo, yCo+1) != null){
                        possibleMoves.add(new Coordinate(xCo, yCo+1));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                    yCo = yCo + 1;
                }
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
                if(canMoveInDirection(board, xCo, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                if(canMoveInDirection(board, xCo, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                }
                if(canMoveInDirection(board, xCo, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo, yCo+2));
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
                if(canMoveInDirection(board, xCo+2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo+2));
                }
                if(canMoveInDirection(board, xCo+1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                }
                if(canMoveInDirection(board, xCo+1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                }
                if(canMoveInDirection(board, xCo+2, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo-2));
                }
                if(canMoveInDirection(board, xCo, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                if(canMoveInDirection(board, xCo, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                break;
        }

        return possibleMoves;
    }
}
