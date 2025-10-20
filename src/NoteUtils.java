public class NoteUtils {

    // 1. Methode: Nicht ausreichende Noten (< 40)
    public int[] getNichtAusreichendeNoten(int[] noten) {
        // numărăm câte note sunt sub 40 pentru a crea un array de dimensiune corectă
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
}
