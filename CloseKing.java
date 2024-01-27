import java.util.ArrayList;

public class CloseKing extends Piece{
    public CloseKing(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 32;
        this.position = new Coordinate(x, y);
    }

    ArrayList<Coordinate> getPossibleMoves(Surface board){
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
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo+i, yCo+j));
                        possibleMoves.add(new Coordinate(xCo+i, yCo+j));
                    }
                }
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo+i, yCo-j));
                        possibleMoves.add(new Coordinate(xCo+i, yCo-j));
                    }
                }
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo-i, yCo+j));
                        possibleMoves.add(new Coordinate(xCo-i, yCo+j));
                    }
                }
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo-i, yCo-j));
                        possibleMoves.add(new Coordinate(xCo-i, yCo-j));
                    }
                }
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
