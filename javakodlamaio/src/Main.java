//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Java");

        //variables-değişkenler
         int ogrenciSayisi = 12;
        System.out.println("Öğrenci sayısı:" + ogrenciSayisi);
        String mesaj = "Öğrenci sayısı:";
        System.out.println(mesaj + ogrenciSayisi);

        //datatypes- veri türleri
        double sayi11 = 12.5;
        int sayii = 21;
        sayi11 = 14;
        char karakter = 'A'; //ascii
        boolean dogruMu = false;

        //conditional sentences- şart cümleleri
        int sayi = 10;
        if (sayi < 20) {
            System.out.println("Sayi 20 den küçüktür.");
        }else {
            System.out.println("Sayi 20 den büyüktür.");
        }

        //Ör: 3 sayıdan en büyük sayıyı bulalım
        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enbuyuk = sayi1;
        if (enbuyuk <sayi2) {
            enbuyuk = sayi2;
        } else if (enbuyuk <sayi3) {
            enbuyuk = sayi3;
        }
        System.out.println("En büyük =" +enbuyuk);

        //switch-case
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Maalesef: Kaldınız");
                break;
                default:
                    System.out.println("Geçersiz not girdiniz");

        }
        //loops-döngüler
        //for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //while
        int i = 2;
        while (i<10){ //i 10 dan küçük olduğu sürece devam eder i 1 olduğu için sonsuz döngüye girer
            System.out.println(i);
            i++; //böyle bir şey yapsak sonsuz döngüye girmezdi
        }
        System.out.println("While döngüsü bitti");

        //do while
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-while döngüsü bitti.");
    }
    }
