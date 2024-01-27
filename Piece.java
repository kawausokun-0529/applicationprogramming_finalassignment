import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    int pieceID;
    int pieceRank;
    int owner;
    boolean promoted;
    boolean promotable;
    //int row;
    //int col;
    int validRow, validCol;
    Coordinate position;

    public Piece(int owner, boolean promoted){
        pieceID = 0;
        pieceRank = 1;
        this.owner = owner;
        this.promoted = promoted;
        this.promotable = true;
    }

    public Coordinate getPosition(){
        return position;
    }

    public void setPosition(Coordinate newPosition){
        this.position = newPosition;
    }

    public int getRank(){
        return pieceRank;
    }

    public int getPieceOwner(){
        return owner;
    }

    public int getPieceID(){
        return pieceID;
    }

    ArrayList<Coordinate> getPossibleMoves(Coordinate currentPos){
        return null;
    }
    ArrayList<Coordinate> getPossibleMoves(Surface board){
        return null;
    }

    public boolean canMoveInDirection(Surface board, int x, int y){
        return board.isValidCoordinate(x, y) && board.isOccupied(x, y);
    }

    public void moveTo(Surface board, int newX, int newY){
        List<Coordinate> possibleMoves = getPossibleMoves(board);
        Coordinate newCoordinate = new Coordinate(newX, newY);
        
        if(possibleMoves.contains(newCoordinate)){
            board.capturePiece(newX, newY);
            board.movePiece(this, newX, newY);
        }else{
            System.out.println("Invalid move");
        }
    }

    public void setPosition(int x, int y){
        if(position == null){
            position = new Coordinate(x, y);
        }else{
            position.setX(x);
            position.setY(y);
        }
    }

    public void setX(int x){
        if(position != null){
            position.setX(x);
        }
    }

    public int getX(){
        return position.getX();
    }

    public void setY(int y){
        if(position != null){
            position.setY(y);
        }
    }

    public int getY(){
        return position.getY();
    }

    public ArrayList<Coordinate> promote(Surface board){
        return null;
    }

    public boolean isKings(){
        if(pieceID == 89 || pieceID == 123){
            return true;
        }else{
            return false;
        }
    }
}