//Katelyn Leggott 2208628
/* This is the main class puts the team of skaters and initializes the compitition*/


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Initialize team1
        Team team1 = new Team("Country1",1);
        team1.addSkater(new Skater("Skater1A", 25, "Light"));
        team1.addSkater(new Skater("Skater1B", 24, "Medium"));
        team1.addSkater(new Skater("Skater1C", 22, "Light"));
        team1.addSkater(new Skater("Skater1D", 23, "Light"));


        //Initialize team2
        Team team2 = new Team("Country2", 2);
        team2.addSkater(new Skater("Skater2A", 28, "Light"));
        team2.addSkater(new Skater("Skater2B", 27, "Medium"));
        team2.addSkater(new Skater("Skater2C", 26, "Heavy"));
        team2.addSkater(new Skater("Skater2D", 25, "Light"));


        //Initialize team3
        Team team3 = new Team("Country3", 3);
        team3.addSkater(new Skater("Skater3A", 28, "Light"));
        team3.addSkater(new Skater("Skater3B", 27, "Medium"));
        team3.addSkater(new Skater("Skater3C", 26, "Heavy"));
        team3.addSkater(new Skater("Skater3D", 25, "Light"));

        //Initialize team4
        Team team4 = new Team("Country4", 4);
        team4.addSkater(new Skater("Skater4A", 22, "Light"));
        team4.addSkater(new Skater("Skater4B", 21, "Medium"));
        team4.addSkater(new Skater("Skater4C", 20, "Heavy"));
        team4.addSkater(new Skater("Skater4D", 19, "Light"));


        //Add all teams too the list of teams
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        //Initialize the comp with list of teams
        Competition competition = new Competition(teams);
        competition.conductCompetition();






    }
    
}
