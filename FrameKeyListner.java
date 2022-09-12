import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameKeyListner implements KeyListener {

    JFrame currFrame;
    FrameKeyListner(JFrame jf){
        this.currFrame=jf;
    }
    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println((int)e.getKeyChar());
        if((int)e.getKeyChar()==27){
            currFrame.dispose();
        }
//        System.out.println(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
