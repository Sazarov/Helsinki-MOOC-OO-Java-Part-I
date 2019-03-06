import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (!(this.players.size() >= this.maxSize)) {
            this.players.add(player);
        }

    }

    public void printPlayers() {
        System.out.println(this.players);
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }
    public int goals() {
        int totalGoals = 0;
        for (Player player :
                this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
