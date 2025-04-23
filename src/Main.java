import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Double principle;
        Double rate;
        Integer timesComp;
        Integer years;
        Double amount;

        Scanner scanner = new Scanner(System.in);

      System.out.println("Enter principle amount :");
      principle = scanner.nextDouble();

        System.out.println("Enter interest rate");
        rate = scanner.nextDouble() / 100 ;

        System.out.println("Enter Number of times compounded per year");
        timesComp = scanner.nextInt();

        System.out.println("Enter number of years");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate/timesComp, years);

        System.out.println("Your amount is " + amount + "$");

        scanner.close();
    }
}