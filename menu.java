import java.awt.*;
import java.awt.event.*;
class Screen{
    Screen(){
        Frame f2 = new Frame("Second GUI");
        Label l = new Label("This is the second GUI");
        f2.add(l);
        f2.setSize(1000,1000);
        f2.setVisible(true);
    }
    }
public class menu {
    public static void main(String[] args) {
        Frame f = new Frame("Menu");
        MenuBar M = new MenuBar();
        f.setMenuBar(M);
        Menu m1 = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        m1.add(open);
        m1.add(save);
        m1.addSeparator();

        MenuItem exit = new MenuItem("Exit");
exit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
open.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e){
new Screen();
   } 
});
m1.add(exit);
M.add(m1);
f.setSize(800, 800);
f.setVisible(true);
    }

}
