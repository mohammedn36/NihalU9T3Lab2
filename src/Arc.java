import java.awt.Graphics;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Barb Ericson
 */
public class Arc extends Shape {
    private int startAngle;
    private int endAngle;
    /** Constructor */
    public Arc() {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    /** Draw the shape
     * @param g   the graphics context on which to draw
     */
    @Override
    public void draw(Graphics g) {
        // set the color
        g.setColor(getColor());

        // draw the rectangle given the top left point and width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, endAngle); // the getter methods here are INHERITED FROM SHAPE!
    }
}


