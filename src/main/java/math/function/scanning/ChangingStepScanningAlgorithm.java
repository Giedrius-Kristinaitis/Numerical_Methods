package math.function.scanning;

import math.function.FunctionInterface;

/**
 * Looks for function's root using a changing scanning step
 */
public class ChangingStepScanningAlgorithm extends AbstractRefinerAlgorithm {

    /**
     * Default class constructor
     */
    public ChangingStepScanningAlgorithm(double precision, int maxIterations) {
        super(precision, maxIterations);
    }

    /**
     * Applies the refiner algorithm to the specified function in the given bounds
     *
     * @param function   function to apply the algorithm to
     * @param leftBound  interval's left bound
     * @param rightBound interval's right bound
     */
    @Override
    public void apply(FunctionInterface function, double leftBound, double rightBound) {
        double scanStep = Math.abs(rightBound - leftBound) / 10D;

        if (scanStep <= precision) {
            System.out.print("Rasta saknis su x ~= " + (leftBound + (rightBound - leftBound) / 2) + " | Skenavimo zingsnis: " + scanStep);
            return;
        }

        double x = leftBound;

        while (x < rightBound) {
            if (currentIteration >= maxIterations) {
                System.out.print("Virsytas iteraciju limitas");
                return;
            }

            double x2 = Math.min(rightBound, x + scanStep);

            double valueAtX = function.getValue(x);
            double valueAtX2 = function.getValue(x2);

            if (Math.signum(valueAtX) != Math.signum(valueAtX2)) {
                apply(function, x, x2);
            }

            x = x2;
            currentIteration++;
        }
    }
}
