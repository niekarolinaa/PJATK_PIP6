import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą n: ");
        int n = scanner.nextInt();
        int[] tab = wygenerujTablice(n);
        wyswietl(tab);
    }
    public static int[] wygenerujTablice(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
        return tab;

    }
    public static void wyswietl(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}