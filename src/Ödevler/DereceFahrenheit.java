package Ödevler;
import java.util.Scanner;
// konsoldan girilen sıcaklık degerini dereceden Fahrenheit'a ceviren bir metot yazınız.

public class DereceFahrenheit {
    public static void main(String[] args) {
        Scanner tarayici =new Scanner(System.in);

        System.out.println("sıcaklık degerini giriniz: ");
        double sicaklik = tarayici.nextDouble();

        //metodu baska yanSinif sınıfından  alacagım.

        yanSinif derece = new yanSinif();
        derece.sicaklikDonustur(sicaklik);

    }
}
