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
        File f = new File ("Guesses.txt");
        Scanner s = new Scanner(f);
        String guessOne = "";
        String guessTwo = "";
        String answer = "";

        while (s.hasNextLine()); {
            for (int i = 0; i <= 1000; i++); {
                answer = s.next();
                guessOne = s.next();
                guessTwo = s.next();
                WordMatch q = new WordMatch(answer);
                totalScore =+ q.scoreGuess(q.findBetterGuess(guessOne, guessTwo));
            }
        }
    return totalScore;
    }
}