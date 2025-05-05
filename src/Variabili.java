import java.util.Scanner;

public class Variabili {

    public static void main(String[] args) {
        int risultato1 = moltiplica(4, 5);
        System.out.println("4 x 5 = " + risultato1);

        String c = "ciaone";
        int d = 2000;

        String risultato2 = concact("ciaone ", 2000);
        System.out.println(risultato2);

        String[] originali = {"uno", "due", "tre", "quattro", "cinque"};
        String nuova = "inserita";

        String[] risultatoArray = inserisciInArray(originali, nuova);

        System.out.println(risultatoArray[0]);
        System.out.println(risultatoArray[1]);
        System.out.println(risultatoArray[2]);
        System.out.println(risultatoArray[3]);
        System.out.println(risultatoArray[4]);
        System.out.println(risultatoArray[5]);

        // Esegui il secondo esercizio
        exe2();

        // Esegui l'esercizio 3
        double perimetroRettangolo = perimetroRettangolo(5.0, 3.0);
        System.out.println("Perimetro rettangolo: " + perimetroRettangolo);

        int risultatoPariDispari = pariDispari(7);
        System.out.println("Pari o dispari: " + risultatoPariDispari);

        double areaTriangolo = perimetroTriangolo(3.0, 4.0, 5.0);
        System.out.println("Area triangolo: " + areaTriangolo);
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concact(String c, int d) {
        return c + d;
    }

    public static String[] inserisciInArray(String[] array, String daInserire) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve avere esattamente 5 elementi.");
        }

        String[] nuovoArray = new String[6];

        // Inserimento manuale degli elementi
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = daInserire;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

    public static void exe2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String str1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String str2 = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String str3 = scanner.nextLine();

        String concatenato1 = str1 + str2 + str3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenato1);

        String concatenato2 = str3 + str2 + str1;
        System.out.println("Concatenazione in ordine inverso: " + concatenato2);

        scanner.close();
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
    }
}
