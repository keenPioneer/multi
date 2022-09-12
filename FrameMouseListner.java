import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FrameMouseListner implements MouseListener {
    JFrame currFrame;
    public FrameMouseListner(JFrame currFrame) {
        this.currFrame=currFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currFrame.requestFocus();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
