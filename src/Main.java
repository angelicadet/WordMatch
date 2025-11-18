import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(total());
//        WordMatch w = new WordMatch("mississippi");
//        System.out.println(w.scoreGuess("i"));
//        System.out.println(w.scoreGuess("iss"));
//        System.out.println(w.scoreGuess("issipp"));
//        System.out.println(w.scoreGuess("mississippi"));
//
//        System.out.println();
//
//        WordMatch t = new WordMatch("concatenation");
//        System.out.println(t.scoreGuess("ten"));
//        System.out.println(t.scoreGuess("nation"));
//        System.out.println(t.findBetterGuess("ten", "nation"));
//        System.out.println(t.scoreGuess("con"));
//        System.out.println(t.scoreGuess("cat"));
//        System.out.println(t.findBetterGuess("con", "cat"));
    }

    public static int total() throws FileNotFoundException {
        int totalScore = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);

        while (s.hasNext()) {
            WordMatch q = new WordMatch(s.next());
            totalScore += q.scoreGuess(q.findBetterGuess(s.next(), s.next()));

        }
        return totalScore;
    }
}