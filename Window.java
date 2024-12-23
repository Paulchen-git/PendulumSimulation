import javax.swing.JFrame;

public class Window {
    
    private JFrame jframe;

    // Constructor
    public Window(Panel panel) {
        jframe = new JFrame("Gravity Simulation");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panel);
        jframe.pack();
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
