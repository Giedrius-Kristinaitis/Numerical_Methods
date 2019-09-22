package action;

import math.function.FunctionInterface;
import math.function.scanning.FunctionScanner;
import math.function.scanning.NewtonAlgorithm;
import math.function.scanning.ScannerInterface;
import math.function.scanning.SimpleIterationAlgorithm;

import java.awt.event.ActionEvent;

/**
 * Finds function's roots using Newton's method
 */
public class NewtonAction extends ScanningAction {

    /**
     * Default class constructor
     */
    public NewtonAction(FunctionInterface derivative, FunctionInterface function) {
        ScannerInterface scanner = new FunctionScanner(false);
        scanner.setFunction(function);
        scanner.setRefinerAlgorithm(new NewtonAlgorithm(derivative, 0.001D, 1000));
        setScanner(scanner);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Niutono (liestiniu) metodas: ");

        super.actionPerformed(event);
    }
}
