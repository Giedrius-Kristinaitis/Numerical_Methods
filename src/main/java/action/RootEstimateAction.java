package action;

import math.function.PolynomialInterface;
import math.function.MoreAccurateRootEstimate;
import math.function.RoughRootEstimate;

/**
 * Plots root estimate functions
 */
public class RootEstimateAction extends GraphAction {

    /**
     * Default class constructor
     */
    public RootEstimateAction(PolynomialInterface polynomial) {
        super(new RoughRootEstimate(polynomial), new MoreAccurateRootEstimate(polynomial));
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
