import java.awt.*;

public class Arc extends Shape {

    private int startAngle;
    private int arcAngle;

    public Arc() {
        super();
        startAngle = 20;
        arcAngle = 60;
    }

    @Override
    public void draw(Graphics g) {
        // set the color
        g.setColor(Color.WHITE);

        // draw the arc given the top left point and width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle); // the getter methods here are INHERITED FROM SHAPE!
    }

}
