package math.function.scanning;

/**
 * An abstract refiner algorithm
 */
public abstract class AbstractRefinerAlgorithm implements RefinerAlgorithmInterface {

    // calculation precision
    protected double precision;

    // maximum allowed iterations
    protected int maxIterations;

    // current iteration
    protected int currentIteration;

    /**
     * Default class constructor
     */
    public AbstractRefinerAlgorithm(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Gets the number of the current iteration
     *
     * @return
     */
    @Override
    public int getCurrentIteration() {
        return currentIteration;
    }

    /**
     * Resets the algorithm's state
     */
    @Override
    public void resetState() {
        currentIteration = 0;
    }
}
