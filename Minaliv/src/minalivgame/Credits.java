package minalivgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import minalivgame.GameRun.MyKeyAdapter;

public class Credits extends JPanel {

	// declaracion de variables
	public Game frame;
	public javax.swing.JLabel background;
	public javax.swing.JLabel back;
	public javax.swing.JLabel backSelect;

	public javax.swing.JPanel buttom;

	public Credits(JFrame frame) {

		// inicializacion de variables
		this.frame = (Game) frame;

		background = new javax.swing.JLabel();
		back = new javax.swing.JLabel();
		backSelect = new javax.swing.JLabel();

		buttom = new javax.swing.JPanel();

		// creacion de blackground
		background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/04.png")));
		background.setBounds(0, 0, 915, 500);
		this.setPreferredSize(new java.awt.Dimension(915, 500));
		setLayout(null);

		// cargar imagenes
		back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/02.png")));
		back.setBounds(20, 423, 112, 60);

		backSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/03.png")));
		backSelect.setBounds(20, 423, 112, 60);

		// eventos
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(new MyKeyAdapter());
		buttom.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				buttomMouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				buttomMouseClicked(e);
			}
		});
		background.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				backgroundMouseEntered(e);
			}
		});

		// editar JPanel
		buttom.setBackground(new java.awt.Color(0, 0, 0, 0));
		buttom.setBounds(20, 423, 112, 60);

		// modificaciones
		backSelect.setVisible(false);

		// agregar imagenes a la interfaz
		this.add(buttom);
		this.add(back);
		this.add(backSelect);
		this.add(background);
	}

	// eventos de mouse
	public void buttomMouseEntered(java.awt.event.MouseEvent e) {
		back.setVisible(false);
		backSelect.setVisible(true);
	}

	public void buttomMouseClicked(java.awt.event.MouseEvent e) {
		frame.switchToPlayOptionsCredits();
	}

	public void backgroundMouseEntered(java.awt.event.MouseEvent e) {
		backSelect.setVisible(false);
		back.setVisible(true);
	}

	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case (KeyEvent.VK_ESCAPE):
				frame.switchToPlayOptionsCredits();
				break;
			}
		}
	}
}
