import java.math.BigDecimal;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  // constructor
  public LoanCalculator(double principle, double annualInterestRate,
      int numOfYears) {
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }

  // totalInterestAfterYears()
  // principle * (1 + annualInterestRate/100^numOfYears) - principle
  public double totalInterestAfterYears() {
    return BigDecimal.valueOf(this.principle)
        .multiply(BigDecimal.valueOf(
            Math.pow(1 + this.annualInterestRate / 100, this.numOfYears)))
        .subtract(BigDecimal.valueOf(this.principle)).doubleValue();
  }

  public static double totalInterestAfterYears2(double principle,
      double annualInterestRate, int numOfYears) {
    return BigDecimal.valueOf(principle)
        .multiply(BigDecimal
            .valueOf(Math.pow(1 + annualInterestRate / 100, numOfYears)))
        .subtract(BigDecimal.valueOf(principle)).doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(totalInterestAfterYears2(10000, 3, 5));

  }
}
