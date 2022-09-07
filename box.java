import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class box extends JPanel  {
    box(){
        this.setLayout(null);
        this.setBounds(100,100,100,100);
        this.setBackground(Color.BLACK);
        customMouse cm=new customMouse();
        this.addMouseListener(cm);

    }
}
