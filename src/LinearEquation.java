public class LinearEquation {

    int x1;
    int x2;
    int y1;
    int y2;

    public LinearEquation(int num1, int num3, int num2, int num4) {
        x1 = num1;
        x2 = num2;
        y1 = num3;
        y2 = num4;
    }

    public double distance() {
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);
        double total = x + y;
        total = Math.sqrt(total);
        total = roundedToHundredth(total);
        return total;
    }

    public double slope() {
        double slope = (double)(y2-y1)/(x2-x1);
        slope = roundedToHundredth(slope);
        return slope;
    }

    public double yIntercept() {
        double intercept = y1 - (slope() * x1);
        intercept = roundedToHundredth(intercept);
        return intercept;
    }

    public String equation() {
        if (y2 == y1) {
            return "y = " + y1;
        }
        return "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept();
    }

    public String coordinateForX(double x) {
        double product = (x * slope()) + yIntercept();
        return "The point on the line is (" + x + ", " + product + ")";
    }

    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")\nThe equation of the line between these points is " + equation() + "\nThe slope of this line is: " + slope() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + distance();
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.0;
    }
}
