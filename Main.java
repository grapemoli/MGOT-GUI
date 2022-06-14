import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("poop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        JButton button2 = new JButton("mine");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.getContentPane().add(button2);
        frame.setVisible(true);

    }
}


