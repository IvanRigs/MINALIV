package minalivgame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayOptions extends JPanel{
    
     public Game frame;
     public javax.swing.JPanel background;
    
     public PlayOptions(JFrame frame){
        this.frame = (Game) frame;
        
        //incializacion de variable
        background = new javax.swing.JPanel();
        
        //creacion de background
        background.setBackground(new java.awt.Color(65, 51, 51));
        background.setBounds(0, 0, 915, 500);
        this.setPreferredSize(new java.awt.Dimension(915, 500));
        setLayout(null);
        
        this.add(background);
    }
}
