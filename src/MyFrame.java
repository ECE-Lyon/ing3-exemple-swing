import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setLayout(new FlowLayout());

        for (int i = 0; i < 8; i++) {
            getContentPane().add(new MyButton());
        }

        this.setTitle("Toto");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
