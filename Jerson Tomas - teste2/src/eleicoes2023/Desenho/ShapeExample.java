package eleicoes2023.Desenho;

import javax.swing.*;
import java.awt.*;

public class ShapeExample extends JFrame {
    public ShapeExample() {
        setTitle("Geometric Shape Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw the rectangle
        g.setColor(Color.BLACK);
        g.drawRect(100, 50, 200, 500);

        // Draw the circles
        int circleX = 150;
        int circleY = 100;
        int circleSize = 100;

        // First circle (red)
        g.setColor(Color.RED);
        g.fillOval(circleX, circleY, circleSize, circleSize);

        // Second circle (yellow)
        g.setColor(Color.YELLOW);
        g.fillOval(circleX, circleY + circleSize + 50, circleSize, circleSize);

        // Third circle (green)
        g.setColor(Color.GREEN);
        g.fillOval(circleX, circleY + (circleSize + 50) * 2, circleSize, circleSize);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapeExample());
    }
}

