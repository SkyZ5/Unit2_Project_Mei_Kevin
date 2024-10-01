public class LinearEquation {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double yIntercept;
    private double slope;
    private String stringSlope;
    private double distance;

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
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        this.stringSlope = x + "/" + y;
        return (double)x / y;
    }

    public double calculateYIntercept() {
        return y1 - (x1 * slope);
    }
    public double calculateDistance() {
        return Math.sqrt(Math.pow(((double)x1 - x2), 2) + Math.pow(((double)y1 - y2), 2));
    }
    public String toString() {
        return "First Pair: (" + x1 + "," + y1 + ") \nSecond Pair: (" + x2 + "," + y2 + ") " + "\nSlope of Line: " + stringSlope + "\nY intercept: " + yIntercept + "\nSlope intercept form: y = " + stringSlope + "x + " + yIntercept;

    }
    public String returnCoordinate(int x) {
        return "(" + x + "," + (slope * x) + yIntercept + ")";
    }
}
