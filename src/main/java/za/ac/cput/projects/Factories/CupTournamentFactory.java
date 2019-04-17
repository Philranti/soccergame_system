package za.ac.cput.projects.Factories;
import za.ac.cput.projects.SubDomain.CupTournaments;

public class CupTournamentFactory {
    public static CupTournaments createCupTournament(String nameOfTournament, int numberOfTournaments, int numberOfCupTeams) {
        return new CupTournaments.Builder()
                .nameOfTournament(nameOfTournament)
                .numberOfTournaments(numberOfTournaments)
                .numberOfCupTeams(numberOfCupTeams)
                .build();
    }
}
