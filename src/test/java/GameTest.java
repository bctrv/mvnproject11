import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game = new Game();

    @Test
    public void testSecondPlayerWins() {

        Player oleg = new Player(1, "Oleg", 300);
        Player max = new Player(2, "Max", 680);

        game.register(oleg);
        game.register(max);

        int expected = 2;
        int actual = game.round("Oleg", "Max");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPlayerDoesNotExist() {

        Player oleg = new Player(1, "Oleg", 300);
        Player max = new Player(2, "Max", 680);

        game.register(oleg);
        game.register(max);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Dan", "Sam"));
    }

    @Test

    public void testPlayerDoesNotExist2() {

        Player oleg = new Player(1, "Oleg", 300);
        Player max = new Player(2, "Max", 680);

        game.register(oleg);
        game.register(max);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Oleg", "Sam"));
    }

    @Test
    public void testFirstPlayerWins() {

        Player oleg = new Player(1, "Oleg", 3000);
        Player max = new Player(2, "Max", 680);

        game.register(oleg);
        game.register(max);

        int expected = 1;
        int actual = game.round("Oleg", "Max");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testTie() {

        Player oleg = new Player(1, "Oleg", 300);
        Player max = new Player(2, "Max", 300);

        game.register(oleg);
        game.register(max);

        int expected = 0;
        int actual = game.round("Oleg", "Max");

        Assertions.assertEquals(expected, actual);

    }


}
