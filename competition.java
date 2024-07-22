//Katelyn Leggott
/* This class manages the entire tournoment process, 
including semi-finals matches, a third-place playoff, and a final.
It then sumerizrs the results then determines the winners of the overall competiton
*/
import java.util.ArrayList;

public class Competition {

    // Fields
    private ArrayList<Team> teams;

    // Constructors
    public Competition(ArrayList<Team> teams) {
       this.teams = teams;
    }

    public void conductCompetition() {
        System.out.println("Conducting Semi-Finals:");
        Team semiFinalWinner1 = conductMatch(teams.get(0), teams.get(3));
        Team semiFinalWinner2 = conductMatch(teams.get(1), teams.get(2));

        System.out.println("\nConducting Third-Place Playoff:");
        Team thirdPlaceTeam1 = semiFinalWinner1 == teams.get(0) ? teams.get(3) : teams.get(0);
        Team thirdPlaceTeam2 = semiFinalWinner2 == teams.get(1) ? teams.get(2) : teams.get(1);
        Team thirdPlaceWinner = conductMatch(thirdPlaceTeam1, thirdPlaceTeam2);
        
        System.out.println("\nConducting Final:");
        Team finalWinner = conductMatch(semiFinalWinner1, semiFinalWinner2);
        Team secondPlaceWinner = (finalWinner == semiFinalWinner1) ? semiFinalWinner2 : semiFinalWinner1;

        System.out.println("\nCompetition Results:");
        System.out.println("Winner: " + finalWinner.getCountry());
        System.out.println("Second Place: " + secondPlaceWinner.getCountry());
        System.out.println("Third Place: " + thirdPlaceWinner.getCountry());
    }

    private Team conductMatch(Team team1, Team team2){
        Match match = new Match(team1, team2);
        match.conductStandardRuns();
        match.conductSuddenDeathRuns();
        match.printMatchSummary();
        return match.determineWinner();
    }
}
