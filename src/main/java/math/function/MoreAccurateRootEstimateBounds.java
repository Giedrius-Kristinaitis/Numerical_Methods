package math.function;

/**
 * Function to draw more accurate root estimate's bounds
 */
public class MoreAccurateRootEstimateBounds extends MoreAccurateRootEstimate {

    /**
     * Default class constructor
     *
     * @param polynomial
     */
    public MoreAccurateRootEstimateBounds(PolynomialInterface polynomial) {
        super(polynomial);
    }

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "Rneig, Rteig";
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
