/*
 * AUTHOR: CALEB PRINCEWILL NWOKOCHA
 * SCHOOL: THE UNIVERSITY OF MANITOBA
 * DEPARTMENT: COMPUTER SCIENCE
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        // NAIVE MEAN
        double[] data1 = new double[] {4.0, 36.0, 45.0, 50.0, 75.0};
        NaiveMean naiveMean = new NaiveMean(data1);
        System.out.println("NAIVE MEAN:");
        System.out.println("\nArithmetic mean of " + Arrays.toString(data1) + " is " + naiveMean.arithmeticMean());
        System.out.println("Geometric mean of " + Arrays.toString(data1) + " is " + naiveMean.geometricMean());
        System.out.println("Harmonic mean of " + Arrays.toString(data1) + " is " + naiveMean.harmonicMean());
        System.out.println("Power mean of " + Arrays.toString(data1) + " is " + naiveMean.powerMean(-1.0));

        // DYNAMIC MEAN
        ArrayList<Double> data2 = new ArrayList<>();
        data2.add(generateDatum(0));
        DynamicMean dynamicMean = new DynamicMean(generateDatum(0));
        System.out.println("\nDYNAMIC MEAN:");
        for (int time = 1; time <= 4; time++) {
            double datum = generateDatum(time);
            data2.add(datum);
            System.out.println("\nAt time " + (time + 1));
            System.out.println("Arithmetic mean of " + Arrays.toString(new ArrayList[]{data2}) + " is " + dynamicMean.arithmeticMean(time, datum));
            System.out.println("Geometric mean of " + Arrays.toString(new ArrayList[]{data2}) + " is " + dynamicMean.geometricMean(time, datum));
            System.out.println("Harmonic mean of " + Arrays.toString(new ArrayList[]{data2}) + " is " + dynamicMean.harmonicMean(time, datum));
            System.out.println("Power mean of " + Arrays.toString(new ArrayList[]{data2}) + " is " + dynamicMean.powerMean(-1.0, time, datum));
        }
    }

    private static double generateDatum(int time) {
        double[] data = new double[] {4.0, 36.0, 45.0, 50.0, 75.0};
        return data[time];
    }
}


