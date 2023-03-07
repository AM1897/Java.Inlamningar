public class Main {
    public static void main(String[] args) {
        System.out.println("Hello HangMan");
        Game game = new Game(new WordList());
        game.start();
    }
}
