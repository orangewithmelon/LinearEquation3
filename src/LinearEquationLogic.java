import java.util.Scanner;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);

    LinearEquationLogic() { }

    public String coords(String coord1, String coord2) {
        return "The two points are: " + coord1 + " and " + coord2;
    }

    public String start() {
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter your first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter your second coordinate: ");
        String coord2 = scan.nextLine();
        System.out.println(coords(coord1, coord2));
        String x1 = coord1.substring(1,coord1.indexOf(","));
        String y1 = coord1.substring(coord1.indexOf(",") + 2,coord1.length()-1);
        String x2 = coord2.substring(1,coord2.indexOf(","));
        String y2 = coord2.substring(coord2.indexOf(",") + 2,coord2.length()-1);
        int realx1 = Integer.parseInt(x1);
        int realx2 = Integer.parseInt(x2);
        int realy1 = Integer.parseInt(y1);
        int realy2 = Integer.parseInt(y2);
        LinearEquation coord = new LinearEquation(realx1, realx2, realy1, realy2);
    }
}