package code.sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import java.io.File;

public class Sound{
    private Clip clip;

    public Sound(String pathname){
        File file = new File(pathname);

        try{
            AudioFormat format = AudioSystem.getAudioFileFormat(file).getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(AudioSystem.getAudioInputStream(file));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void play(){
        new Thread(){
            public void run(){
                int time = clip.getFrameLength();
                clip.start();
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }
}
