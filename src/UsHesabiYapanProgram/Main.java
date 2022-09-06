package UsHesabiYapanProgram;

import java.util.Scanner;
public class Main
{
    static int power(int taban, int us) {
        if (taban == 1 || us == 0) {
            return 1;
        }
        return power(taban,us - 1) * taban;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int taban = scan.nextInt();
        System.out.print("Üssü giriniz: ");
        int us = scan.nextInt();
        System.out.println(power(taban,us));
    }
}

