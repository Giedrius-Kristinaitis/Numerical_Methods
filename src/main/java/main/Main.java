package main;

import action.*;
import math.function.*;

import javax.swing.*;
import java.util.Arrays;

/**
 * Main class
 */
public class Main {

    /**
     * Entry point of the program
     *
     * @param args arguments for the program
     */
    public static void main(String[] args) {
        new Main();
    }

    // function data
    private PolynomialInterface polynomial;
    private FunctionInterface transcendentalFunction;
    private FunctionInterface derivative;

    // actions
    private GraphAction rootEstimateAction;
    private GraphAction transcendentalAction;
    private ScanningAction constantStepScanningAction;
    private ScanningAction changingStepScanningAction;
    private ScanningAction simpleIterationAction;
    private ScanningAction newtonAction;

    /**
     * Default class constructor
     */
    private Main() {
        createData();
        showWindow();
    }

    /**
     * Creates data for functions
     */
    private void createData() {
        polynomial = new Polynomial();
        polynomial.setMultipliers(Arrays.asList(0.16, -1.57, 4.38, -1.15, -6.29, 0.15));
        polynomial.setExponents(Arrays.asList(5D, 4D, 3D, 2D, 1D, 0D));

        transcendentalFunction = new TranscendentalFunction();
        derivative = new DerivativeFunction();

        rootEstimateAction = new RootEstimateAction(polynomial);
        transcendentalAction = new FunctionPlotAction(transcendentalFunction);
        constantStepScanningAction = new ConstantStepScanningMethodAction(transcendentalFunction);
        changingStepScanningAction = new ChangingStepScanningMethodAction(transcendentalFunction);
        simpleIterationAction = new SimpleIterationAction(transcendentalFunction);
        newtonAction = new NewtonAction(derivative, transcendentalFunction);
    }

    /**
     * Shows application's window
     */
    private void showWindow() {
        JFrame frame = new JFrame();
        frame.setTitle("L1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(64, 64, 512, 636);
        frame.setLayout(null);
        initializeUI(frame);
        frame.setVisible(true);
    }

    /**
     * Initializes user interface
     *
     * @param frame frame to put components into
     */
    private void initializeUI(JFrame frame) {
        JButton first = new JButton("Funkcijos f(x) saknu iverciai");
        JButton second = new JButton("Funkcijos g(x) grafikas nuo -10 iki 10");
        JButton third = new JButton("Skenavimo metodas nekintanciu zingsniu g(x)");
        JButton fourth = new JButton("Skenavimo metodas kintanciu zingsniu g(x)");
        JButton fifth = new JButton("Paprastuju iteraciju metodas g(x)");
        JButton sixth = new JButton("Niutono (liestiniu) metodas g(x)");

        first.addActionListener(rootEstimateAction);
        second.addActionListener(transcendentalAction);
        third.addActionListener(constantStepScanningAction);
        fourth.addActionListener(changingStepScanningAction);
        fifth.addActionListener(simpleIterationAction);
        sixth.addActionListener(newtonAction);

        frame.add(first).setBounds(0, 0, 512, 100);
        frame.add(second).setBounds(0, 100, 512, 100);
        frame.add(third).setBounds(0, 200, 512, 100);
        frame.add(fourth).setBounds(0, 300, 512, 100);
        frame.add(fifth).setBounds(0, 400, 512, 100);
        frame.add(sixth).setBounds(0, 500, 512, 100);
    }
}
