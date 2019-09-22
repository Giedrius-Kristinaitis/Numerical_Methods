package math.function.scanning;

import math.function.FunctionInterface;

/**
 * Finds function's roots using simple iteration algorithm
 */
public class SimpleIterationAlgorithm extends AbstractRefinerAlgorithm {

    /**
     * Default class constructor
     */
    public SimpleIterationAlgorithm(double precision, int maxIterations) {
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
        double x = leftBound;

        System.out.print("Pradinis artinys: " + x);

        double alpha = Math.signum(function.getValue(leftBound)) <= 0 ? leftBound : -leftBound;

        System.out.print(" | Alpha: " + alpha);

        double epsilon = 1e10;

        while (epsilon > precision) {
            if (currentIteration >= maxIterations) {
                System.out.print(" | Virsytas iteraciju limitas");
                return;
            }

            double nextX = function.getValue(x) / alpha + x;

            epsilon = Math.abs(x - nextX);

            x = nextX;

            currentIteration++;
        }

        System.out.print(" | Rasta saknis su x ~= " + x);
    }
}
