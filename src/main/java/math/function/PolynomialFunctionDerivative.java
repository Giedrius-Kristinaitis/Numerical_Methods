package math.function;

import java.awt.*;

public class PolynomialFunctionDerivative implements FunctionInterface {

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "";
    }

    /**
     * Gets the right-most x of the function
     *
     * @return
     */
    @Override
    public double getLeftMostX() {
        return -40.3125;
    }

    /**
     * Gets the left-most x of the function
     *
     * @return
     */
    @Override
    public double getRightMostX() {
        return 40.3125;
    }

    /**
     * Gets function's value at the specified point
     *
     * @param x x to calculate function value
     * @return
     */
    @Override
    public double getValue(double x) {
        return 0.8 * Math.pow(x, 4) - 6.28 * Math.pow(x, 3) + 13.14 * Math.pow(x, 2) - 2.3 * x - 6.29;
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
     * Gets the function's color
     *
     * @return
     */
    @Override
    public Color getColor() {
        return Color.BLACK;
    }

    /**
     * Does any actions the function requires
     */
    @Override
    public void initialize() {

    }

    /**
     * Checks if the function points' shapes are visible
     *
     * @return
     */
    @Override
    public boolean areShapesVisible() {
        return false;
    }

    /**
     * Checks if the function's lines are visible
     *
     * @return
     */
    @Override
    public boolean areLinesVisible() {
        return false;
    }

    /**
     * Checks if only the function's bounds need to be rendered
     *
     * @return
     */
    @Override
    public boolean onlyRenderBounds() {
        return false;
    }
}
