import java.awt.Graphics;

public class Point {
    private float x;
    private float y;
    private float theta;
    private float omega;
    private float time;

    public Point(float theta0, float omega0) {
        this.theta = theta0;
        this.omega = omega0;
        this.x = (float) (PendulumSimulation.L * Math.sin(theta));
        this.y = (float) (PendulumSimulation.L * Math.cos(theta));
        time = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void update(float dt) {
        omega -= PendulumSimulation.G / PendulumSimulation.L * Math.sin(theta) * dt;
        theta += omega * dt;
        x = (float) (PendulumSimulation.L * Math.sin(theta));
        y = (float) (PendulumSimulation.L * Math.cos(theta));

        
        time += dt;
    }
    
    public void render(Graphics g) {
        g.drawLine(PendulumSimulation.WIDTH / 2, PendulumSimulation.HEIGHT / 2, (int) (PendulumSimulation.WIDTH / 2 + x * 100), (int) (PendulumSimulation.HEIGHT / 2 + y * 100));
    }
}
