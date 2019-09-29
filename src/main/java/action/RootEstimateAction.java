package action;

import math.function.*;

/**
 * Plots root estimate functions
 */
public class RootEstimateAction extends GraphAction {

    /**
     * Default class constructor
     */
    public RootEstimateAction(PolynomialInterface polynomial) {
        super(new RoughRootEstimate(polynomial), new MoreAccurateRootEstimate(polynomial),
                new RoughRootEstimateBounds(polynomial), new MoreAccurateRootEstimateBounds(polynomial));
    }

    /**
     * Gets chart title
     *
     * @return
     */
    @Override
    public String getTitle() {
        return "Saknu iverciai";
    }
}
