

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MovieInfo implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton b;

    MovieInfo() {
        f = new JFrame("Movie Rental System");
        f.setSize(450, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(6, 2, 10, 10));

        l1 = new JLabel("Movie ID");
        l2 = new JLabel("Title");
        l3 = new JLabel("Genre");
        l4 = new JLabel("Language");
        l5 = new JLabel("Length (minutes)");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        b = new JButton("OK");
        b.addActionListener(this);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(t4);
        f.add(l5); f.add(t5);
        f.add(new JLabel()); f.add(b);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            insertData();
        }
    }

    public void insertData() {
        try {
            int id = Integer.parseInt(t1.getText());
            String title = t2.getText();
            String genre = t3.getText();
            String language = t4.getText();
            int length = Integer.parseInt(t5.getText());

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/MRS",
                    "root",
                    ""
            );

            String sql = "INSERT INTO Movie VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, genre);
            ps.setString(4, language);
            ps.setInt(5, length);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(f, "Movie Record Inserted Successfully");

            conn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(f, ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new MovieInfo();
    }
}
 
    

