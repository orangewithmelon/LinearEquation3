public class LinearEquation {

    int x1;
    int x2;
    int y1;
    int y2;

    public LinearEquation(int num1, int num2, int num3, int num4) {
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
        return total;
    }
}
