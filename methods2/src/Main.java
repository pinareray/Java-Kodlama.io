//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,4);
        System.out.println(sayi);
        int toplam = topla2(2,5,6,5,3);//istediğimiz kadar gönderebiliriz
        System.out.println(toplam);
    }

    public static void ekle(){ //Bunlar void operasyon olarak adlandırılır. Yani bir şeyi yapmasını isteriz ve bunu veri tabanına ekler siler veya günceller.
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){//variable arguments
        int toplam = 0;
        for(int sayi : sayilar){//Sayilardaki her bir sayı için demek
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}