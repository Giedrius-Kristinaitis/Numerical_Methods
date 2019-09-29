package math.function;

import java.awt.*;

/**
 * Function representation
 */
public interface FunctionInterface {

    /**
     * Gets the function's title
     *
     * @return
     */
    String getTitle();

    /**
     * Gets the right-most x of the function
     *
     * @return
     */
    double getLeftMostX();

    /**
     * Gets the left-most x of the function
     *
     * @return
     */
    double getRightMostX();

    /**
     * Gets function's value at the specified point
     *
     * @param x x to calculate function value
     * @return
     */
    double getValue(double x);

    /**
     * Gets the function's point count
     *
     * @return
     */
    int getPointCount();

    /**
     * Gets the function's color
     *
     * @return
     */
    Color getColor();

    /**
     * Does any actions the function requires
     */
    void initialize();

    /**
     * Checks if the function points' shapes are visible
     *
     * @return
     */
    boolean areShapesVisible();

    /**
     * Checks if the function's lines are visible
     *
     * @return
     */
    boolean areLinesVisible();
}
