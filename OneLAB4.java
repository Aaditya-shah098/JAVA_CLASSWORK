import javax.swing.*;
import java.awt.*;

 class GridBagForm extends JFrame {

     GridBagForm() {
        setTitle("GridBag Layout Form");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5); // spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ===== Row 1: Name =====
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Enter Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        add(new JTextField(15), gbc);

        // ===== Row 2: Address =====
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new JLabel("Enter Address:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        add(new JTextField(15), gbc);

        // ===== Row 3: Gender =====
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(new JLabel("Select Gender:"), gbc);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        gbc.gridx = 1;
        add(male, gbc);

        gbc.gridx = 2;
        add(female, gbc);

        // ===== Row 4: City =====
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("City:"), gbc);

        String[] cities = {"Biratnagar", "Kathmandu", "Bhaktapur", "Pokhara"};
        JList<String> cityList = new JList<>(cities);
        JScrollPane sp = new JScrollPane(cityList);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        add(sp, gbc);

        // ===== Row 5: Buttons =====
        gbc.gridy = 4;
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(new JButton("Submit"), gbc);

        gbc.gridx = 2;
        add(new JButton("Reset"), gbc);
    }

    public static void main(String[] args) {
        new GridBagForm().setVisible(true);
    }
}
