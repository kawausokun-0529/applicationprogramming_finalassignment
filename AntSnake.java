import java.util.ArrayList;

public class AntSnake extends Piece{
    public AntSnake(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 3;
        this.position = new Coordinate(x, y);
    }

    ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
                while(canMoveInDirection(board, xCo+1, yCo)){
                    if(board.getPiece(xCo+1, yCo) != null){
                        possibleMoves.add(new Coordinate(xCo+1, yCo));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                    xCo = xCo + 1;
                }
                xCo = position.getX();
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
                while(canMoveInDirection(board, xCo+1, yCo)){
                    if(board.getPiece(xCo+1, yCo) != null){
                        possibleMoves.add(new Coordinate(xCo+1, yCo));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                    xCo = xCo + 1;
                }
                xCo = position.getX();
                while(canMoveInDirection(board, xCo-1, yCo)){
                    if(board.getPiece(xCo-1, yCo) != null){
                        possibleMoves.add(new Coordinate(xCo-1, yCo));
                        break;
                    }
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                    xCo = xCo - 1;
                }
                xCo = position.getX();
                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo, yCo+j));
                        possibleMoves.add(new Coordinate(xCo, yCo+j));
                    }
                }                for(int i=1; i<=3; i++){
                    for(int j=1; j<=3; j++){
                        if(canMoveInDirection(board, xCo, yCo-j));
                        possibleMoves.add(new Coordinate(xCo, yCo-j));
                    }
                }
                break;
        }

        return possibleMoves;
    }
}
