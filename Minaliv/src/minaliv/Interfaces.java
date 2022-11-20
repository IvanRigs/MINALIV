package minaliv;

public class Interfaces {
    
    //atributos
    Play play = new Play();
    
    //constructor (muestra la primera pantalla)
    public Interfaces(){
        
        //Creacion de la primera interfaz
        play.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        play.setTitle("MINALIV");
        play.setIconImages(null);   
        play.setPreferredSize(new java.awt.Dimension(915, 500));
        play.setResizable(false);
        
        //ejecuta la interfaz
        play.setVisible(true);
    }
    
}
