import java.util.Scanner;
public class Tshirt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int cost=22;

        System.out.println("How many tshrits do you want");
        int count = input.nextInt();
        System.out.println("The T-Shirt costs $" + cost*count + ".");
        System.out.println("A personalized T-Shirt costs $" + (cost+1) + ".");
        System.out.println("Without personalization,the T-Shirt costs $" + cost + ".");
        input.close();

    }
}