package action;

import math.function.FunctionInterface;
import math.function.scanning.FunctionScanner;
import math.function.scanning.ScannerInterface;

import java.awt.event.ActionEvent;

/**
 * Scans a function for root intervals using constant scanning step
 */
public class ConstantStepScanningMethodAction extends ScanningAction {

    /**
     * Default class constructor
     *
     * @param function function to scan
     */
    public ConstantStepScanningMethodAction(FunctionInterface function) {
        ScannerInterface scanner = new FunctionScanner(true);
        scanner.setFunction(function);
        setScanner(scanner);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Skenavimo metodas nekintanciu zingsniu:");

        super.actionPerformed(event);
    }
}
