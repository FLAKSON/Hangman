import game.Game;
import game.RandomWordGenerator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println();
        System.out.println("Welcome to the Hangman game!");
        System.out.println("Do you want to play?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        while (true) {
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    Game gameLoop = new Game();
                    gameLoop.game();
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    return;
            }
            System.out.println();
            System.out.println("Do you want play one more time?");
            System.out.println("1. Yes");
            System.out.println("2. No");
        }
    }
}
