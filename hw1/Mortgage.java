// Mortgage.java
// CS 201 HW 1 problem 1
//Peter Sergay
//9/23/2018

public class Mortgage {

    // Below is a sample comment for the 'mortgage' method.
    // ALL your methods always need comments!
    // And don't forget to put a comment at the top of your file as well.

    // Calculates monthly mortgage from parameters:
    //   principal - the principal in dollars
    //   interest  - the interest in percent
    //   years     - the duration of the mortgage in years
    // Returns the monthly mortagage payment.
    public static double mortgage(double principal, double interest,
                                  double years) {
          //uses numerator and denominator variables to simplify code
        double numerator = principal*(interest/1200);
        double denominator = 1-Math.pow((1/(1+(interest/1200))),12*years);
        double monthly_mortgage = numerator/denominator;

        return monthly_mortgage;  // returns monthly mortgage
    }

    public static void print(double principal, double interest, double years) {
      /*
      calls mortgage function to find monthly payments, then multiplies monthly costs
      by years*12 to find total cost
      */
        double monthly_mortgage = mortgage(principal, interest, years);
        double total_mortgage = monthly_mortgage*12*years;
        System.out.printf("principal=%.2f; interest=%.2f; years=%.2f;" +
        " mortgage=%.2f; total=%.2f", principal, interest, years, monthly_mortgage, total_mortgage);
    }

    public static void main (String[] args) {

        print(250000, 7.25, 30); //calls print function

    }
}
