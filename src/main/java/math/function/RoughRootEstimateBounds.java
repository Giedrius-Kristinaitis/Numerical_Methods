package math.function;

/**
 * Function to draw rough root estimate's bounds
 */
public class RoughRootEstimateBounds extends RoughRootEstimate {

    /**
     * Default class constructor
     *
     * @param polynomial
     */
    public RoughRootEstimateBounds(PolynomialInterface polynomial) {
        super(polynomial);
    }

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "+-R";
    }

    /**
     * Checks if the function points' shapes are visible
     *
     * @return
     */
    @Override
    public boolean areShapesVisible() {
        return true;
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
        return true;
    }
}
