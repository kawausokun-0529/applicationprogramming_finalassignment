import java.util.ArrayList;

public class KnightWarrior extends Piece{
    public KnightWarrior(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 91;
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
                if(canMoveInDirection(board, xCo+1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                }
                if(canMoveInDirection(board, xCo+1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                if(canMoveInDirection(board, xCo, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo, yCo+2));
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
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo+i, yCo-j));
                        possibleMoves.add(new Coordinate(xCo+i, yCo-j));
                    }
                } 
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo+i, yCo+j));
                        possibleMoves.add(new Coordinate(xCo+i, yCo+j));
                    }
                } 
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=5; j++){
                        if(canMoveInDirection(board, xCo, yCo+j));
                        possibleMoves.add(new Coordinate(xCo, yCo+j));
                    }
                } 
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=5; j++){
                        if(canMoveInDirection(board, xCo, yCo-j));
                        possibleMoves.add(new Coordinate(xCo, yCo-j));
                    }
                } 
                if(canMoveInDirection(board, xCo-1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                }
                if(canMoveInDirection(board, xCo-2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo+2));
                }
                if(canMoveInDirection(board, xCo-2, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo-2));
                }
                if(canMoveInDirection(board, xCo-1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                }
                break;
        }

        return possibleMoves;
    }
    
}
