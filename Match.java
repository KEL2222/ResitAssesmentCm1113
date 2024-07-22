//Katelyn Leggott
/*This is the match class, this runs the standard run and the sudden deathruns. 
After completing the runs, match.java declares a winner of the individual match */

public class Match {
    
    //Fields
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;

    //Contrictors
    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Score = 0;
        this.team2Score = 0;
    }

    public void conductStandardRuns() {
        for (int runNumber = 1; runNumber <= 3; runNumber++) {
            for (Skater skater : team1.getSkaters()) {
                int timeTaken = (int) (Math.random() * 70); // Random time between 0 and 70 seconds
                int barsKnocked = (int) (Math.random() * 34); // Random bars knocked between 0 and 34
                StandardRun.calculateScore(skater, runNumber, timeTaken, barsKnocked);
            }
        }
    }
    
    //Method to conduct sudden death runs
    public void conductSuddenDeathRuns() {
        SuddenDeathRun.conductSuddenDeath(team1);
        SuddenDeathRun.conductSuddenDeath(team2);
    }

    //Method to determin the winner
    public Team determineWinner() {
        int team1Score = team1.getTeamStandardRunScore();
        int team2Score = team2.getTeamStandardRunScore();
        for (Skater skater : team1.getSkaters()) {
            if (skater.getSuddenDeathRank() == 50) {
                team1Score += 50;
                break;
            }
        }
        for (Skater skater : team2.getSkaters()) {
            if (skater.getSuddenDeathRank() == 50) {
                team2Score += 50;
                break;
            }
        }
        //return the team with the higher score
        return team1Score > team2Score ? team1 : team2;
    }

    //Method to print summary
    public void printMatchSummary() {
        System.out.println("Match Summary:");
        System.out.println("Team 1:");
        team1.printSummary();
        System.out.println("Team 2:");
        team2.printSummary();
        Team winner = determineWinner();
        System.out.println("Winner: " + winner.getCountry());
    }



}
