package minalivgame;

import javax.swing.*;

public class Game extends JFrame{
    PlayOne playOne = new PlayOne(this);
    PlayOptions playOptions = new PlayOptions(this);
    //GameRun gameRun = new GameRun(this);
    //Configuration configuration = new Configuration(this);
            
    public Game(){
        this.add(playOne);
        
        this.setTitle("Minaliv");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        
        this.setVisible(true);
        
        this.add(playOptions);
    }
    
    public void switchToPlayOptions(){
        playOne.setVisible(false);
        playOptions.setVisible(true);
    }
}
