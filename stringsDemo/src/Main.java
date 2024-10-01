//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı: " +mesaj.length());
        System.out.println("5. eleman :" +mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));//false
        System.out.println(mesaj.endsWith("."));//true
        System.out.println("-----------------");
        char[] karakterler = new char[5];
        mesaj.getChars(0,4, karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("a"));

        System.out.println("----------------");

        String yeniMesaj = (mesaj.replace(' ', '-'));//Neyi neyle değiştireceksin, boşluğu - ile değiştirdik.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());//bunları en çok veri tabanına arama gönderince kullanırız.


        }
    }
