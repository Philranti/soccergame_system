package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.CupTournamentFactory;
import za.ac.cput.projects.SubDomain.CupTournaments;

public class CupTournamentTest {
    private CupTournaments tournaments;
    @Before
    public void setUp() {
        tournaments = CupTournamentFactory.createCupTournament("FA Cup", 3, 32);
    }

    @Test
    public void createCupTournament(){
        Assert.assertEquals(tournaments.getNameOfTournament(), tournaments.getNameOfTournament());
        Assert.assertEquals(tournaments.getNumberOfTournaments(), tournaments.getNumberOfTournaments());
        Assert.assertEquals(tournaments.getNumberOfCupTeams(), tournaments.getNumberOfCupTeams());

    }
}
