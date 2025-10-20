import java.util.Arrays;

public class Main {

    public void run() {
        int[] noten = {29, 37, 38, 41, 84, 67};

        NoteUtils noteUtils = new NoteUtils();

        // 1. Nicht ausreichende Noten
        int[] nichtAusreichend = noteUtils.getNichtAusreichendeNoten(noten);
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(nichtAusreichend));

        // 2. Durchschnittswert
        double durchschnitt = noteUtils.getDurchschnitt(noten);
        System.out.println("Durchschnittswert: " + durchschnitt);

        // 3. Abgerundete Noten nach Regeln
        int[] abgerundet = noteUtils.getAbgerundeteNoten(noten);
        System.out.println("Abgerundete Noten: " + Arrays.toString(abgerundet));

        // 4. Maximale abgerundete Note
        int maxAbgerundet = noteUtils.getMaxAbgerundeteNote(noten);
        System.out.println("Maximale abgerundete Note: " + maxAbgerundet);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
