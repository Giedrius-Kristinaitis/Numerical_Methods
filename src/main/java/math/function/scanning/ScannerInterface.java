package math.function.scanning;

import math.function.FunctionInterface;

/**
 * Scans a function
 */
public interface ScannerInterface {

    /**
     * Sets the refiner algorithm to refine root values, pass null
     * if root values should not be refined
     *
     * @param refiner refiner algorithm
     */
    void setRefinerAlgorithm(RefinerAlgorithmInterface refiner);

    /**
     * Gets the refiner algorithm
     *
     * @return
     */
    RefinerAlgorithmInterface getRefinerAlgorithm();

    /**
     * Sets the function to scan
     *
     * @param function function to scan
     */
    void setFunction(FunctionInterface function);

    /**
     * Performs function scanning
     */
    void scan();
}
