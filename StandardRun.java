//Katelyn Leggott 2208628
/*This is the standard run class, it calculates the score for skaters  */

public abstract class StandardRun {

    //Fields
    private static final int COURSE_LENGTH = 50; //meters
    private static final double BAR_DISTANCE = 1.5; //meters
    private static final int[] BAR_HEIGHTS= {60, 50, 40}; //heights for 3 runs

    //Method to calculate the score for a skaters specific run
    public static int calculateScore(Skater skater, int runNumber, int timeTaken, int barsKnocked) {
        if (runNumber < 1 || runNumber > 3) {
            throw new IllegalArgumentException("Run number must be between 1 and 3");
        }


        int timeScore = 60 - timeTaken;
        int barScore = barsKnocked * 5; //assuming each knocked bar deducts 5 points
        int runScore = timeScore - barScore;

        skater.addStandardRunScore(runNumber - 1, runScore);

        return runScore;
    }

    // Abstract method to be implemented by subclass
    public abstract void run(Skater skater);
}
