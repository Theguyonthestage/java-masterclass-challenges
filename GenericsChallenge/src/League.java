import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in this league. ");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " was added to the league. ");
            return true;
        }
    }
    public void printTable(){
        //sort
        Collections.sort(teams);
        // loop through all and print each item
        for (Team team: teams){
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
