public class NoteUtils {

    // 1. Nicht ausreichende Noten (< 40)
    public int[] getNichtAusreichendeNoten(int[] noten) {
        int count = 0;
        for (int note : noten) {
            if (note < 40) count++;
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

    // 2. Durchschnitt der Noten
    public double getDurchschnitt(int[] noten) {
        if (noten == null || noten.length == 0) return 0.0;

        int summe = 0;
        for (int note : noten) summe += note;

        double durchschnitt = (double) summe / noten.length;
        return Math.round(durchschnitt * 100.0) / 100.0;
    }

    // 3. Abgerundete Noten nach den Regeln
    public int[] getAbgerundeteNoten(int[] noten) {
        int[] abgerundet = new int[noten.length];

        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];

            if (note < 38) {
                abgerundet[i] = note;
            } else {
                int naechstesVielfaches = ((note / 5) + 1) * 5;
                if (naechstesVielfaches - note < 3) {
                    abgerundet[i] = naechstesVielfaches;
                } else {
                    abgerundet[i] = note;
                }
            }
        }

        return abgerundet;
    }

    // 4. Maximale abgerundete Note
    public int getMaxAbgerundeteNote(int[] noten) {
        int[] abgerundet = getAbgerundeteNoten(noten);
        int max = abgerundet[0];

        for (int i = 1; i < abgerundet.length; i++) {
            if (abgerundet[i] > max) {
                max = abgerundet[i];
            }
        }

        return max;
    }
}