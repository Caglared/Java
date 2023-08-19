package operations_concatenations03;

import java.util.Scanner;

public class C05_concatenations {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyiniz ve cumlenin
        //bas harfini buyultun eger//odev noktalama isareti yoksa noktalama isareti ekleyin//endsWith();

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle girin:");//Hava cok sicak
        String cumle = scan.nextLine();

        // ilk harfi büyük yap

        String output = cumle.toUpperCase().charAt(0) + cumle.toLowerCase().substring(1);
        //String output = cumle.substring(0, 1).toUpperCase() + cumle.toLowerCase().substring(1);

        // noktalama işareti ekle
        if (!output.endsWith(".") && !output.endsWith("!") && !output.endsWith("?")) {
            output = output + ".";
        }
        // çıktıyı yazdır
        System.out.println(output); // Hava çok sıcak.

    }
}
