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
        double x = ((double) coord2x) - ((double) coord1x);
        double y = ((double) coord2y) - ((double) coord1y);
        String equation = null;
        if (slope() == 0) {
            equation = "y = " + yIntercept();
        } else if (y % x == 0) {
            equation = "y = " + ((int) y / x) + "x + " + yIntercept();
        } else if (slope() == 1 || slope() == -1) {
            if (slope() == 1) {
                equation = "y = x + " + yIntercept();
            } else {
                equation = "y = -x + " + yIntercept();
            }
        } else if (x < 0) {
            equation
        }
    }



}
