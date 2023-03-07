import java.util.ArrayList;

class Word {

    private String word;
    private String guess;

    public Word(String word) {
        this.word = word;
        this.guess = "";
        for (int i = 0; i < word.length(); i++) {
            guess += "-";
        }
    }

    public String getWord() {
        return word;
    }

    public String getGuess() {
        return guess;
    }

    public boolean matchGuess(char letter) {
        return word.contains(Character.toString(letter));
    }

    public String displayLetter(ArrayList<Character> guessedLetters) {
        String newGuess = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (guessedLetters.contains(letter)) {
                newGuess += letter;
            } else {
                newGuess += "_";
            }
        }
        guess = newGuess;
        return guess;
    }


    public boolean hasWon() {
        return guess.equals(word);
    }
}
