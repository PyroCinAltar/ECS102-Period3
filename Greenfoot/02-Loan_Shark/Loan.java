public class Loan {
    double principal;
    double rate;
    double years;
    int number;

    public Loan(double p, double r, double y, int n) {
        this.principal = p;
        this.rate = r;
        this.years = y;
        this.number = n;
    }

    double calculateSimpleInterest() {
        return principal+(principal*(rate/100)*years);
    }

    double calculateTotalRepayment() {
        return principal* Math.pow((1+(rate/100)/number), number*years);
    }
}
