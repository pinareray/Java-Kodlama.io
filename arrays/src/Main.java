//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //arrays-diziler
        String ogrenci1 = "Alp";
        String ogrenci2 = "Pınar";
        String ogrenci3 = "Mustafa";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-----------------------------");

        //yukarıdaki gibi yapmak yerine aşağıdaki gibi dizileri kullanabiliriz.

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Alp";
        ogrenciler[1] = "Mustafa";
        ogrenciler[2] = "Pınar";

        for (int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------------");
        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }


    }
}