import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class Billing {
  public static void main(String[] args) {
    JFrame f = new JFrame("Billing");
    f.setBackground(Color.red);
    JCheckBox c1 = new JCheckBox("Apple- $10");
    JCheckBox c2 = new JCheckBox("Banana- $5");
    JCheckBox c3 = new JCheckBox("Mango- $15");
    JCheckBox c4 = new JCheckBox("Orange- $8");
    JButton b = new JButton("Calculate Total");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (c1.isSelected()) {
          total += 10; // Price of Apple
        }
        if (c2.isSelected()) {
          total += 5; // Price of Banana
        }
        if (c3.isSelected()) {
          total += 15; // Price of Mango
        }
        if (c4.isSelected()) {
          total += 8; // Price of Orange
        }
        JOptionPane.showMessageDialog(f, "Total: $" + total);
      }
    });
    f.setSize(400, 400);
    f.setLayout(new FlowLayout());
    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);
    f.add(b);
    f.setVisible(true);

 
  }
}
