public class LinearEquation {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double yIntercept;
    private double slope;
    private String stringSlope;
    private double distance;
    private int slopeNumerator;
    private int slopeDenominator;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        slope = calculateSlope();
        yIntercept = calculateYIntercept();
        distance =  calculateDistance();

    }
    public double calculateSlope() {
        this.slopeDenominator = Math.abs(x1 - x2);
        this.slopeNumerator = Math.abs(y1 - y2);
        this.stringSlope = slopeNumerator + "/" + slopeDenominator;
        return Math.round(((double)slopeNumerator / slopeDenominator) * 1000.0) / 1000.0;
    }

    public double calculateYIntercept() {
        return Math.round((y1 - (x1 * slope)) * 1000.0) / 1000.0;
    }
    public double calculateDistance() {
        return Math.round((Math.sqrt(Math.pow(((double)x1 - x2), 2) + Math.pow(((double)y1 - y2), 2))) * 1000.0) / 1000.0;
    }
    public String toString() {
        return "First Pair: (" + x1 + "," + y1 + ") \nSecond Pair: (" + x2 + "," + y2 + ") " + "\nSlope of Line: " + slope + "\nY intercept: " + yIntercept + "\nSlope intercept form: " + formattedString() + "\nDistance between the two points: " + distance;

    }
    public String returnCoordinate(double x) {
        return "(" + x + "," + (Math.round(((slope * x) + yIntercept) * 1000.0) / 1000.0) + ")";

    }
    public String formattedString() {
        boolean fractionIsWhole;
        boolean slopeIsOne;
        boolean slopeIsNegative;
        boolean bothValuesAreNegative;
        boolean yInterceptIsZero;
        boolean yInterceptIsNegative;

        fractionIsWhole = slopeNumerator % slopeDenominator == 0;
        slopeIsOne = Math.abs(slope) == 1;
        slopeIsNegative = slope < 0;
        bothValuesAreNegative = slopeNumerator < 0 & slopeDenominator < 0;
        yInterceptIsZero = yIntercept == 0;
        yInterceptIsNegative = yIntercept < 0;

        if (slopeIsNegative) {
            stringSlope = "-" + Math.abs(slopeNumerator) + "/" + Math.abs(slopeDenominator);
        }
        if (bothValuesAreNegative) {
            slopeNumerator = Math.abs(slopeNumerator);
            slopeDenominator = Math.abs(slopeDenominator);
            stringSlope = slopeNumerator + "/" + slopeDenominator;
        }
        if (fractionIsWhole) {
            stringSlope = "" + slopeNumerator/slopeDenominator;
        }
        if (slopeIsOne) {
            if (slopeIsNegative) {
                stringSlope = "-";
            }
            else {
                stringSlope = "";
            }
        }
        if (yInterceptIsZero){
            return "y = " + stringSlope + "x";
        }
        if (yInterceptIsNegative) {
            return "y = " + stringSlope + "x - " + Math.abs(yIntercept);
        }
        else {
            return "y = " + stringSlope + "x + " + yIntercept;
        }
    }
}
