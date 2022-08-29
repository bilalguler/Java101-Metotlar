package PalidromSayilar;
import java.util.Scanner;
public class Main {

    static boolean isPalidrom( int number) {
        int temp = number, reverseNumber = 0, lastNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a integer: ");
        int number = scan.nextInt();

        if (isPalidrom(number)) {
            System.out.println("Your number is Palidrom Number.");
        } else {
            System.out.println("Your number is not Palidrom Number.");
        }
    }
}
