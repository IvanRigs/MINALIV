package minalivgame;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sounds {
	
	AudioInputStream inputStream;
	Clip clip;

	public void sound(String soundLocation) {
		try {
				inputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundLocation));
				clip = AudioSystem.getClip();
				clip.open(inputStream);
		} catch (UnsupportedAudioFileException e) {
			System.out.println("UnsupportedAudioFileException");
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (LineUnavailableException e) {
			System.out.println("LineUnavailableException");
		}
		
		
		
	}
	
	public void soundStopPlay(int stopPlayLoop) {
		if (stopPlayLoop == 1) {
			clip.stop();
		}else if (stopPlayLoop == 2) {
			clip.start();
		}else if (stopPlayLoop == 3) {
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
	}

}
