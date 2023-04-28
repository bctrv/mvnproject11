import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    Map<String, Player> players = new HashMap();

    public void register(Player player) {
        players.put(player.getName(), player);
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = players.get(playerName1);
        Player player2 = players.get(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException(
                    "Player with name: " + playerName1 + " not found"
            );
        }
        if (player2 == null) {
            throw new NotRegisteredException(
                    "Player with name: " + playerName2 + " not found"
            );
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;
    }
}
