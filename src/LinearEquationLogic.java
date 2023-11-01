import java.util.Scanner;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);

    LinearEquationLogic() { }

    public String coords(String coord1, String coord2) {
        return "The two points are: " + coord1 + " and " + coord2;
    }

    public boolean userinput() {
        boolean again = true;
        System.out.println();
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        String input = scan.nextLine();
        if (input.equals("n")) {
            again = false;
        }
        return again;
    }

    public int parse(String num) {
        return Integer.parseInt(num);
    }

    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        boolean again = true;
        while (again) {
            System.out.println();
            System.out.print("Enter your first coordinate: ");
            String coord1 = scan.nextLine();
            System.out.print("Enter your second coordinate: ");
            String coord2 = scan.nextLine();
            System.out.println();
            String x1 = coord1.substring(1, coord1.indexOf(","));
            String y1 = coord1.substring(coord1.indexOf(",") + 2, coord1.length() - 1);
            String x2 = coord2.substring(1, coord2.indexOf(","));
            String y2 = coord2.substring(coord2.indexOf(",") + 2, coord2.length() - 1);
            int realx1 = parse(x1);
            int realx2 = parse(x2);
            int realy1 = parse(y1);
            int realy2 = parse(y2);
            if (realx1 != realx2) {
                LinearEquation coord = new LinearEquation(realx1, realx2, realy1, realy2);
                System.out.println(coord.lineInfo());
                System.out.println();
                System.out.print("Enter a value for x: ");
                double x = scan.nextDouble();
                System.out.println();
                scan.nextLine();
                System.out.print(coord.coordinateForX(x));
                if(!userinput()) {
                    again = false;
                }
            } else {
                System.out.print("These points are on a vertical line: x = " + realx1);
                if(!userinput()) {
                    again = false;
                }
            }
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }
}