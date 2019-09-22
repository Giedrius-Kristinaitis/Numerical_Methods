package math.function;

import java.util.Collection;

/**
 * Represents a polynomial
 */
public interface PolynomialInterface {

    /**
     * Sets multipliers
     *
     * @param multipliers multipliers
     */
    void setMultipliers(Collection<Double> multipliers);

    /**
     * Sets exponents
     *
     * @param exponents exponents
     */
    void setExponents(Collection<Double> exponents);

    /**
     * Gets all x multipliers
     *
     * @return
     */
    Iterable<Double> getMultipliers();

    /**
     * Gets all x exponents
     *
     * @return
     */
    Iterable<Double> getExponents();

    /**
     * Gets the specified x multiplier
     *
     * @param index x index
     * @return
     */
    double getMultiplier(int index);

    /**
     * Gets the specified x exponent
     *
     * @param index x index
     * @return
     */
    double getExponent(int index);

    /**
     * Gets the polynomial's value with the specified x
     *
     * @param x polynomial's x
     * @return
     */
    double getValue(double x);

    /**
     * Gets the highest multiplier from the specified bounds
     *
     * @param start starting index
     * @param end   ending index
     * @return
     */
    double getMaxMultiplier(int start, int end);

    /**
     * Gets the highest absolute multiplier from the specified bounds
     *
     * @param start starting index
     * @param end   ending index
     * @return
     */
    double getMaxAbsoluteMultiplier(int start, int end);

    /**
     * Gets the size of the polynomial
     *
     * @return
     */
    int size();

    /**
     * Gets a flipped multiplier
     *
     * @param index multiplier index
     * @return
     */
    double getFlippedMultiplier(int index);

    /**
     * Gets the lowest negative multiplier
     *
     * @param flipped should the multipliers be flipped
     * @param start   starting index
     * @param end     ending index
     * @return
     */
    double getLowestNegativeMultiplier(boolean flipped, int start, int end);

    /**
     * Gets the biggest exponent with a negative multiplier
     *
     * @param flipped should the multipliers be flipped
     * @param start   starting index
     * @param end     ending index
     * @return
     */
    double getBiggestExponentWithNegativeMultiplier(boolean flipped, int start, int end);
}
