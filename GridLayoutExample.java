import javax.swing.*;
import java.awt.*;
 class GridLayoutExample
 {
   JFrame f1;
   JLabel l1,l2;
   JButton b1,b2;
   JTextField t1,t2;
   JPasswordField p1,p2;
   GridLayoutExample()
   {
        f1=new JFrame("Balkumari NCIT");
        l1=new JLabel("Username:");
        l2=new JLabel("Password:");
        t1=new JTextField();
        p1=new JPasswordField();
        b1=new JButton("ok");
        b2=new JButton("Cancel");
        f1.setLayout(new GridLayout(4,2,20,20));
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(p1);
        f1.add(b1);
        f1.add(b2);
        f1.setSize(400,400);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args) {
         new GridLayoutExample();   
   }

   
}