import java.util.Scanner;

public class Skaiciavimai1 {

    public static void minuciuKiekis(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite dienas");
        int dienos = sc.nextInt();
        System.out.println("iveksite valandas");
        int valandos = sc.nextInt();
        System.out.println("Iveskite minutes");
        int minutes = sc.nextInt();

        int totalMin = minutes + (valandos*60) + (dienos*1440);
        System.out.println(totalMin);
    }
}
