package action;

import math.function.FunctionInterface;
import math.function.scanning.ChangingStepScanningAlgorithm;
import math.function.scanning.FunctionScanner;
import math.function.scanning.ScannerInterface;

import java.awt.event.ActionEvent;

/**
 * Scans a function for roots using a changing scanning step
 */
public class ChangingStepScanningMethodAction extends ScanningAction {

    /**
     * Default class constructor
     *
     * @param function function to scan
     */
    public ChangingStepScanningMethodAction(FunctionInterface function) {
        ScannerInterface scanner = new FunctionScanner(false);
        scanner.setFunction(function);
        scanner.setRefinerAlgorithm(new ChangingStepScanningAlgorithm(0.001D, 1000));
        setScanner(scanner);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Skenavimo metodas kintanciu zingsniu:");

        super.actionPerformed(event);
    }
}
