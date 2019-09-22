package math.function.scanning;

import math.function.FunctionInterface;

/**
 * Finds function's roots using Newton's method
 */
public class NewtonAlgorithm extends AbstractRefinerAlgorithm {

    // scanned function's derivative
    private FunctionInterface derivative;

    /**
     * Default class constructor
     */
    public NewtonAlgorithm(FunctionInterface derivative, double precision, int maxIterations) {
        super(precision, maxIterations);

        this.derivative = derivative;
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
        double x = (leftBound + rightBound) / 2D;

        System.out.print("Pradinis artinys: " + x);

        double epsilon = 1e10;

        while (epsilon > precision) {
            if (currentIteration >= maxIterations) {
                System.out.print(" | Virsytas iteraciju limitas");
                return;
            }

            double nextX = x - (1 / derivative.getValue(x)) * function.getValue(x);

            epsilon = Math.abs(nextX - x);

            x = nextX;

            currentIteration++;
        }

        System.out.print(" | Rasta saknis su x ~= " + x);
    }
}
