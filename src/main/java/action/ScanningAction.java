package action;

import math.function.scanning.RefinerAlgorithmInterface;
import math.function.scanning.ScannerInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Scans a function for roots
 */
public abstract class ScanningAction implements ActionListener {

    // scanner to use
    private ScannerInterface scanner;

    /**
     * Sets scanner to use
     *
     * @param scanner scanner to use
     */
    public void setScanner(ScannerInterface scanner) {
        this.scanner = scanner;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        scanner.scan();
        System.out.println();
    }
}
