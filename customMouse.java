import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class customMouse extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("MOUSE ENTERED IN THE BLACK BOX");
    }
}
