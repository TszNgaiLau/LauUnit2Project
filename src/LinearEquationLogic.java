import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);

    private LinearEquation coords;
    public LinearEquationLogic() { }
    public void start() {
        String again = "";
        System.out.println("Welcome to the linear equation calculator!");
        while (!again.equals("n")) {
            coords();
            if (coords != null) {
                System.out.println(coords.lineInfo());
                coordsFromX();
            }
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            again = scan.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");

    }
    public void coords() {
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        int idx1x = coord1.indexOf(",");
        int idx2x = coord2.indexOf(",");
        int idx1y = coord1.indexOf(")");
        int idx2y = coord2.indexOf(")");

        int x1 = Integer.parseInt(coord1.substring(1, idx1x));
        int x2 = Integer.parseInt(coord2.substring(1, idx2x));
        int y1 = Integer.parseInt(coord1.substring(idx1x + 2, idx1y));
        int y2 = Integer.parseInt(coord2.substring(idx2x + 2, idx2y));
        if (x1 == x2) {
            System.out.println("\nThese points are on a vertical line: x = " + x1 + "\n");
        } else {
            coords = new LinearEquation(x1, y1, x2, y2);
        }
    }

    public void coordsFromX() {
        System.out.print("\nEnter an value for x: ");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.println("\nThe point on the line is " + coords.coordinateForX(x));
    }




}
