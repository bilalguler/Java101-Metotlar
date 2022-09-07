package AsalSayiBulanProgram;

import java.util.Scanner;
public class Main {
    static void prime(int sayi, int i) {
        if (sayi == i) {
            System.out.println(sayi + " sayısı ASALDIR!!");
            return;
        } else if (sayi % i == 0){
            System.out.println(sayi + " sayısı ASAL değildir!!");
            return;
        }
        prime(sayi, i + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 2;
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();

        prime(sayi, i);
    }
}

