//Peter Sergay
//9/23/2018
//CS201

public class FindPrincipal {

    public static double find(double mortgage, double interest,
			      double years) {

	return findBetween(mortgage, interest, years,
			   0, upperBound(mortgage, interest, years));
    }

    public static double findBetween(double mortgage, double interest,
				     double years, double lo, double hi) {
	// FILL IN
    }

    public static double upperBound(double mortgage, double interest,
				    double years) {
	// FILL IN
    }

    public static void testFind(double m, double i, double y) {
	System.out.println("find(" + m + ", " + i + ", " + y + ") = "
			   + find(m, i, y));
    }

    public static void main(String [] args) {
	testFind(1200.00, 7.00, 30.0);
    }

}
