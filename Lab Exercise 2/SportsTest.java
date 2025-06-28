// Player.java - Base class
class Player {
    // Method to be overridden
    public void play() {
        System.out.println("Player is playing a sport.");
    }
}

// CricketPlayer.java - Subclass of Player
class CricketPlayer extends Player {
    @Override
    public void play() {
        System.out.println("Cricket player is batting or bowling.");
    }
}

// FootballPlayer.java - Subclass of Player
class FootballPlayer extends Player {
    @Override
    public void play() {
        System.out.println("Football player is kicking the ball.");
    }
}

// Main class to test
public class SportsTest {
    public static void main(String[] args) {
        // Base class object
        Player generalPlayer = new Player();
        generalPlayer.play();

        // Cricket player object
        CricketPlayer cricketer = new CricketPlayer();
        cricketer.play();

        // Football player object
        FootballPlayer footballer = new FootballPlayer();
        footballer.play();
    }
}
