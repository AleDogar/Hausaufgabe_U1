public class NoteUtils {

    // 1. Methode: Nicht ausreichende Noten (< 40)
    public int[] getNichtAusreichendeNoten(int[] noten) {
        int count = 0;
        for (int note : noten) {
            if (note < 40) {
                count++;
            }
        }

        int[] ergebnis = new int[count];
        int index = 0;

        for (int note : noten) {
            if (note < 40) {
                ergebnis[index] = note;
                index++;
            }
        }

        return ergebnis;
    }

    // 2. Methode: Durchschnitt der Noten
    public double getDurchschnitt(int[] noten) {
        if (noten == null || noten.length == 0) {
            return 0.0;
        }

        int summe = 0;
        for (int note : noten) {
            summe += note;
        }

        double durchschnitt = (double) summe / noten.length;

        // auf 2 Dezimalstellen runden
        return Math.round(durchschnitt * 100.0) / 100.0;
    }
}
