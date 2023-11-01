public class LinearEquation {
    private int coord1y;
    private int coord1x;
    private int coord2y;
    private int coord2x;

    private double roundedToHundredth(double num) {
        return Math.round(num * 100.0) / 100.0;
    }

    public LinearEquation(int coord1x, int coord1y, int coord2x, int coord2y) {
        this.coord1x = coord1x;
        this.coord1y = coord1y;
        this.coord2x = coord2x;
        this.coord2y = coord2y;
    }

    public double distance() {
        double x = Math.pow(((double) coord2x) - ((double) coord1x), 2.0);
        double y = Math.pow(((double) coord2y) - ((double) coord1y), 2.0);
        double last = Math.sqrt(x + y);
        return roundedToHundredth(last);
    }

    public double yIntercept() {
        double mx = slope() * coord1x;
        return roundedToHundredth(coord1y - mx);
    }

    public double slope() {
        double x = ((double) coord2x) - ((double) coord1x);
        double y = ((double) coord2y) - ((double) coord1y);
        return y / x;
    }

    public String equation() {
        int x = (coord2x - coord1x);
        int y = (coord2y - coord1y);
        String slope = y + "/" + x + "x";
        String yIntercept = " + " + yIntercept();
        if (x < 0) {
            slope = (y * -1) + "/" + (x * -1) + "x";
        }
        if (y % x == 0) {
            slope = (y / x) + "x";
        }
        if (y / x == 1) {
            slope = "x";
        }
        if (y / x == -1) {
            slope = "-x";
        }
        if (y / x == 0) {
            slope = "";
        }
        if (yIntercept() == 0) {
           yIntercept = "";
        }
        if (yIntercept() < 0) {
            yIntercept = " - " + (-1 * yIntercept());
        }
        if (coord1y == coord2y) {
            return "y = " + coord1y;
        }
        return "y = " + slope + yIntercept;
    }
    String coordinateForX(double x) {
        double y = slope() * x + yIntercept();
        roundedToHundredth(y);
        return "(" + x + ", " + y + ")";
    }
    String lineInfo() {
        String info = "";
        String coords = "The two points are: (" + coord1x + ", " + coord1y + ") and (" + coord2x + ", " + coord2y + ")";
        String equation = "The equation of the line between these points is: " + equation();
        String slope = "The slope of this line is: " + slope();
        String yIntercept = "The y-intercept of this line is: " + yIntercept();
        String distance = "The distance between these points is " + distance();
        info = "\n" + coords + "\n" + equation + "\n" + slope + "\n" + yIntercept + "\n" + distance;
        return info;
    }



}
