import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;

public class ShogiApplication extends JFrame{
    private Surface surface;
    public int player;
    private Piece selectedPiece;
    private Coordinate initialCoordinate;
    private JLabel playerLabel;
    
    public ShogiApplication(){
        surface = new Surface();
        player = 0;

        surface.setPlayer(player);

        setTitle("ShogiApplication");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board(surface);
        board.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int mouseX = e.getX();
                int mouseY = e.getY();
                handleMouseClick(mouseX, mouseY);
            }
        });

        JButton moveButton = new JButton("move");
        moveButton.addActionListener(e -> handleMoveButtonClick());
        moveButton.setBounds(760, 760, 40, 40);

        playerLabel = new JLabel("player: " + player);
        playerLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        JButton resetButton = new JButton("reset");
        resetButton.addActionListener(e -> resetGame());
        resetButton.setBounds(710, 760, 40, 40);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(moveButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(playerLabel);

        add(board);
        add(buttonPanel);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        setVisible(true);
    }

    private void handleMouseClick(int mouseX, int mouseY){
        int row = mouseX / Surface.SQUARE_SIZE;
        int col = mouseY / Surface.SQUARE_SIZE;

        if (selectedPiece == null) {
            selectedPiece = surface.getPiece(row, col);
            /*System.out.println("Clicked Coordinate: (" + row + ", " + col + ")");
            System.out.println("Selected Piece Coordinate: (" + selectedPiece.getPosition().getX() + ", " + selectedPiece.getPosition().getY() + ")");
            System.out.println("Possible Moves: " + possibleMoves);*/

            if (selectedPiece != null && selectedPiece.getPieceOwner() == player) {
                initialCoordinate = new Coordinate(row, col);
                List<Coordinate> possibleMoves = selectedPiece.getPossibleMoves(surface);
                surface.setSelectedPiece(selectedPiece);
                surface.setSelectedPieceMoves(possibleMoves);
                repaint();
            } else {
                System.out.println("Invalid piece selection");
            }
        } else {
            Coordinate targetCoordinate = new Coordinate(row, col);
            List<Coordinate> possibleMoves = selectedPiece.getPossibleMoves(surface);

            System.out.println("Clicked Coordinate: (" + row + ", " + col + ")");
            System.out.println("Selected Piece Coordinate: (" + selectedPiece.getPosition().getX() + ", " + selectedPiece.getPosition().getY() + ")");
            System.out.println("Possible Moves: " + possibleMoves);

            if (possibleMoves.contains(targetCoordinate)) {
                selectedPiece.moveTo(surface, targetCoordinate.getX(), targetCoordinate.getY());
                player = (player == 0) ? 1 : 0;
                surface.setPlayer(player);
                playerLabel.setText("Player: " + player);
                surface.clearSelectedPiece();
                selectedPiece = null;
                initialCoordinate = null;
                repaint();
            } else {
                System.out.println("Invalid move");
            }
        }
    }

    private void handleMoveButtonClick() {
        if (selectedPiece != null && initialCoordinate != null) {
            System.out.println("Please select a target square after pressing the Move button.");
        } else {
            System.out.println("No piece selected or target coordinate not set");
        }
    }

    private void resetGame(){
        surface.initializeBoard();
        player = 0;
        selectedPiece = null;
        initialCoordinate = null;
        surface.setPlayer(player);
        repaint();
    }
}
