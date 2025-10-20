import java.util.Arrays;

public class Main {

    public void run() {
        int[] noten = {29, 37, 38, 41, 84, 67};

        NoteUtils noteUtils = new NoteUtils();
        int[] nichtAusreichend = noteUtils.getNichtAusreichendeNoten(noten);

        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(nichtAusreichend));
    }

    // punct de intrare obligatoriu în Java
    public static void main(String[] args) {
        new Main().run();
    }
}
