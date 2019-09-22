package math.function;

import java.awt.*;

/**
 * Transcendental function
 */
public class TranscendentalFunction implements FunctionInterface {

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "Funkcija g(x)";
    }

    /**
     * Gets the function's color
     *
     * @return
     */
    @Override
    public Color getColor() {
        return Color.CYAN;
    }

    /**
     * Gets the function's value for the specified x
     *
     * @param x x value
     * @return
     */
    @Override
    public double getValue(double x) {
        return 2 * x * Math.sin(x) - Math.pow((x / 2 + 2), 2);
    }

    /**
     * Gets the right-most x of the function
     *
     * @return
     */
    @Override
    public double getLeftMostX() {
        return -10;
    }

    /**
     * Gets the left-most x of the function
     *
     * @return
     */
    @Override
    public double getRightMostX() {
        return 10;
    }

    /**
     * Gets the function's point count
     *
     * @return
     */
    @Override
    public int getPointCount() {
        return 200;
    }

    /**
     * Does any actions the function requires
     */
    @Override
    public void initialize() {
        // NOTHING TO DO
    }
}
