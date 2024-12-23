import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
    
    private PendulumSimulation simulation;
    
    
    public Panel(PendulumSimulation simulation) {
        this.simulation = simulation;
        setPanelSize();
    }

    public void setPanelSize() {
        setPreferredSize(new Dimension(PendulumSimulation.WIDTH, PendulumSimulation.HEIGHT));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        simulation.update();
        simulation.render(g);
    }
}        

