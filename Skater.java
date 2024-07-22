//Katelyn Leggott 2208628
/*This is the skater class. This contains the detals of individual skaters*/



public class Skater {

    //Feilds
    private String name;
    private int age;
    private String weightClass;
    private int[] standardRunScores; //To store scores of 3 standard runs
    private boolean disqualified;
    private int suddenDeathRank;

    //Constructors
    public Skater(String name, int age, String weightclass) {
        this.name = name;
        this.age = age;
        this.weightClass = weightClass;
        this.standardRunScores = new int[3];
        this.disqualified = false;
        this.suddenDeathRank = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public int[] getStandardRunScores() {
        return standardRunScores;
    }

    public boolean isDisqualified() {
        return disqualified;
    }

    public int getSuddenDeathRank(){
        return suddenDeathRank;
    }
    

    //Method to disqualify the skater
    public void disqualify() {
        this.disqualified = true;
    }
    

    //Method to add a score to a specific run
    public void addStandardRunScore(int index, int score) {
        if (index >= 0 && index < 3) {
            this.standardRunScores[index] = score;
        }
    }
    
    //Method to set the sudden death rank
    public void setSuddenDeathRank(int rank) {
        this.suddenDeathRank = rank;
    }

    public void printSummary() {
        System.out.println("Name: " + name + ",Age: " + age + ", Weight Class" + weightClass);
        System.out.println("Standard Run Scores: " + standardRunScores[0] + "," + standardRunScores[1] + ", " + standardRunScores[2]);
        System.out.println("Disqualified: " + disqualified + ", Sudden Death Rank: " + suddenDeathRank );
    }
}
