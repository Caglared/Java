package ifStatements01;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
        karsilastirma operatorleri ==,>,<,<=,>=,!=;
         */
        int sayi1=5;
        int sayi2=8;



        if (sayi1>sayi2){
            System.out.println("buyuk olan sayi : "+sayi1);
            System.out.println("kucuk olan sayi : "+sayi2);
        }

        if (sayi2>sayi1){
            System.out.println("buyuk olan sayi : "+sayi2);
            System.out.println("kucuk olan sayi : "+sayi1);
        }
    }
}
