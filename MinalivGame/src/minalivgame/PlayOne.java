package minalivgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import movimiento.MoverComp;

public class PlayOne extends JPanel{
    
    //declaracion de variables
    public Game frame;
    public javax.swing.JPanel background;
    public javax.swing.JPanel buttom;
    public javax.swing.JLabel glezzez;
    public javax.swing.JLabel glezzez1;
    public javax.swing.JLabel play;
    public javax.swing.JLabel playEntered;
    public boolean block;
    
    public PlayOne(JFrame frame){
        this.frame = (Game) frame;
        
        //incializacion de variable
        background = new javax.swing.JPanel();
        buttom = new javax.swing.JPanel();
        glezzez = new javax.swing.JLabel();
        glezzez1 = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        playEntered = new javax.swing.JLabel();
        block = false;
        
        //creacion de background
        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setBounds(0, 0, 915, 500);
        this.setPreferredSize(new java.awt.Dimension(915, 500));
        setLayout(null);
        
        //eventos
        this.setFocusable(true);
        this.requestFocus();
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                blackgroundMouseEntered(e);
            }
        });
        buttom.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent e){
                playMouseEntered(e);
            }
             public void mouseClicked(java.awt.event.MouseEvent e) {
                playMouseClicked(e);
            }
        });
        
        //editar JPanel
        buttom.setBackground(new java.awt.Color(51, 51, 51));
        buttom.setBounds(400, 232, 127, 40);
        
        //cargar imagenes
        glezzez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minaliv.png")));
        glezzez1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/glzwhite.png")));
        playEntered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playEvn.png")));
        
        //configuracion de imagenes
        glezzez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glezzez.setBounds(240, 140, 430, 160);
        
        glezzez1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        glezzez1.setBounds(30, 360, 220, 140);
        
        play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play.setBounds(350, 185, 220, 140);
        
        playEntered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playEntered.setBounds(350, 185, 220, 140);
        
        //modificaciones
        playEntered.setVisible(false);
        
        //agregar imagenes a la interfaz
        this.add(glezzez);
        this.add(glezzez1);
        this.add(play);
        this.add(playEntered);
        this.add(buttom);
        this.add(background);
    }
    
    public void blackgroundMouseEntered(java.awt.event.MouseEvent e){
        MoverComp.Arriba(glezzez, 8, 1, 48);
            
        if (glezzez.getY() == 48 && !block){
            play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png")));
            block = true;
        }
        
        play.setVisible(true);
    }
    
    public void playMouseEntered(java.awt.event.MouseEvent e){
        play.setVisible(false);
        playEntered.setVisible(true);
    }
    
    public void playMouseClicked(java.awt.event.MouseEvent e){
        System.out.println("...");
        this.frame.switchToPlayOptions();
    }
    
    //ME FUNCIONARA(FUNCIONA PARA CREAR EVENTOS PERSONALIZADOS, NO ES UTILIZADO EN ESTA CLASE, SE PUEDE BORRAR).
    //this.addKeyListener(new MyKeyAdapter());
    class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
          switch(e.getKeyCode()){
              case (KeyEvent.KEY_TYPED):
                  System.out.println("...");
              break;
          }
        }
    }
    
}
