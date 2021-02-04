/**
 * Singleton DP
 */

public class Game{
    private static Game instance;
    User user;
    Computer computer;

    private Game() {
        this.user = new User();
        this.computer = new Computer();
    }

    public static Game getInstance(){
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private void printPlayersBoards(Player user, Computer computer){
        System.out.println("\nYour board is: \n");
        user.printBoard();
        System.out.println("\nThe opponent's board is:\n");
        computer.printBoard();

        System.out.println("\nYour scoreboard:");
        System.out.println("- Player remaining boats: " + user.getFleetLength());
        System.out.println("- Enemy boats destroyed: " + (10 - computer.getFleetLength()) + "\n");
    }

    public void play(){
        //System.out.println("This is user input");
        Player user = new User();
        user.createFleet();

        //System.out.println("The Computer board");
        Computer bot = new Computer();
        bot.createFleet();

        printPlayersBoards(user, bot);

        while(user.getIsAlive() && bot.getIsAlive()) {
            //User hits and computer board is updated
            int[] userHitCoord = user.hit(bot.board);

                Ship ship = bot.wasAttacked(userHitCoord);
                if (ship != null) {
                    if(ship.getLength() > 0) {
                        System.out.println("You hit a boat! ");
                    } else {
                        System.out.println("You destroyed a " + ship.getDisplayName());
                    }
                } else {
                    System.out.println("Miss");
                }

            // Comp generates hit and user board is updated
            int[] compHitCoord = bot.hit(user.board);

            ship = user.wasAttacked(compHitCoord);
            if (ship != null) {
                if(ship.getLength() > 0) {
                    System.out.println("Your boat was hit!");

                } else {
                    System.out.println("Your "+ ship.getDisplayName() +" was destroyed");
                }
            } else {
                System.out.println("The computer missed");
            }

            // boards od players are printed
            printPlayersBoards(user, bot);
        }

        if (user.getIsAlive()) {
            System.out.println("Congratulations, you won!​");
        } else { System.out.println("Sorry, you lost!");}
    }
}