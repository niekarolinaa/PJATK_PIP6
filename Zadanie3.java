
public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int[] odwroconaTablica = odwrocTablice(tab);
        wyswietl(odwroconaTablica);
    }

    public static void wyswietl(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] odwrocTablice(int[] tab) {
        int[] reversedTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            reversedTab[i] = tab[tab.length - 1 - i];
        }
        return reversedTab;
    }
}