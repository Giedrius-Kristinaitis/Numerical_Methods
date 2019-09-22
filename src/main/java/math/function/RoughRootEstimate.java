package math.function;

import java.awt.*;

/**
 * Roughly estimates root interval
 */
public class RoughRootEstimate extends RootEstimate {

    /**
     * Default class constructor
     */
    public RoughRootEstimate(PolynomialInterface polynomial) {
        super(polynomial);
    }

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "Grubus ivertis";
    }

    /**
     * Gets the function's color
     *
     * @return
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    /**
     * Does any actions the function requires
     */
    @Override
    public void initialize() {
        double bound = Math.abs(1 + (polynomial.getMaxAbsoluteMultiplier(1, polynomial.size() - 1) / polynomial.getMultiplier(0)));

        leftX = -bound;
        rightX = bound;

        System.out.println("Grubus saknu intervalo ivertis: ");
        System.out.println("Reziai: (-" + bound + "; " + bound + ")");
    }
}
