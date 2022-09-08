package DeseneGoreMetotOlusturma;

import java.util.Scanner;
public class Main {

    static void pattern(int sayi, int fixed) {
        if (sayi <= fixed) {
            System.out.print(sayi + " ");
            sayi -=  5;
            if (sayi <= 0) {
                System.out.print(sayi + " ");
                while (sayi < fixed) {
                    sayi += 5;
                    System.out.print(sayi + " ");
                }
                return;
            }
        }
        pattern(sayi, fixed);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int fixed = sayi;
        System.out.print("Çıktısı: ");
        pattern(sayi, fixed);
    }
}