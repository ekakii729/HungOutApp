/*
 * Creator(s): Abhay Manoj
 * Date of Creation: December 19th, 2023
 * Purpose: ADD LATER
 */

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public void run() {
        setSize(400,400);

        JPanel panel = new JPanel(new MigLayout());

        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"), "wrap");
        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"), "wrap");
        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"));
        panel.add(new JButton("Hello!"));

        add(panel);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        FlatDarculaLaf.setup();

        Main main = new Main();
        main.run();
    }
}