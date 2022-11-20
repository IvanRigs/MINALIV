package minaliv;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import movimiento.MoverComp;

public class Play extends javax.swing.JFrame {

    //atributos
    private javax.swing.JPanel background;
    private javax.swing.JLabel glezzez;
    private javax.swing.JLabel glezzez1;
    private javax.swing.JLabel jLabel1;
    private EventoTeclado tecla;
    
    //constructor (Manda a llamar todo lo que esta dentro de la interfaz para que sea ejecutada en la clase "Interfaces")
    public Play() {
        pantalla();
    }
    
    //codigo de la interfaz
    public final void pantalla(){
        //inicializar variables
        background = new javax.swing.JPanel();
        glezzez = new javax.swing.JLabel();
        glezzez1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tecla = new EventoTeclado();

        //Declarar color del fondo de la interfaz
        background.setBackground(new java.awt.Color(51, 51, 51));

        //Envia que tecla se presiona en ejecucion para un evento (evento siginifica que hara el codigo hara algo cuando se presione la tecla)
        addKeyListener(tecla);
       
        //crea un setLayout para el fondo
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //Creacion de las figuras de la interfaz como el logo, las letras de MINALIV
        glezzez.setFont(new java.awt.Font("Consolas", 1, 14));
        glezzez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glezzez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minaliv.png")));
        glezzez.setToolTipText("");
        background.add(glezzez, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 430, 160));

        glezzez1.setFont(new java.awt.Font("Consolas", 1, 14));
        glezzez1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        glezzez1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/glezzez new logo white.png")));
        glezzez1.setToolTipText("");
        background.add(glezzez1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 140));
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Play.png")));
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDoubleBuffered(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 160, 50));

        //Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();             
        
    }

    //clase EventoTeclado (probablemente termine poniendola en otro archivo solo para esta clase (Es una clase dentro del archivo donde  esta la clase "Play"))
     
      class EventoTeclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()== 32){
                 MoverComp.Arriba(glezzez, 8, 1, 23);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    }
     
}
