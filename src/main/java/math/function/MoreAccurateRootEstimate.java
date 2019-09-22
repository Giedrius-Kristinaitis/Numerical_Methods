package math.function;

import java.awt.*;

/**
 * Estimates root interval more accurately than the rough algorithm
 */
public class MoreAccurateRootEstimate extends RoughRootEstimate {

    /**
     * Default class constructor
     */
    public MoreAccurateRootEstimate(PolynomialInterface polynomial) {
        super(polynomial);
    }

    /**
     * Gets the function's title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "Tikslesnis ivertis";
    }

    /**
     * Gets the function's color
     *
     * @return
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }

    /**
     * Does any actions the function requires
     */
    @Override
    public void initialize() {
        if (polynomial.getMultiplier(0) < 0) {
            throw new RuntimeException("Polynomial's first multiplier cannot be negative");
        }

        if (polynomial.getBiggestExponentWithNegativeMultiplier(false, 0, polynomial.size() - 1) < 1) {
            throw new RuntimeException("Polynomial must have negative multipliers");
        }

        double R = Math.abs(1 + (polynomial.getMaxAbsoluteMultiplier(1, polynomial.size() - 1) / polynomial.getMultiplier(0)));
        double B = polynomial.getLowestNegativeMultiplier(false, 1, polynomial.size() - 1);
        double K = polynomial.getExponent(0) - polynomial.getBiggestExponentWithNegativeMultiplier(false, 1, polynomial.size() - 1);
        double positiveR = 1 + Math.pow(B / polynomial.getMultiplier(0), 1 / K);

        B = polynomial.getLowestNegativeMultiplier(true, 1, polynomial.size() - 1);
        K = polynomial.getExponent(0) - polynomial.getBiggestExponentWithNegativeMultiplier(true, 1, polynomial.size() - 1);

        double negativeR = 1 + Math.pow(B / polynomial.getMultiplier(0), 1 / K);

        if (polynomial.getBiggestExponentWithNegativeMultiplier(true, 0, polynomial.size() - 1) < 1) {
            negativeR = 0;
        }

        leftX = -Math.min(R, negativeR);
        rightX = Math.min(R, positiveR);

        System.out.println("Tikslesnis saknu intervalo ivertis: ");
        System.out.println("Reziai: (" + leftX + "; " + rightX + ")");
    }
}
