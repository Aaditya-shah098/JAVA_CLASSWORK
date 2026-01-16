import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class BorderLayoutCalculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

     BorderLayoutCalculator() {
        setTitle("Border Layout Program");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ===== NORTH PANEL =====
        JPanel northPanel = new JPanel();
        JLabel title = new JLabel("Simple Calculator Using BorderLayout");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        northPanel.add(title);
        add(northPanel, BorderLayout.NORTH);

        // ===== EAST PANEL =====
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(4, 1, 5, 5));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        eastPanel.add(b1);
        eastPanel.add(b2);
        eastPanel.add(b3);
        eastPanel.add(b4);

        add(eastPanel, BorderLayout.EAST);

        // ===== CENTER PANEL =====
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(5, 2, 10, 10));

        centerPanel.add(new JLabel("First Number:"));
        t1 = new JTextField();
        centerPanel.add(t1);

        centerPanel.add(new JLabel("Second Number:"));
        t2 = new JTextField();
        centerPanel.add(t2);

        centerPanel.add(new JLabel("Result:"));
        t3 = new JTextField();
        t3.setEditable(false);
        centerPanel.add(t3);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        centerPanel.add(add);
        centerPanel.add(sub);
        centerPanel.add(mul);
        centerPanel.add(div);

        add(centerPanel, BorderLayout.CENTER);
    }

    // ===== EVENT HANDLING =====
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double result = 0;

        if (e.getSource() == add)
            result = a + b;
        else if (e.getSource() == sub)
            result = a - b;
        else if (e.getSource() == mul)
            result = a * b;
        else if (e.getSource() == div)
            result = a / b;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new BorderLayoutCalculator().setVisible(true);
    }
}
