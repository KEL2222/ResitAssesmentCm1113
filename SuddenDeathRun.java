//Katelyn Leggott 2208628
/*The sudden death run class runs for the overall team except if the player is disqualified*/

public class SuddenDeathRun extends StandardRun {
    private static final int MAX_SUDDEN_DEATH_SCORE = 50;

    // Method to conduct a sudden death run for the team
    public static void conductSuddenDeath(Team team) {
        for (Skater skater : team.getSkaters()) {
            if (!skater.isDisqualified()) {
                int barHeight = 40;
                int clearedHeight = 0;  // To track the highest bar cleared

                while (barHeight >= 30) {
                    // Assume a random result of the run
                    boolean barKnocked = Math.random() < 0.5;
                    if (barKnocked) {
                        skater.disqualify();
                        break;
                    }
                    clearedHeight = barHeight;  // Update the highest bar cleared
                    barHeight--;
                }

                if (!skater.isDisqualified()) {
                    skater.setSuddenDeathRank(clearedHeight);
                } else {
                    skater.setSuddenDeathRank(0); 
                }
            }
        }
    }
}
