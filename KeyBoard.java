import javax.swing.*;
import java.awt.*;

public class KeyBoard {
    //Make a frame and arrange all the key's on a keyboard format
    //then give all those keys properties of being pressed when the corresponding
    static JFrame MainScreen;
    public static void main(String[] args) {
        MainScreen = new JFrame();
        MainScreen.setLayout(null);
//        MainScreen.setSize(1024,720);
        MainScreen.setBounds(600,200,1024,720);
        MainScreen.setVisible(true);
        FrameKeyListner fkl=new FrameKeyListner(MainScreen);
        MainScreen.addKeyListener(fkl);
        addTextArea();
        FrameMouseListner fm=new FrameMouseListner(MainScreen);
        MainScreen.addMouseListener(fm);

    }
    public static void addTextArea(){
        TextArea ta=new TextArea();
        ta.setBounds(200,10,640,480);
        MainScreen.add(ta);
    }




}
