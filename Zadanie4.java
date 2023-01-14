
public class Zadanie4 {
    public static void main(String[] args) {
        int[] tablica1 = {1, 2, 3, 4, 5};
        int[] tablica2 = {5, 4, 3, 2, 1};
        System.out.println(jestOdwrotnoscia(tablica1, tablica2));
    }

    public static boolean jestOdwrotnoscia(int[] tab1, int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[tab2.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}