package math.function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A polynomial
 */
public class Polynomial implements PolynomialInterface {

    // multipliers
    private List<Double> multipliers = new ArrayList<Double>();

    // exponents
    private List<Double> exponents = new ArrayList<Double>();

    /**
     * Sets multipliers
     *
     * @param multipliers multipliers
     */
    @Override
    public void setMultipliers(Collection<Double> multipliers) {
        this.multipliers.addAll(multipliers);
    }

    /**
     * Sets exponents
     *
     * @param exponents exponents
     */
    @Override
    public void setExponents(Collection<Double> exponents) {
        this.exponents.addAll(exponents);
    }

    /**
     * Gets all x multipliers
     *
     * @return
     */
    @Override
    public Iterable<Double> getMultipliers() {
        return multipliers;
    }

    /**
     * Gets all x exponents
     *
     * @return
     */
    @Override
    public Iterable<Double> getExponents() {
        return exponents;
    }

    /**
     * Gets the specified x multiplier
     *
     * @param index x index
     * @return
     */
    @Override
    public double getMultiplier(int index) {
        return multipliers.get(index);
    }

    /**
     * Gets the specified x exponent
     *
     * @param index x index
     * @return
     */
    @Override
    public double getExponent(int index) {
        return exponents.get(index);
    }

    /**
     * Gets the polynomial's value with the specified x
     *
     * @param x polynomial's x
     * @return
     */
    @Override
    public double getValue(double x) {
        double value = 0;

        for (int i = 0; i < multipliers.size(); i++) {
            value += multipliers.get(i) * Math.pow(x, exponents.get(i));
        }

        return value;
    }

    /**
     * Gets the highest multiplier from the specified bounds
     *
     * @param start starting index
     * @param end   ending index
     * @return
     */
    @Override
    public double getMaxMultiplier(int start, int end) {
        double max = Double.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            if (multipliers.get(i) > max) {
                max = multipliers.get(i);
            }
        }

        return max;
    }

    /**
     * Gets the highest absolute multiplier from the specified bounds
     *
     * @param start starting index
     * @param end   ending index
     * @return
     */
    @Override
    public double getMaxAbsoluteMultiplier(int start, int end) {
        double max = Double.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            if (Math.abs(multipliers.get(i)) > max) {
                max = Math.abs(multipliers.get(i));
            }
        }

        return max;
    }

    /**
     * Gets the size of the polynomial
     *
     * @return
     */
    @Override
    public int size() {
        return multipliers.size();
    }

    /**
     * Gets a flipped multiplier
     *
     * @param index multiplier index
     * @return
     */
    @Override
    public double getFlippedMultiplier(int index) {
        double sign = 0;

        if (size() % 2 == 0) {
            sign = 1;
        } else {
            sign = -1;
        }

        return sign * multipliers.get(index) * Math.pow(1, exponents.get(index));
    }

    /**
     * Gets the lowest negative multiplier
     *
     * @param flipped should the multipliers be flipped
     * @param start   starting index
     * @param end     ending index
     * @return
     */
    @Override
    public double getLowestNegativeMultiplier(boolean flipped, int start, int end) {
        double min = Double.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            double multiplier = flipped ? getFlippedMultiplier(i) : getMultiplier(i);

            if (multiplier < min) {
                min = multiplier;
            }
        }

        if (min < 0) {
            return Math.abs(min);
        }

        return 0;
    }

    /**
     * Gets the biggest exponent with a negative multiplier
     *
     * @param flipped should the multipliers be flipped
     * @param start   starting index
     * @param end     ending index
     * @return
     */
    @Override
    public double getBiggestExponentWithNegativeMultiplier(boolean flipped, int start, int end) {
        double maxExponent = Double.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            double multiplier = flipped ? getFlippedMultiplier(i) : getMultiplier(i);

            if (multiplier < 0 && exponents.get(i) > maxExponent) {
                maxExponent = exponents.get(i);
            }
        }

        return maxExponent < 0 ? 0 : maxExponent;
    }
}
