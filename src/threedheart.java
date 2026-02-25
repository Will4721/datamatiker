import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class threedheart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Big Beating Heart");
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        JPanel renderPanel = new JPanel() {
            // Start-skalaen er sat op for at gøre hjertet større med det samme
            double scaleFactor = 15.0;
            double delta = 0.05;

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // Flyt til midten
                g2.translate(getWidth() / 2, getHeight() / 2);

                // Vi bruger scaleFactor til at styre "pulsen"
                g2.scale(scaleFactor, -scaleFactor);

                // Farven på hjertet (en dyb rød)
                g2.setColor(new Color(255, 0, 50));

                // Tegn selve hjertet
                Path2D path = new Path2D.Double();
                boolean first = true;
                for (double t = 0; t <= 2 * Math.PI; t += 0.02) {
                    // Matematisk hjerteform
                    double x = 16 * Math.pow(Math.sin(t), 3);
                    double y = 13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t);

                    if (first) {
                        path.moveTo(x, y);
                        first = false;
                    } else {
                        path.lineTo(x, y);
                    }
                }
                path.closePath();
                g2.fill(path);

                // Animation: Opdaterer størrelsen for at skabe et "beat"
                scaleFactor += delta;
                if (scaleFactor > 18 || scaleFactor < 15) {
                    delta *= -1;
                }
            }
        };

        pane.add(renderPanel, BorderLayout.CENTER);

        Timer timer = new Timer(15, e -> renderPanel.repaint());
        timer.start();

        frame.setSize(800, 800); // Gjort vinduet lidt større også
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
