package minalivgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayOptions extends JPanel {

	// atributos
	public Game frame;
	public javax.swing.JLabel background;
	public javax.swing.JLabel background1;

	public javax.swing.JLabel playButtom;
	public javax.swing.JLabel optionsButtom;
	public javax.swing.JLabel creditsButtom;
	public javax.swing.JLabel exitButtom;

	public javax.swing.JLabel playButtomEvn;
	public javax.swing.JLabel optionsButtomEvn;
	public javax.swing.JLabel creditsButtomEvn;
	public javax.swing.JLabel exitButtomEvn;

	public javax.swing.JPanel buttom01;
	public javax.swing.JPanel buttom02;
	public javax.swing.JPanel buttom03;
	public javax.swing.JPanel buttom04;

	public Sounds sound;
	public Sounds click;

	public boolean block;
	private int selection;

	public PlayOptions(JFrame frame) {
		this.frame = (Game) frame;

		// incializacion de variables
		selection = 0;

		background = new javax.swing.JLabel();
		background1 = new javax.swing.JLabel();

		playButtom = new javax.swing.JLabel();
		optionsButtom = new javax.swing.JLabel();
		creditsButtom = new javax.swing.JLabel();
		exitButtom = new javax.swing.JLabel();

		playButtomEvn = new javax.swing.JLabel();
		optionsButtomEvn = new javax.swing.JLabel();
		creditsButtomEvn = new javax.swing.JLabel();
		exitButtomEvn = new javax.swing.JLabel();

		buttom01 = new javax.swing.JPanel();
		buttom02 = new javax.swing.JPanel();
		buttom03 = new javax.swing.JPanel();
		buttom04 = new javax.swing.JPanel();

		sound = new Sounds();
		sound.sound("/song/song.wav");

		click = new Sounds();
		//click.sound("song/click.wav");

		// creacion de background
		background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/01.gif")));
		background.setBounds(0, 0, 915, 500);

		background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/01.png")));
		background1.setBounds(0, 0, 915, 500);

		this.setPreferredSize(new java.awt.Dimension(915, 500));
		setLayout(null);

		// cargar imagenes
		playButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/01.png")));
		optionsButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/02.png")));
		creditsButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/03.png")));
		exitButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/04.png")));

		playButtomEvn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/05.png")));
		optionsButtomEvn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/06.png")));
		creditsButtomEvn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/07.png")));
		exitButtomEvn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/08.png")));

		// configuracion de imagenes
		playButtom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		playButtom.setBounds(0, 0, 915, 500);

		optionsButtom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		optionsButtom.setBounds(0, 0, 915, 500);

		creditsButtom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		creditsButtom.setBounds(0, 0, 915, 500);

		exitButtom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		exitButtom.setBounds(0, 0, 915, 500);

		playButtomEvn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		playButtomEvn.setBounds(0, 0, 915, 500);

		optionsButtomEvn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		optionsButtomEvn.setBounds(0, 0, 915, 500);

		creditsButtomEvn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		creditsButtomEvn.setBounds(0, 0, 915, 500);

		exitButtomEvn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		exitButtomEvn.setBounds(0, 0, 915, 500);

		// eventos
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(new MyKeyAdapter());
		background1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				blackgroundMouseEntered(e);
			}
		});

		buttom02.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				buttom01MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				buttom01MouseClicked(e);
			}
		});
		buttom01.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				buttom02MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				buttom02MouseClicked(e);
			}
		});
		buttom03.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				buttom03MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				buttom03MouseClicked(e);
			}
		});
		buttom04.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				buttom04MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				buttom04MouseClicked(e);
			}
		});

		// editar JPanel
		buttom01.setBackground(new java.awt.Color(0, 0, 0, 0));
		buttom01.setBounds(378, 232, 167, 38);

		buttom02.setBackground(new java.awt.Color(0, 0, 0, 0));
		buttom02.setBounds(378, 182, 167, 38);

		buttom03.setBackground(new java.awt.Color(0, 0, 0, 0));
		buttom03.setBounds(378, 282, 167, 38);

		buttom04.setBackground(new java.awt.Color(0, 0, 0, 0));
		buttom04.setBounds(378, 332, 167, 38);

		// modificaciones
		background.setVisible(false);
		playButtomEvn.setVisible(false);
		optionsButtomEvn.setVisible(false);
		creditsButtomEvn.setVisible(false);
		exitButtomEvn.setVisible(false);

		// agregar imagenes a la interfaz
		this.add(buttom01);
		this.add(buttom02);
		this.add(buttom03);
		this.add(buttom04);
		this.add(playButtom);
		this.add(optionsButtom);
		this.add(creditsButtom);
		this.add(exitButtom);
		this.add(playButtomEvn);
		this.add(optionsButtomEvn);
		this.add(creditsButtomEvn);
		this.add(exitButtomEvn);
		this.add(background);
		this.add(background1);
	}

	// evento mouse
	public void blackgroundMouseEntered(java.awt.event.MouseEvent e) {
		sound.soundStopPlay(3);
		background.setVisible(true);
		optionsButtomEvn.setVisible(false);
		optionsButtom.setVisible(true);
		creditsButtomEvn.setVisible(false);
		creditsButtom.setVisible(true);
		exitButtomEvn.setVisible(false);
		exitButtom.setVisible(true);
		playButtomEvn.setVisible(false);
		playButtom.setVisible(true);
	}

	public void buttom01MouseEntered(java.awt.event.MouseEvent e) {
		sound.soundStopPlay(3);
		optionsButtomEvn.setVisible(false);
		optionsButtom.setVisible(true);
		creditsButtomEvn.setVisible(false);
		creditsButtom.setVisible(true);
		exitButtomEvn.setVisible(false);
		exitButtom.setVisible(true);
		playButtomEvn.setVisible(true);
		playButtom.setVisible(false);
	}

	public void buttom02MouseEntered(java.awt.event.MouseEvent e) {
		sound.soundStopPlay(3);
		optionsButtomEvn.setVisible(true);
		optionsButtom.setVisible(false);
		creditsButtomEvn.setVisible(false);
		creditsButtom.setVisible(true);
		exitButtomEvn.setVisible(false);
		exitButtom.setVisible(true);
		playButtomEvn.setVisible(false);
		playButtom.setVisible(true);
	}

	public void buttom03MouseEntered(java.awt.event.MouseEvent e) {
		sound.soundStopPlay(3);
		optionsButtomEvn.setVisible(false);
		optionsButtom.setVisible(true);
		creditsButtomEvn.setVisible(true);
		creditsButtom.setVisible(false);
		exitButtomEvn.setVisible(false);
		exitButtom.setVisible(true);
		playButtomEvn.setVisible(false);
		playButtom.setVisible(true);
	}

	public void buttom04MouseEntered(java.awt.event.MouseEvent e) {
		sound.soundStopPlay(3);
		optionsButtomEvn.setVisible(false);
		optionsButtom.setVisible(true);
		creditsButtomEvn.setVisible(false);
		creditsButtom.setVisible(true);
		exitButtomEvn.setVisible(true);
		exitButtom.setVisible(false);
		playButtomEvn.setVisible(false);
		playButtom.setVisible(true);
	}

	public void buttom01MouseClicked(java.awt.event.MouseEvent e) {
		//click.soundStopPlay(2);
		sound.soundStopPlay(1);
		frame.add(frame.gameRun);
		frame.switchToGameRun();
	}

	public void buttom02MouseClicked(java.awt.event.MouseEvent e) {
		//click.soundStopPlay(2);
		
	}

	public void buttom03MouseClicked(java.awt.event.MouseEvent e) {
		//click.soundStopPlay(2);
		frame.add(frame.credits);
		frame.switchToCredits();
	}

	public void buttom04MouseClicked(java.awt.event.MouseEvent e) {
		//click.soundStopPlay(2);
		sound.soundStopPlay(1);
		frame.dispose();
	}

	// evento teclado
	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			sound.soundStopPlay(3);
			switch (e.getKeyCode()) {
			case (KeyEvent.VK_DOWN):
				// System.out.println(".ll");
				if (selection == 0 || selection == 4) {
					selection = 1;
					playButtom.setVisible(false);
					exitButtom.setVisible(true);
					exitButtomEvn.setVisible(false);
					playButtomEvn.setVisible(true);
				} else if (selection == 1) {
					selection++;
					playButtom.setVisible(true);
					playButtomEvn.setVisible(false);
					optionsButtom.setVisible(false);
					optionsButtomEvn.setVisible(true);
				} else if (selection == 2) {
					selection++;
					optionsButtom.setVisible(true);
					optionsButtomEvn.setVisible(false);
					creditsButtom.setVisible(false);
					creditsButtomEvn.setVisible(true);
				} else if (selection == 3) {
					selection++;
					creditsButtom.setVisible(true);
					creditsButtomEvn.setVisible(false);
					exitButtom.setVisible(false);
					exitButtomEvn.setVisible(true);
				}
				break;
			case (KeyEvent.VK_UP):
				if (selection == 0) {
					selection++;
					playButtom.setVisible(false);
					playButtomEvn.setVisible(true);
				} else if (selection == 1) {
					selection = 4;
					playButtom.setVisible(true);
					playButtomEvn.setVisible(false);
					exitButtom.setVisible(false);
					exitButtomEvn.setVisible(true);
				} else if (selection == 4) {
					selection--;
					exitButtom.setVisible(true);
					exitButtomEvn.setVisible(false);
					creditsButtom.setVisible(false);
					creditsButtomEvn.setVisible(true);
				} else if (selection == 3) {
					selection--;
					creditsButtom.setVisible(true);
					creditsButtomEvn.setVisible(false);
					optionsButtom.setVisible(false);
					optionsButtomEvn.setVisible(true);
				} else if (selection == 2) {
					selection--;
					playButtom.setVisible(false);
					playButtomEvn.setVisible(true);
					optionsButtom.setVisible(true);
					optionsButtomEvn.setVisible(false);
				}
				break;
			case (KeyEvent.VK_ENTER):
				if (selection == 1) {
					sound.soundStopPlay(1);
					frame.add(frame.gameRun);
					frame.switchToGameRun();
				} else if (selection == 2) {

				} else if (selection == 3) {
					frame.add(frame.credits);
					frame.switchToCredits();
				} else if (selection == 4) {
					frame.dispose();
				}
				break;
			}
		}
	}

}
