import java.util.ArrayList;

public class BarkDog extends Piece{
    public BarkDog(int owner, boolean promoted, int x, int y){
        super(owner, promoted);
        pieceID = 5;
        this.position = new Coordinate(x, y);
    }

        ArrayList<Coordinate> getPossibleMoves(Surface board){
        ArrayList<Coordinate> possibleMoves = new ArrayList<>();
        int xCo = position.getX();
        int yCo = position.getY();
        
        switch(owner){
            case 0:
                if(canMoveInDirection(board, xCo+1, yCo)){
                    possibleMoves.add(new Coordinate(xCo+1, yCo));
                }
                break;
            case 1:
                if(canMoveInDirection(board, xCo-1, yCo)){
                    possibleMoves.add(new Coordinate(xCo-1, yCo));
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
