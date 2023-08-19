package operations_concatenations03;

import java.util.Scanner;

public class C02_operations {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayi isteyiniz ve bunlara assignment operation islemlerini yapiniz
        /*
         =: Değer atama
        +=: Toplama ve atama
        -=: Çıkarma ve atama
        *=: Çarpma ve atama
        /=: Bölme ve atama
        %=: kalan ve atama
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfem iki sayı giriniz");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println(num1);
        System.out.println(num2);

        num1 += num2; //num3 = num1 + num2
        System.out.println("Topalma: " + num1);

        num1 -= num2;  //num1 = num3 - num2
        System.out.println("Çıkarma: " + num1);

        num1 *= num2;
        System.out.println("Çarpma: " + num1);

        num1 /= num2;
        System.out.println("Bölme: " + num1);

        num1 %= num2;
        System.out.println("Kalan: " + num1);

    }
}
