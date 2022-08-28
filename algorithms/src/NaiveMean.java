/*
 * AUTHOR: CALEB PRINCEWILL NWOKOCHA
 * SCHOOL: THE UNIVERSITY OF MANITOBA
 * DEPARTMENT: COMPUTER SCIENCE
 */

public class NaiveMean {
    private final double[] data;

    public NaiveMean (double[] data) { this.data = data; }

    public double arithmeticMean () {
        double sum = 0.0;
        for (double datum : this.data) { sum += datum; }
        return sum / this.data.length;
    }

    public double geometricMean () {
        double product = 1.0;
        for (double datum : this.data) { product *= datum; }
        return Math.pow(product, 1.0 / this.data.length);
    }

    public double harmonicMean () {
        double sum = 0.0;
        for (double datum : this.data) { sum += 1.0 / datum; }
        return this.data.length / sum;
    }

    public double powerMean (double m) {
        double sum = 0.0;
        for (double datum : this.data) { sum += Math.pow(datum, m); }
        return Math.pow(sum / this.data.length, 1.0 / m);
    }
}
