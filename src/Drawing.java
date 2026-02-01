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
        g.drawRect(x, 300, rectWidth, 100);



    }
    public void update(){
        x -= speed;

        if (x + rectWidth < 0) {   // fully off the left side
            x = getWidth();        // teleport to right edge
        }
    }
    double gravity = 0.5;
    double friction = 0.97;
    int velo = 0;
    int y = HEIGHT/2+20;
    public void player(){
        return {
                x: WIDTH/4,
                size: 40;
                y: height/2 + 20,
                col: color(255, 80, 120),
                velocity: 0,
                jumpSpeed: 15,
    }
    public void move(){
this.velo += gravity;
this.velo *= friction;
this.y = this.velo;
    }

}



