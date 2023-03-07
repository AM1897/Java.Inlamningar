import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private WordList wordList;
    private Word word;
    private Player player;
    private Scanner input;
    private ArrayList<Character> guessedLetters;

    public Game(WordList wordList) {
        this.wordList = wordList;
        input = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the hang man game!");

        System.out.println("What's your name?");
        String name = input.nextLine();
        player = new Player(name);

        boolean keepPlaying = true;

        while (keepPlaying) {
            guessedLetters = new ArrayList<Character>();
            System.out.println();
            System.out.println("OK " + player.getName() + "");
            this.word = new Word(wordList.randomWord());
            System.out.println("You have to guess a word that consists of " + word.getWord().length() + " letters.");
            System.out.println("Good luck");
            boolean winner = false;
            while (!winner) {
                guess();
                word.displayLetter(guessedLetters);
                System.out.println(word.getGuess());

                winner = winnerCheck();
                if (winner) {
                    System.out.println("Congratulations! You guessed the word correctly.");
                    System.out.println("The word was " + word.getWord());
                }
            }
            System.out.println("Do you want to play again? (Yes/No)");
            String answer = input.next();

            if (answer.equalsIgnoreCase("Yes")) {
                winner = false;
            } else {
                keepPlaying = false;
                finishGame();
            }
        }
    }

    private void guess() {
        System.out.println();
        System.out.println(player);
        System.out.println(word.getGuess());
        System.out.println("Guess a letter:");

        String guess = input.next();
        char letter = guess.charAt(0);
        player.increaseGuesses();

        if (guessedLetters.contains(letter)) {
            System.out.println("You have already guessed the letter " + letter + "! Try to be a little more creative.");
        } else {
            guessedLetters.add(letter);
            if (!word.matchGuess(letter)) {
                System.out.println("Sorry, the letter " + letter + " is not in the word.");
            } else {
                System.out.println("Good guess! The letter " + letter + " is in the word.");
            }
        }
    }

    private boolean winnerCheck() {
        return word.getWord().equals(word.getGuess());
    }

    private void finishGame() {
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}
