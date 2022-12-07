package minalivgame;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.*;

public class Game extends JFrame {
	PlayOne playOne = new PlayOne(this);
	PlayOptions playOptions = new PlayOptions(this);
	GameRun gameRun = new GameRun(this);
	Credits credits = new Credits(this);
	// Configuration configuration = new Configuration(this);

	public Game() {
		this.add(playOne);

		this.setTitle("Minaliv");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);
		this.setIconImage(new ImageIcon(getClass().getResource("/img/assets/17.png")).getImage());
		Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("/img/assets/pixel.png")).getImage(), new Point(0, 0), "cursor");
		this.setCursor(cursor);

		this.setVisible(true);

		this.add(playOptions);
	}

	public void switchToPlayOptions() {
		playOne.setVisible(false);
		playOptions.setVisible(true);
		playOptions.requestFocus();
	}

	public void switchToGameRun() {
		playOptions.setVisible(false);
		gameRun.setVisible(true);
		gameRun.requestFocus();
	}

	public void switchToPlayOptionsGameRun() {
		playOptions.setVisible(true);
		gameRun.setVisible(false);
		playOptions.requestFocus();
	}

	public void switchToCredits() {
		playOptions.setVisible(false);
		credits.setVisible(true);
		credits.requestFocus();
	}

	public void switchToPlayOptionsCredits() {
		playOptions.setVisible(true);
		credits.setVisible(false);
		playOptions.requestFocus();
	}

}
