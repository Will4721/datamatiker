import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Drawing extends Canvas {

    int x = 400;          // position persists now
    int speed = 3;
    int rectWidth = 60;

    public Drawing() {
        new Timer(16, e -> {
            update();
            repaint();
        }).start();
    }
    public static void main(String[] args){

        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);}


    public void paint(Graphics g) {

        g.fillRect(100, 200, 20, 20);
        g.drawRect(x, 0, rectWidth, 100);
        g.drawRect(x, 400, rectWidth, -100);



    }
    public void update(){
        x -= speed;

        if (x + rectWidth < 0) {   // fully off the left side
            x = getWidth();        // teleport to right edge
        }
    }

}



