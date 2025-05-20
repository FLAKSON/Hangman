package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomWordGenerator {
    public String getWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/game/words.txt"));
        ArrayList<String> words = new ArrayList<>();
        Random rand = new Random();
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }
        scanner.close();
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

}
