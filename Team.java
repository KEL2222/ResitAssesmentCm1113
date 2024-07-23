//Katelyn Leggott 2208628
/*This is the Team class it declares the country of origin, world ranking and its skaters.
 *it uses a method to declare the overall team's score
*/

import java.util.ArrayList;

public class Team {

    //Fields
    private String country;
    private int worldRanking;
    private ArrayList<Skater> skaters;

    //Constuctors
    public Team(String country, int worldRanking) {
        this.country = country;
        this.worldRanking = worldRanking;
        this.skaters = new ArrayList<>();
    }

    //Getters
    public String getCountry() {
        return country;
    }

    public int getWorldRanking() {
        return worldRanking;
    }
    public ArrayList<Skater> getSkaters(){
        return skaters;
    }

    //Method to add a skater to the team
    public void addSkater(Skater skater) {
        skaters.add(skater);
    }


    //Method to calculate the total standard run score for the team
    public int getTeamStandardRunScore() {
        int teamScore = 0;
        for (Skater skater : skaters) {
            for(int score : skater.getStandardRunScores()) {
                teamScore += score;
            }
        }
        return teamScore;
    }

    //Method to print the summary of the team and its skaters
    public void printSummary() {
        System.out.println("Country: " + country + ", World Ranking: " + worldRanking);
        System.out.println("Skaters:");
        for (Skater skater : skaters) {
            skater.printSummary();
        }
    }

}
