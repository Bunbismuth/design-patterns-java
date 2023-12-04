package br.com.bunbismuth.decorator.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Client {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    JLabel title = new JLabel("TITLE");
    frame.add(title, BorderLayout.NORTH);

    JPanel panel = new JPanel(new FlowLayout());
    JLabel label = new JLabel("Label #1");
    JButton button = new JButton("Button #1");
    panel.add(label);
    panel.add(button);

    frame.add(panel, BorderLayout.CENTER);

    frame.setSize(400,200);
    frame.setVisible(true);
  }
}
