import java.io.File;
import javax.sound.sampled.*;

public class BackgroundMusic {
    private Clip clip;
    private Clip gameOverClip;
    private boolean isPlaying;

    public BackgroundMusic(String filePath) {
        try {
            File musicFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            isPlaying = false; // Initially, the music is not playing
        } catch (Exception e) {
            System.out.println("Error loading music file: " + e.getMessage());
        }
    }

    public void play() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            isPlaying = true; // Set the flag to true when music starts
        } else {
            System.out.println("Error: Background music clip is not initialized.");
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            isPlaying = false; // Set the flag to false when music stops
        }
    }

    public void playGameOverSound() {
        stopAll();

        try {
            if (gameOverClip == null || !gameOverClip.isOpen()) {
                File soundFile = new File("soundeffects/gameover.aiff");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                gameOverClip = AudioSystem.getClip();
                gameOverClip.open(audioIn);
            }
            gameOverClip.setFramePosition(0);
            gameOverClip.start();
        } catch (Exception e) {
            System.err.println("Error playing Gameover sound: " + e.getMessage());
        }
    }

    public void stopAll() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.flush();
            clip.setFramePosition(0);
            isPlaying = false; // Update the flag when stopping
        }

        if (gameOverClip != null && gameOverClip.isRunning()) {
            gameOverClip.stop();
            gameOverClip.flush();
            gameOverClip.setFramePosition(0);
        }
    }

    public boolean isPlaying() {
        return isPlaying; // Method to check if music is currently playing
    }
}
