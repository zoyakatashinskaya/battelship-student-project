public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Battleship!!!\n");

        Game newGame = Game.getInstance();
        newGame.play();
    }
}
