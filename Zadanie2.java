import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą n: ");
        int n = scanner.nextInt();
        int[] tab = wygenerujTablice(n);
        wyswietl(tab);
        int[] sortedTab = sortuj(tab);
        wyswietl(sortedTab);
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

    public static int[] sortuj(int[] tab) {
        int[] sortedTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            sortedTab[i] = tab[i];
        }
        for (int i = 0; i < sortedTab.length; i++) {
            for (int j = 0; j < sortedTab.length - 1; j++) {
                if (sortedTab[j] > sortedTab[j + 1]) {
                    int temp = sortedTab[j];
                    sortedTab[j] = sortedTab[j + 1];
                    sortedTab[j + 1] = temp;
                }
            }
        }
        return sortedTab;
    }
}