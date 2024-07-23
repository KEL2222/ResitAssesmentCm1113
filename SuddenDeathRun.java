//Katelyn Leggott 2208628
/*The sudden death run class runs for the overall team except if the player is disqualified*/

import java.util.List;
import java.util.Random;

public class SuddenDeathRun extends StandardRun {
    private static final int INITIAL_BAR_HEIGHT = 40;
    private static final int MIN_BAR_HEIGHT = 30;

    // Method to conduct a sudden death run for the team
    public static void conductSuddenDeath(Team team) {
        List<Skater> skaters = team.getSkaters();
        Random random = new Random();
        int remainingSkaters = skaters.size();

        for (Skater skater : skaters) {
            if (!skater.isDisqualified()) {
                int barHeight = INITIAL_BAR_HEIGHT;
                int clearedHeight = 0;  // To track the highest bar cleared

                while (barHeight >= MIN_BAR_HEIGHT) {
                    // Adjust probability of bar being knocked down
                    double disqualificationProbability = 0.5 * ((double) remainingSkaters / skaters.size());
                    boolean barKnocked = random.nextDouble() < disqualificationProbability;
                    
                    if (barKnocked) {
                        skater.disqualify();
                        remainingSkaters--;
                        break;
                    }
                    clearedHeight = barHeight;  // Update the highest bar cleared
                    barHeight--;
                }

                // Set the skater's sudden death rank based on the highest bar cleared
                skater.setSuddenDeathRank(skater.isDisqualified() ? 0 : clearedHeight);
            } else {
                // Skater is already disqualified
                skater.setSuddenDeathRank(0);
            }
        }

        // Ensure at least one skater is not disqualified
        if (remainingSkaters == 0 && !skaters.isEmpty()) {
            Skater lastSkater = skaters.get(skaters.size() - 1);
            lastSkater.setSuddenDeathRank(MIN_BAR_HEIGHT);
            lastSkater.disqualify(false); // Add a method to undisqualify
        }
    }
}
