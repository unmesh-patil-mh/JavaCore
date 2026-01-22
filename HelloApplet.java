import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="HelloApplet.class" width="300" height="100"></applet>
*/

public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Unmesh! Welcome to Java Applets.", 50, 50);
    }
}