package minalivgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameRun extends JPanel {

	// atributos
	public Game frame;
	private Structure game;

	public javax.swing.JLabel background;
	public javax.swing.JLabel background1;
	public javax.swing.JLabel turnPurple;
	public javax.swing.JLabel turnOrange;
	public javax.swing.JLabel purple;
	public javax.swing.JLabel orange;
	public javax.swing.JLabel selectPurple;
	public javax.swing.JLabel selectOrange;
	public javax.swing.JLabel winnerOrange;
	public javax.swing.JLabel winnerPurple;
	public javax.swing.JLabel playAgain;
	public javax.swing.JLabel playAgainSelect;
	public javax.swing.JLabel exit;
	public javax.swing.JLabel exitSelect;
	public javax.swing.JLabel empate;
	public javax.swing.JLabel matrixImg[][];

	public javax.swing.JPanel selectButtom01;
	public javax.swing.JPanel selectButtom02;
	public javax.swing.JPanel selectButtom03;
	public javax.swing.JPanel selectButtom04;
	public javax.swing.JPanel selectButtom05;
	public javax.swing.JPanel selectButtom06;
	public javax.swing.JPanel selectButtom07;
	public javax.swing.JPanel selectOption;
	public javax.swing.JPanel selectOption01;
	public javax.swing.JPanel background03;
	public javax.swing.JPanel background04;

	private int turn;
	private int selection;
	private int selectionFinish;
	private int coorX;
	private boolean blockKey;

	private boolean win;

	public GameRun(JFrame frame) {

		// incializacion de variables
		this.frame = (Game) frame;

		game = new Structure();
		game.listaBidimensional(6, 7);
		game.verListaBidimensional();

		turn = (int) (Math.random() * 2) + 1;
		selection = 0;
		selectionFinish = 0;

		win = false;
		blockKey = false;

		matrixImg = new javax.swing.JLabel[6][7];

		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				matrixImg[i][z] = new javax.swing.JLabel();
			}
		}

		background = new javax.swing.JLabel();
		background1 = new javax.swing.JLabel();

		turnPurple = new javax.swing.JLabel();
		turnOrange = new javax.swing.JLabel();
		purple = new javax.swing.JLabel();
		orange = new javax.swing.JLabel();
		selectPurple = new javax.swing.JLabel();
		selectOrange = new javax.swing.JLabel();
		winnerOrange = new javax.swing.JLabel();
		winnerPurple = new javax.swing.JLabel();
		playAgain = new javax.swing.JLabel();
		playAgainSelect = new javax.swing.JLabel();
		exit = new javax.swing.JLabel();
		exitSelect = new javax.swing.JLabel();
		empate = new javax.swing.JLabel();

		selectButtom01 = new javax.swing.JPanel();
		selectButtom02 = new javax.swing.JPanel();
		selectButtom03 = new javax.swing.JPanel();
		selectButtom04 = new javax.swing.JPanel();
		selectButtom05 = new javax.swing.JPanel();
		selectButtom06 = new javax.swing.JPanel();
		selectButtom07 = new javax.swing.JPanel();
		selectOption = new javax.swing.JPanel();
		selectOption01 = new javax.swing.JPanel();
		background03 = new javax.swing.JPanel();
		background04 = new javax.swing.JPanel();

		// creacion de background
		background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/09.png")));
		background.setBounds(0, 0, 915, 500);

		background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/12.png")));
		background1.setBounds(0, 0, 915, 500);

		this.setPreferredSize(new java.awt.Dimension(915, 500));
		setLayout(null);

		// carga de imagenes
		turnPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/13.png")));
		turnPurple.setBounds(0, 0, 915, 500);

		turnOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/14.png")));
		turnOrange.setBounds(0, 0, 915, 500);

		purple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/10.png")));
		purple.setBounds(0, 0, 51, 51);

		orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/11.png")));
		orange.setBounds(0, 0, 51, 51);

		selectPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/15.gif")));

		selectOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/16.gif")));
		selectOrange.setBounds(326, 65, 35, 33);

		winnerOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/19.png")));
		winnerOrange.setBounds(0, 0, 915, 500);

		winnerPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/18.png")));
		winnerPurple.setBounds(0, 0, 915, 500);

		playAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/20.png")));
		playAgain.setBounds(170, 240, 291, 65);

		playAgainSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/21.png")));
		playAgainSelect.setBounds(170, 240, 291, 65);

		exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/22.png")));
		exit.setBounds(450, 240, 291, 65);

		exitSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/23.png")));
		exitSelect.setBounds(450, 240, 291, 65);

		empate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assets/24.png")));
		empate.setBounds(0, -20, 915, 500);

		// fichas
		int yy = 120;
		// primera fila
		matrixImg[0][0].setBounds(270, yy, 51, 51);
		matrixImg[0][1].setBounds(334, yy, 51, 51);
		matrixImg[0][2].setBounds(394, yy, 51, 51);
		matrixImg[0][3].setBounds(454, yy, 51, 51);
		matrixImg[0][4].setBounds(514, yy, 51, 51);
		matrixImg[0][5].setBounds(574, yy, 51, 51);
		matrixImg[0][6].setBounds(634, yy, 51, 51);

		// segunda fila
		yy += 55;
		matrixImg[1][0].setBounds(270, yy, 51, 51);
		matrixImg[1][1].setBounds(334, yy, 51, 51);
		matrixImg[1][2].setBounds(394, yy, 51, 51);
		matrixImg[1][3].setBounds(454, yy, 51, 51);
		matrixImg[1][4].setBounds(514, yy, 51, 51);
		matrixImg[1][5].setBounds(574, yy, 51, 51);
		matrixImg[1][6].setBounds(634, yy, 51, 51);

		// tercera fila
		yy += 55;
		matrixImg[2][0].setBounds(270, yy, 51, 51);
		matrixImg[2][1].setBounds(334, yy, 51, 51);
		matrixImg[2][2].setBounds(394, yy, 51, 51);
		matrixImg[2][3].setBounds(454, yy, 51, 51);
		matrixImg[2][4].setBounds(514, yy, 51, 51);
		matrixImg[2][5].setBounds(574, yy, 51, 51);
		matrixImg[2][6].setBounds(634, yy, 51, 51);

		// cuarta fila
		yy += 45;
		matrixImg[3][0].setBounds(270, yy, 51, 51);
		matrixImg[3][1].setBounds(334, yy, 51, 51);
		matrixImg[3][2].setBounds(394, yy, 51, 51);
		matrixImg[3][3].setBounds(454, yy, 51, 51);
		matrixImg[3][4].setBounds(514, yy, 51, 51);
		matrixImg[3][5].setBounds(574, yy, 51, 51);
		matrixImg[3][6].setBounds(634, yy, 51, 51);

		// quinta fila
		yy += 55;
		matrixImg[4][0].setBounds(270, yy, 51, 51);
		matrixImg[4][1].setBounds(334, yy, 51, 51);
		matrixImg[4][2].setBounds(394, yy, 51, 51);
		matrixImg[4][3].setBounds(454, yy, 51, 51);
		matrixImg[4][4].setBounds(514, yy, 51, 51);
		matrixImg[4][5].setBounds(574, yy, 51, 51);
		matrixImg[4][6].setBounds(634, yy, 51, 51);

		// sexta fila
		yy += 50;
		matrixImg[5][0].setBounds(270, yy, 51, 51);
		matrixImg[5][1].setBounds(334, yy, 51, 51);
		matrixImg[5][2].setBounds(394, yy, 51, 51);
		matrixImg[5][3].setBounds(454, yy, 51, 51);
		matrixImg[5][4].setBounds(514, yy, 51, 51);
		matrixImg[5][5].setBounds(574, yy, 51, 51);
		matrixImg[5][6].setBounds(634, yy, 51, 51);

		// eventos
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(new MyKeyAdapter());

		background1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				background1MouseEntered(e);
			}
		});

		selectButtom01.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom01MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom02.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom02MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom03.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom03MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom04.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom04MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom05.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom05MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom06.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom06MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectButtom07.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectButtom07MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectButtomMouseClicked(e);
			}
		});
		selectOption.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectOptionMouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectOptionMouseClicked(e);
			}
		});
		selectOption01.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				selectOption01MouseEntered(e);
			}

			public void mouseClicked(java.awt.event.MouseEvent e) {
				selectOption01MouseClicked(e);
			}
		});
		background03.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent e) {
				background03MouseEntered(e);
			}
		});

		// editar JPanel
		selectButtom01.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom01.setBounds(250, 95, 74, 358);

		selectButtom02.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom02.setBounds(324, 95, 65, 358);

		selectButtom03.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom03.setBounds(389, 95, 60, 358);

		selectButtom04.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom04.setBounds(449, 95, 60, 358);

		selectButtom05.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom05.setBounds(509, 95, 60, 358);

		selectButtom06.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom06.setBounds(569, 95, 60, 358);

		selectButtom07.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectButtom07.setBounds(629, 95, 74, 358);

		selectOption.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectOption.setBounds(197, 248, 240, 47);

		selectOption01.setBackground(new java.awt.Color(0, 0, 0, 0));
		selectOption01.setBounds(480, 248, 240, 47);

		background03.setBackground(new java.awt.Color(0, 0, 0, 0));
		background03.setBounds(0, 0, 915, 500);

		background04.setBackground(new java.awt.Color(50, 0, 0, 90));
		background04.setBounds(0, 0, 915, 500);

		// modificaciones
		purple.setVisible(false);
		orange.setVisible(false);
		turnPurple.setVisible(false);
		turnOrange.setVisible(false);
		selectPurple.setVisible(false);
		selectOrange.setVisible(false);
		winnerOrange.setVisible(false);
		winnerPurple.setVisible(false);
		playAgain.setVisible(false);
		playAgainSelect.setVisible(false);
		exit.setVisible(false);
		exitSelect.setVisible(false);
		selectOption.setVisible(false);
		selectOption01.setVisible(false);
		background03.setVisible(false);
		background04.setVisible(false);
		empate.setVisible(false);

		// primer turno
		if (turn == 1) {
			turnPurple.setVisible(true);
		} else {
			turnOrange.setVisible(true);
		}

		// Agregar imagenes a la interfaz
		this.add(selectOption);
		this.add(selectOption01);
		this.add(background03);
		this.add(playAgain);
		this.add(playAgainSelect);
		this.add(exit);
		this.add(exitSelect);
		this.add(empate);
		this.add(winnerOrange);
		this.add(winnerPurple);
		this.add(background04);
		this.add(selectButtom01);
		this.add(selectButtom02);
		this.add(selectButtom03);
		this.add(selectButtom04);
		this.add(selectButtom05);
		this.add(selectButtom06);
		this.add(selectButtom07);
		this.add(selectOrange);
		this.add(selectPurple);
		this.add(turnOrange);
		this.add(turnPurple);
		this.add(background1);
		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				this.add(matrixImg[i][z]);
			}
		}
		this.add(background);
	}

	// evento mouse

	public void background1MouseEntered(java.awt.event.MouseEvent e) {
		selectPurple.setVisible(false);
		selectOrange.setVisible(false);
		playAgainSelect.setVisible(false);
		exitSelect.setVisible(false);

	}

	public void selectButtom01MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 278;
		turn(coorX);
		selection = 1;
	}

	public void selectButtom02MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 343;
		turn(coorX);
		selection = 2;
	}

	public void selectButtom03MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 403;
		turn(coorX);
		selection = 3;
	}

	public void selectButtom04MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 463;
		turn(coorX);
		selection = 4;
	}

	public void selectButtom05MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 523;
		turn(coorX);
		selection = 5;
	}

	public void selectButtom06MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 583;
		turn(coorX);
		selection = 6;
	}

	public void selectButtom07MouseEntered(java.awt.event.MouseEvent e) {
		coorX = 643;
		turn(coorX);
		selection = 7;
	}

	public void selectButtomMouseClicked(java.awt.event.MouseEvent e) {
		turnPress(coorX);
	}

	public void selectOption01MouseEntered(java.awt.event.MouseEvent e) {
		exitSelect.setVisible(true);
		exit.setVisible(false);
	}

	public void selectOptionMouseEntered(java.awt.event.MouseEvent e) {
		playAgainSelect.setVisible(true);
		playAgain.setVisible(false);
	}

	public void selectOptionMouseClicked(java.awt.event.MouseEvent e) {
		blockKey = false;
		playAgain();
	}

	public void selectOption01MouseClicked(java.awt.event.MouseEvent e) {
		blockKey = false;
		playAgain();
		frame.switchToPlayOptionsGameRun();
	}

	public void background03MouseEntered(java.awt.event.MouseEvent e) {
		playAgain.setVisible(true);
		exit.setVisible(true);
	}

	// evento teclado
	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case (KeyEvent.VK_RIGHT):
				if (!blockKey) {
					if (selection == 0 || selection == 7) {
						selection = 1;
						coorX = 278;
						turn(coorX);
					} else if (selection == 1) {
						selection++;
						coorX = 343;
						turn(coorX);
					} else if (selection == 2) {
						selection++;
						coorX = 403;
						turn(coorX);
					} else if (selection == 3) {
						selection++;
						coorX = 463;
						turn(coorX);
					} else if (selection == 4) {
						selection++;
						coorX = 532;
						turn(coorX);
					} else if (selection == 5) {
						selection++;
						coorX = 583;
						turn(coorX);
					} else if (selection == 6) {
						selection++;
						coorX = 643;
						turn(coorX);
					}
				} else {
					if (selectionFinish == 0) {
						selectionFinish++;
						playAgainSelect.setVisible(true);
						playAgain.setVisible(false);
					} else if (selectionFinish == 1) {
						selectionFinish++;
						exitSelect.setVisible(true);
						exit.setVisible(false);
						playAgainSelect.setVisible(false);
						playAgain.setVisible(true);
					} else if (selectionFinish == 2) {
						selectionFinish--;
						exitSelect.setVisible(false);
						exit.setVisible(true);
						playAgainSelect.setVisible(true);
						playAgain.setVisible(false);
					}
				}
				break;
			case (KeyEvent.VK_LEFT):
				if (!blockKey) {
					if (selection == 0) {
						selection++;
						coorX = 278;
						turn(coorX);
					} else if (selection == 1) {
						selection = 7;
						coorX = 643;
						turn(coorX);
					} else if (selection == 7) {
						selection--;
						coorX = 583;
						turn(coorX);
					} else if (selection == 6) {
						selection--;
						coorX = 523;
						turn(coorX);
					} else if (selection == 5) {
						selection--;
						coorX = 463;
						turn(coorX);
					} else if (selection == 4) {
						selection--;
						coorX = 403;
						turn(coorX);
					} else if (selection == 3) {
						selection--;
						coorX = 343;
						turn(coorX);
					} else if (selection == 2) {
						selection--;
						coorX = 278;
						turn(coorX);
					}
				} else {
					if (selectionFinish == 0) {
						selectionFinish = 1;
						playAgainSelect.setVisible(true);
						playAgain.setVisible(false);
					} else if (selectionFinish == 1) {
						selectionFinish++;
						exitSelect.setVisible(true);
						exit.setVisible(false);
						playAgainSelect.setVisible(false);
						playAgain.setVisible(true);
					} else if (selectionFinish == 2) {
						selectionFinish--;
						exitSelect.setVisible(false);
						exit.setVisible(true);
						playAgainSelect.setVisible(true);
						playAgain.setVisible(false);
					}
				}
				break;
			case (KeyEvent.VK_ENTER):
				if (!blockKey) {
					turnPress(coorX);
				} else {
					if (selectionFinish == 1) {
						blockKey = false;
						playAgain();
					} else if (selectionFinish == 2) {
						blockKey = false;
						playAgain();
						frame.switchToPlayOptionsGameRun();
					}
				}
				break;
			case (KeyEvent.VK_ESCAPE):
				selectOrange.setVisible(false);
				selectPurple.setVisible(false);
				selection = 0;
				playAgain();
				frame.switchToPlayOptionsGameRun();
				break;
			}
		}
	}

	// Metodos
	public void turn(int x) {
		if (turn == 1) {
			selectPurple.setBounds(x, 65, 35, 33);
			selectPurple.setVisible(true);
		} else if (turn == 2) {
			selectOrange.setBounds(x, 65, 35, 33);
			selectOrange.setVisible(true);
		}
	}

	public void turnPress(int x) {
		int indX = game.indX(selection);

		if (turn == 1) {
			if (selection > 0 && game.colocarDato(turn, selection) && indX != -1) {
				matrixImg[indX][selection - 1].setIcon(purple.getIcon());
				if (game.verificarEmpate()) {
					empate.setVisible(true);
					turn = 0;
					winningplayer(turn);
				}
				if (game.check(selection, turn)) {
					winningplayer(turn);
				}
				turn = 2;
				turnPurple.setVisible(false);
				selectPurple.setVisible(false);
				turnOrange.setVisible(true);
				turn(coorX);
			}
		} else {
			if (selection > 0 && game.colocarDato(turn, selection) && indX != -1) {
				matrixImg[indX][selection - 1].setIcon(orange.getIcon());
				if (game.verificarEmpate()) {
					empate.setVisible(true);
					turn = 0;
					winningplayer(turn);
				}
				if (game.check(selection, turn)) {
					winningplayer(turn);
				}
				turn = 1;
				turnOrange.setVisible(false);
				selectOrange.setVisible(false);
				turnPurple.setVisible(true);
				turn(coorX);
			}
		}
	}

	public void winningplayer(int turn) {
		blockKey = true;
		win = true;
		selectOption.setVisible(true);
		selectOption01.setVisible(true);
		playAgain.setVisible(true);
		exit.setVisible(true);
		background03.setVisible(true);
		background04.setVisible(true);
		if (turn == 1) {
			cls();
			winnerPurple.setVisible(true);
		} else if (turn == 2) {
			cls();
			winnerOrange.setVisible(true);
		} else {
			cls();
		}
	}

	public void cls() {
		game.clsList();
		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				matrixImg[i][z].setIcon(null);
			}
		}
	}

	public void playAgain() {
		game.clsList();
		selectionFinish = 0;
		winnerPurple.setVisible(false);
		blockKey = false;
		empate.setVisible(false);
		winnerOrange.setVisible(false);
		playAgain.setVisible(false);
		playAgainSelect.setVisible(false);
		exit.setVisible(false);
		exitSelect.setVisible(false);
		background04.setVisible(false);
		background03.setVisible(false);
		selectOption.setVisible(false);
		selectOption01.setVisible(false);
		for (int i = 0; i < 6; i++) {
			for (int z = 0; z < 7; z++) {
				matrixImg[i][z].setIcon(null);
			}
		}
	}
}
