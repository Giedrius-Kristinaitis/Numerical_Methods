package math.function.scanning;

import math.function.FunctionInterface;

/**
 * Scans a function for it's roots
 */
public class FunctionScanner implements ScannerInterface {

    // algorithm to refine root values
    private RefinerAlgorithmInterface refinerAlgorithm;

    // function to scan
    private FunctionInterface function;

    // should root intervals be printed in the console
    private boolean printIntervals;

    /**
     * Default class constructor
     *
     * @param printIntervals should intervals be printed
     */
    public FunctionScanner(boolean printIntervals) {
        this.printIntervals = printIntervals;
    }

    /**
     * Sets the refiner algorithm to refine root values, pass null
     * if root values should not be refined
     *
     * @param refiner refiner algorithm
     */
    @Override
    public void setRefinerAlgorithm(RefinerAlgorithmInterface refiner) {
        this.refinerAlgorithm = refiner;
    }

    /**
     * Gets the refiner algorithm
     *
     * @return
     */
    @Override
    public RefinerAlgorithmInterface getRefinerAlgorithm() {
        return refinerAlgorithm;
    }

    /**
     * Sets the function to scan
     *
     * @param function function to scan
     */
    @Override
    public void setFunction(FunctionInterface function) {
        this.function = function;
    }

    /**
     * Performs function scanning
     */
    @Override
    public void scan() {
        double scanStep = Math.abs(function.getRightMostX() - function.getLeftMostX()) / 20D;
        double x = function.getLeftMostX();
        boolean found = false;

        while (x < function.getRightMostX()) {
            double x2 = Math.min(function.getRightMostX(), x + scanStep);

            double valueAtX = function.getValue(x);
            double valueAtX2 = function.getValue(x2);

            if (Math.signum(valueAtX) != Math.signum(valueAtX2)) {
                found = true;

                // a root is between x and x2, apply refiner algorithm if needed
                if (refinerAlgorithm != null) {
                    refinerAlgorithm.resetState();
                    refinerAlgorithm.apply(function, x, x2);
                    System.out.println(" | Iteraciju skaicius: " + refinerAlgorithm.getCurrentIteration());
                }

                if (printIntervals) {
                    System.out.println("Rastas saknies intervalas:");
                    System.out.println("Reziai: (" + x + "; " + x2 + ")");
                }
            }

            x = x2;
        }

        if (!found) {
            System.out.println("Saknu nerasta");
        }
    }
}
