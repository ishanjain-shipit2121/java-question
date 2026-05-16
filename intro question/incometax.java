import java.util.Scanner;
public class incometax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter income: ");
    if (!sc.hasNextInt()) {
      System.out.println("Invalid input");
      sc.close();
      return;
    }
    int income = sc.nextInt();

    double tax = calculateTax(income);
    System.out.println("Your tax is: " + tax);
    sc.close();
  }

  private static double calculateTax(int income) {
    if (income <= 250000) return 0;
    else if (income <= 500000) return (income - 250000) * 0.05;
    else if (income <= 1000000) return (income - 500000) * 0.2 + 250000 * 0.05;
    else return (income - 1000000) * 0.3 + 500000 * 0.2 + 250000 * 0.05;
  }
}
