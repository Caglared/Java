package operations_concatenations03;

import java.util.Scanner;

public class C01_operations {
    public static void main(String[] args) {

        //Kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz//+,-,*,/,%

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz" );
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Toplam: " + (num1+num2));
        System.out.println("Fark: "   + (num1-num2));
        System.out.println("Fark: "   + (num2-num1));
        System.out.println("Çarpım: " + (num1*num2));
        System.out.println("Bölme: "  + (num1/num2));
        System.out.println("Bölme: "  + (num2/num1));
        System.out.println("Kalan: "  + (num1%num2));
        System.out.println("Kalan: "  + (num2%num1));



    }
}
