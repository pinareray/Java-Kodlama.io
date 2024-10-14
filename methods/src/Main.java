//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca(); //methodu çağırıyoruz.

    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 7;
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi==aranacak){
                varMi = true;
                break;
            }
        }

        String mesaj= "";
        if (varMi){
            mesaj = "Sayi mevcuttur:" +aranacak;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayi mevcut değildir:" +aranacak);
        }
    }

    public static void mesajVer(String mesaj){ //parametreli method
        System.out.println(mesaj);
    }
}