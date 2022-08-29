/*
 * AUTHOR: CALEB PRINCEWILL NWOKOCHA
 * SCHOOL: THE UNIVERSITY OF MANITOBA
 * DEPARTMENT: COMPUTER SCIENCE
 */

public class DynamicMean {
    private double arithmeticMean;
    private double geometricMean;
    private double harmonicMean;
    private double powerMean;

    public DynamicMean (double datum1) {
        this.arithmeticMean = datum1;
        this.geometricMean = datum1;
        this.harmonicMean = datum1;
        this.powerMean = datum1;
    }

    public double arithmeticMean (double time, double datum) {
        this.arithmeticMean = (1.0 / (time + 1.0)) * (datum + (time * this.arithmeticMean));
        return this.arithmeticMean;
    }

    public double geometricMean (double time, double datum) {
        this.geometricMean = Math.pow(Math.pow(this.geometricMean, time) * datum, 1.0 / (time + 1.0));
        return this.geometricMean;
    }

    public double harmonicMean (double time, double datum) {
        this.harmonicMean = (time + 1.0) * Math.pow((time / this.harmonicMean) + (1 / datum), -1);
        return this.harmonicMean;
    }

    public double powerMean (double m, double time, double datum) {
        this.powerMean = Math.pow((1.0 / (time + 1.0)) * (Math.pow(datum, m) + (Math.pow(this.powerMean, m) * time)), 1.0 / m);
        return this.powerMean;
    }
}
