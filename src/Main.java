import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------- ESERCIZIO 1 -------------------");
        System.out.println("--------------------- MOLTIPLICAZIONE -------------------");
        int res = multiple(5, 3);
        System.out.println("Il risultato è: " + res);


        System.out.println("--------------------- CONCATENARE -------------------");
        String frase = concat("Ciao ", 8);
        System.out.println(frase);


        System.out.println("--------------------- ARRAY -------------------");
        String[] arr = new String[6];
        String[] elenco = inserisciInArray(arr, "ciao");
        System.out.println(Arrays.toString(elenco));


        System.out.println("--------------------- ESERCIZIO 2 -------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prima stringa: ");
        String parola1 = scanner.nextLine();
        System.out.println("Seconda stringa: ");
        String parola2 = scanner.nextLine();
        System.out.println("Terza stringa: ");
        String parola3 = scanner.nextLine();

        String ris = parola1 + " " + parola2 + " " + parola3;
        System.out.println(ris);

        String ris2 = parola3 + " " + parola2 + " " + parola1;
        System.out.println(ris2);

        System.out.println("--------------------- ESERCIZIO 3 -------------------");
        System.out.println("--------------------- PERIMETRO RETTANGOLO -------------------");
        double perimeter = perimetroRettangolo(3.5, 4.2);
        System.out.println("Il perimetro del rettangolo è: " + perimeter);


        System.out.println("--------------------- PARI O DISPARI -------------------");
        int risultato = pariDispari(5);
        System.out.println(risultato);

        System.out.println("--------------------- AREA TRIANGOLO -------------------");
        double result = perimetroTriangolo(5, 4, 6.5);
        System.out.println(result);
    }

    public static int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public static String concat(String str, int x) {
        return str + x;
    }

    public static String[] inserisciInArray(String[] arr, String parola) {
        arr[0] = "ffff";
        arr[1] = "cccc";
        arr[2] = "dddd";
        arr[3] = parola;
        arr[4] = "gggg";
        arr[5] = "hhhh";
        return arr;
    }

    public static double perimetroRettangolo(double b, double h) {
        return 2 * (b + h);
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double l1, double l2, double b) {

        double s = (l1 + l2 + b) / 2;

        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - b));

        return area;
    }
}