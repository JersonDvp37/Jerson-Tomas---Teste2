package eleicoes2023.Desenho;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeometricShapes extends JPanel {
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int rectangleWidth = 200;
        int rectangleHeight = 400;
        int rectangleX = 50;
        int rectangleY = 50;

        // Draw the first vertical rectangle
        Rectangle2D rectangle = new Rectangle2D.Double(rectangleX, rectangleY, rectangleWidth, rectangleHeight);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle);

        // Draw the three circles inside the first rectangle
        int circleRadius = 50;
        int circleX = rectangleX + (rectangleWidth / 2) - (circleRadius / 2);

        // Circle 1 - Red
        int circle1Y = rectangleY + 50;
        Ellipse2D circle1 = new Ellipse2D.Double(circleX, circle1Y, circleRadius, circleRadius);
        g2d.setColor(Color.RED);
        g2d.fill(circle1);

        // Circle 2 - Yellow
        int circle2Y = circle1Y + 100;
        Ellipse2D circle2 = new Ellipse2D.Double(circleX, circle2Y, circleRadius, circleRadius);
        g2d.setColor(Color.YELLOW);
        g2d.fill(circle2);

        // Circle 3 - Green
        int circle3Y = circle2Y + 100;
        Ellipse2D circle3 = new Ellipse2D.Double(circleX, circle3Y, circleRadius, circleRadius);
        g2d.setColor(Color.GREEN);
        g2d.fill(circle3);

        // Draw the second vertical rectangle
        int rectangle2X = rectangleX + rectangleWidth + 0;
        int rectangle2Y = rectangleY;
        Rectangle2D rectangle2 = new Rectangle2D.Double(250, 200
                , rectangleWidth, 250);
        g2d.setColor(Color.BLACK);
        g2d.draw(rectangle2);

        // Draw the two circles inside the second rectangle
        int circle2X = rectangle2X + (rectangleWidth / 2) - (circleRadius / 2);

        // Circle 1 - Blue
        int circle4Y = rectangle2Y + 50;
        Ellipse2D circle4 = new Ellipse2D.Double(circle2X, circle4Y, circleRadius, circleRadius);
        g2d.setColor(Color.BLACK);
        g2d.fill(circle4);

        // Circle 2 - Green with arrow
        int circle5Y = circle4Y + 100;
        Ellipse2D circle5 = new Ellipse2D.Double(circle2X, circle5Y, circleRadius, circleRadius);
        g2d.setColor(Color.WHITE);
        g2d.fill(circle5);

        // Draw the green arrow inside Circle 5
        int arrowWidth = 15;
        int arrowHeight = 30;
        int arrowX = circle2X + (circleRadius / 2) - (arrowWidth / 2);
        int arrowY = circle5Y + (circleRadius / 2) - (arrowHeight / 2);

        // Rotate the arrow to point upwards
        AffineTransform oldTransform = g2d.getTransform();
        AffineTransform newTransform = new AffineTransform();
        newTransform.rotate(-Math.PI / 2, arrowX + (arrowWidth / 2), arrowY + (arrowHeight / 2));
        g2d.setTransform(newTransform);

        // Draw the arrow
        g2d.setColor(Color.GREEN);
        g2d.fill(new Rectangle2D.Double(arrowX, arrowY, arrowWidth, arrowHeight));

        // Reset the transformation
        g2d.setTransform(oldTransform);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        GeometricShapes panel = new GeometricShapes();
        frame.add(panel);

        frame.setVisible(true);
    }
}
