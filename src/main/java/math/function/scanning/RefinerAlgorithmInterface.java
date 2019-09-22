package math.function.scanning;

import math.function.FunctionInterface;

/**
 * An algorithm that refines root value in a root interval
 */
public interface RefinerAlgorithmInterface {

    /**
     * Applies the refiner algorithm to the specified function in the given bounds
     *
     * @param function   function to apply the algorithm to
     * @param leftBound  interval's left bound
     * @param rightBound interval's right bound
     */
    void apply(FunctionInterface function, double leftBound, double rightBound);

    /**
     * Gets the number of the current iteration
     *
     * @return
     */
    int getCurrentIteration();

    /**
     * Resets the algorithm's state
     */
    void resetState();
}
