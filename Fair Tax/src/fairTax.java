import java.util.Scanner;

public class fairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fairTAX;
        int housing;
        int transportation;
        int education;
        int heathCare;
        int Vacation;
        int food;
        int clothing;
        double total;

        System.out.print("Enter the expense for housing: ");
        housing = input.nextInt();

        System.out.print("Enter the expense for transportation: ");
        transportation = input.nextInt();

        System.out.print("Enter the expense for education: ");
        education = input.nextInt();

        System.out.print("Enter the expense for healthcare: ");
        int healthCare = input.nextInt();

        System.out.print("Enter the expense for Vacation: ");
        Vacation = input.nextInt();

        System.out.print("Enter the expenses for food: ");
        food = input.nextInt();

        System.out.print("Enter the expenses for clothing: ");
        clothing = input.nextInt();

        total = housing + transportation + education + healthCare + Vacation + food + clothing;
        fairTAX = 0.3 * total;

        System.out.printf("The total expenses is %f\n", total);
        System.out.printf("Your FairTax is %f\n", fairTAX);
    }
}





