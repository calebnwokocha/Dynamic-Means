/*
 * AUTHOR: CALEB PRINCEWILL NWOKOCHA
 * SCHOOL: THE UNIVERSITY OF MANITOBA
 * DEPARTMENT: COMPUTER SCIENCE
 */

import java.util.ArrayList;

public class BruteForceMean {
    public BruteForceMean() {}

    public double arithmeticMean (ArrayList<Double> data) {
        double sum = 0.0;
        for (double datum : data) { sum += datum; }
        return sum / data.size();
    }

    public double geometricMean (ArrayList<Double> data) {
        double product = 1.0;
        for (double datum : data) { product *= datum; }
        return Math.pow(product, 1.0 / data.size());
    }

    public double harmonicMean (ArrayList<Double> data) {
        double sum = 0.0;
        for (double datum : data) { sum += 1.0 / datum; }
        return data.size() / sum;
    }

    public double powerMean (double m, ArrayList<Double> data) {
        double sum = 0.0;
        for (double datum : data) { sum += Math.pow(datum, m); }
        return Math.pow(sum / data.size(), 1.0 / m);
    }
}
