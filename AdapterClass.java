
import javax.swing.*;
import java.awt.event.*;

class AdapterClass extends WindowAdapter
{
    JFrame f1;
    AdapterClass()
    {
        f1=new JFrame("Adapter Class Example");
        f1.setSize(400,400);
        f1.setVisible(true);
        f1.addWindowListener(this);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void windowClosing(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"Window is Closing");
    }
    public void windowOpened(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"Window is Opened");
    }
    public void windowIconified(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"Window is Minimized");
    }
    public void windowDeiconified(WindowEvent e)
    {
        JOptionPane.showMessageDialog(f1,"Window is Restored");
    }
    public static void main(String[] args) {
        new AdapterClass();
    }
} 