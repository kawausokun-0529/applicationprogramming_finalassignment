import java.util.ArrayList;

public class King extends Piece{
    public King(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        this.pieceID = 89;
        this.pieceRank = 5;
        this.owner = owner;
        this.promoted = promoted;
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
                if(canMoveInDirection(board, xCo+2, yCo)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo));
                }
                if(canMoveInDirection(board, xCo+1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                }
                if(canMoveInDirection(board, xCo+2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo+2));
                }
                if(canMoveInDirection(board, xCo+1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                }
                if(canMoveInDirection(board, xCo+2, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo-2));
                }
                if(canMoveInDirection(board, xCo, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                }
                if(canMoveInDirection(board, xCo, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo, yCo+2));
                }
                if(canMoveInDirection(board, xCo, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                if(canMoveInDirection(board, xCo-1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                }
                if(canMoveInDirection(board, xCo-2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo+2));
                }
                if(canMoveInDirection(board, xCo-1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                }
                if(canMoveInDirection(board, xCo-2, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo-2));
                }
                if(canMoveInDirection(board, xCo-1, yCo)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                }
                if(canMoveInDirection(board, xCo-2, yCo)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo));
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
                if(canMoveInDirection(board, xCo+1, yCo)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                }
                if(canMoveInDirection(board, xCo+2, yCo)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo));
                }
                if(canMoveInDirection(board, xCo+1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo+1));
                }
                if(canMoveInDirection(board, xCo+2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo+2));
                }
                if(canMoveInDirection(board, xCo+1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo-1));
                }
                if(canMoveInDirection(board, xCo+2, yCo)){
                    possibleMoves.add(new Coordinate(xCo+2, yCo));
                }
                if(canMoveInDirection(board, xCo, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo, yCo+1));
                }
                if(canMoveInDirection(board, xCo, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo, yCo+2));
                }
                if(canMoveInDirection(board, xCo, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo, yCo-1));
                }
                if(canMoveInDirection(board, xCo, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo, yCo-2));
                }
                if(canMoveInDirection(board, xCo-1, yCo+1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo+1));
                }
                if(canMoveInDirection(board, xCo-2, yCo+2)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo+2));
                }
                if(canMoveInDirection(board, xCo-1, yCo-1)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo-1));
                }
                if(canMoveInDirection(board, xCo-2, yCo-2)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo-2));
                }
                if(canMoveInDirection(board, xCo-1, yCo)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
                }
                if(canMoveInDirection(board, xCo-2, yCo)){
                    possibleMoves.add(new Coordinate(xCo-2, yCo));
                }
        }

        return possibleMoves;
    }
}
