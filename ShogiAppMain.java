import javax.swing.*;

public class ShogiAppMain extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new ShogiApplication());
    }
}