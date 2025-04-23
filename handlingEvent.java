import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
 class Divyansh{
     Divyansh(){
        Frame f = new Frame("First GUI");
        Label l1 = new Label("Enter 1st Number");
        Label l2 = new Label("Enter 2nd Number");
        Label l3 = new Label("RESULT:");
        TextField t1 = new TextField();    
        TextField t2 = new TextField(); 
        TextField t3 = new TextField();  
        Button b1 = new Button("Add");
        Button b2 = new Button("Sub");
        Button b3 = new Button("Mult");
        Button b4 = new Button("Div");
        Button b5 = new Button("Clear");
        l1.setBounds(100,100,100,50);
        l2.setBounds(100,200,100,50);
        l3.setBounds(100,300,100,50);
        t1.setBounds(200, 110, 70, 25);
        t2.setBounds(200, 210, 70, 25);
        t3.setBounds(200, 310, 70, 25);
        b1.setBounds(200, 400, 80, 40);
        b2.setBounds(300, 400, 80, 40);
        b3.setBounds(400, 400, 80, 40);
        b4.setBounds(500, 400, 80, 40);
        b5.setBounds(600, 400, 80, 40);
        f.setBackground(Color.gray);
        f.setLayout(null);
        f.setSize(1000,1000);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(l3);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a+b;
                t3.setText(" "+c);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a-b;
                t3.setText(" "+c);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a*b;
                t3.setText(" "+c);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a/b;
                t3.setText(" "+c);
            }
        });  
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
    }
}
public class handlingEvent {    

    public static void main(String[] args){
        new Divyansh();  
    }

}
