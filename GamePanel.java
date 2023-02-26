import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame{
    public GamePanel(){
        JPanel board = new JPanel(new GridLayout(8 , 8 ));
        for(int i = 0 ; i < 8 ; i++){
            for(int x = 0 ; x < 8 ; x++){
                JLabel square  = new JLabel();

                square.setOpaque(true);
                if((i + x ) % 2 == 0){
                    square.setBackground(Color.white);
                }else{
                    square.setBackground(Color.BLACK);
                }

                square.setBorder(BorderFactory.createLineBorder(Color.black));
                board.add(square);
            }
        }

        add(board);
        setTitle("Game Chess");
        setSize(900 , 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}