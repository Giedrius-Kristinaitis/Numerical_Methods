package action;

import math.function.FunctionInterface;
import math.function.scanning.FunctionScanner;
import math.function.scanning.ScannerInterface;
import math.function.scanning.SimpleIterationAlgorithm;

import java.awt.event.ActionEvent;

/**
 * Finds function's roots using simple iteration algorithm
 */
public class SimpleIterationAction extends ScanningAction {

    /**
     * Default class constructor
     *
     * @param function function to scan
     */
    public SimpleIterationAction(FunctionInterface function) {
        ScannerInterface scanner = new FunctionScanner(false);
        scanner.setFunction(function);
        scanner.setRefinerAlgorithm(new SimpleIterationAlgorithm(0.001D, 1000));
        setScanner(scanner);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Paprastu iteraciju metodas: ");

        super.actionPerformed(event);
    }
}
