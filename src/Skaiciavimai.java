import java.util.Scanner;

public class Skaiciavimai {



    public static void minuciuKonverteris(int sveikasSkaicius){

        int diena = 1440;
        int valanda = 60;
        int minute = 1;

        int kiekDienu = sveikasSkaicius / diena;
        int kiekValandu = (sveikasSkaicius - (kiekDienu * diena)) / valanda;
        int kiekMinuciu = (sveikasSkaicius - (kiekDienu * diena)) - (kiekValandu * valanda) / valanda;

        System.out.println("Sveikas skaicius - " + sveikasSkaicius +   " turi " + kiekDienu + " dienas " + kiekValandu + " valanda " + kiekMinuciu + " minuciu ");
    }
}
