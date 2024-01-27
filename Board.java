import java.awt.*;
import java.util.List;
import javax.swing.JPanel;

public class Board extends JPanel{
    private Surface surface;

    public Board(Surface surface){
        this.surface = surface;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        surface.draw(g);
        drawSelectedPieceMoves(g);
    }

    private void drawSelectedPieceMoves(Graphics g){
        List<Coordinate> selectedPieceMoves = surface.getSelectedPieceMoves();
        if(selectedPieceMoves != null){
            for(Coordinate move : selectedPieceMoves){
                int x = move.getX() * Surface.SQUARE_SIZE;
                int y = move.getY() * Surface.SQUARE_SIZE;

                g.setColor(Color.GREEN);
                g.fillRect(x, y, Surface.SQUARE_SIZE, Surface.SQUARE_SIZE);
            }
        }
    }

}
