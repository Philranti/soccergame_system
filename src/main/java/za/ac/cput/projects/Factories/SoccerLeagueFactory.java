package za.ac.cput.projects.Factories;
import za.ac.cput.projects.SubDomain.SoccerLeague;


public class SoccerLeagueFactory {
    public static SoccerLeague createSoccerLeague(String nameOfLeague,int totalGames, int numberOfTeams ) {
        return new SoccerLeague.Builder()
                .nameOfLeague(nameOfLeague)
                .totalGames(totalGames)
                .numberOfTeams(numberOfTeams)
                .build();
    }

}
