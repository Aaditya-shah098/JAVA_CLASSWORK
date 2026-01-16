import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorButtonDemo extends JFrame implements ActionListener {

    JButton redBtn, blueBtn, greenBtn;

     ColorButtonDemo() {
        setTitle("Color Button Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(20, 40, 20));

        // Create buttons
        redBtn = new JButton("RED");
        blueBtn = new JButton("BLUE");
        greenBtn = new JButton("GREEN");

        // Add action listener
        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        // Add buttons to frame
        add(redBtn);
        add(blueBtn);
        add(greenBtn);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn.getText().equals("RED")) {
            btn.setBackground(Color.RED);
        } else if (btn.getText().equals("BLUE")) {
            btn.setBackground(Color.BLUE);
        } else if (btn.getText().equals("GREEN")) {
            btn.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ColorButtonDemo().setVisible(true);
    }
}
