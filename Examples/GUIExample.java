import javax.swing.*;


public class GUIExample extends JFrame {

    public GUIExample() {

        JButton b = new JButton("Button");
        
        this.add(b);
        this.setSize(500,300);
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        GUIExample gui = new GUIExample();
    }
    
}