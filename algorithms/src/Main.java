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
        ArrayList<Double> data1 = new ArrayList<>();
        data1.add(generateDatum(0));
        BruteForceMean bruteForceMean = new BruteForceMean();
        System.out.println("BRUTE-FORCE MEAN:");
        for (int time = 1; time <= 4; time++) {
            double datum = generateDatum(time);
            data1.add(datum);
            System.out.println("\nAt time " + (time + 1));
            System.out.println("Arithmetic mean of " + Arrays.toString(new ArrayList[]{data1}) + " is " + bruteForceMean.arithmeticMean(data1));
            System.out.println("Geometric mean of " + Arrays.toString(new ArrayList[]{data1}) + " is " + bruteForceMean.geometricMean(data1));
            System.out.println("Harmonic mean of " + Arrays.toString(new ArrayList[]{data1}) + " is " + bruteForceMean.harmonicMean(data1));
            System.out.println("Power mean of " + Arrays.toString(new ArrayList[]{data1}) + " is " + bruteForceMean.powerMean(-1.0, data1));
        }

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


