package game;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
    Graphics graphics = new Graphics();
    ArrayList<String> secreteWord = new ArrayList<>(Arrays.asList(randomWordGenerator.getWords().split("")));
    ArrayList<String> buffer = new ArrayList<>(secreteWord.toArray().length);{
        for(int i = 0; i < secreteWord.size(); i++){
            buffer.add("_");
        }
    }
    Scanner scanner = new Scanner(System.in);
    String answer;
    int hp = 6;
    int count = 0;

    public void game() {
        for(int i = 0; i < secreteWord.size(); i++){
            System.out.print(secreteWord.get(i));
        }
        System.out.println();
        while(hp > 0){
            graphics.drawHangman(hp);
            count = 0;
            for(int i = 0; i < buffer.size(); i++){
                System.out.print(buffer.get(i) + " ");
            }
            System.out.println();
            System.out.print("Your hp: " + hp);
            System.out.println();
            System.out.print("You need enter just one letter: ");
            answer = scanner.nextLine();
            for(int i = 0; i < buffer.size(); i++){
                if(answer.equals(secreteWord.get(i))) {
                    count++;
                    buffer.set(i, answer);
                }
            }
            if(count == 0){
                hp--;
            }

            for(int i = 0; i < secreteWord.size(); i++){
                if(hp > 0 && buffer.equals(secreteWord)) {
                    System.out.println();
                    System.out.println("You have won the game!");
                    System.out.print("The word was: ");
                    for(int j = 0; j < secreteWord.size(); j++){
                        System.out.print(secreteWord.get(j));
                    }
                    System.out.println();
                    return;
                }
            }
            if(hp == 0){
                System.out.println();
                System.out.println("You have lose the game!");
                System.out.print("The word was: ");
                for(int j = 0; j < secreteWord.size(); j++){
                    System.out.print(secreteWord.get(j));
                }
                System.out.println();
                return;
            }
        }
    }


    public Game() throws FileNotFoundException {
    }

}
