package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.SoccerLeagueFactory;
import za.ac.cput.projects.SubDomain.SoccerLeague;

public class SoccerLeagueTest {
    private SoccerLeague league;
    @Before
    public void setUp() {
        league = SoccerLeagueFactory.createSoccerLeague("English Premier League",38, 20);
    }

    @Test
    public void createSoccerLeague(){
        Assert.assertEquals(league.getNameOfLeague(), league.getNameOfLeague());
        Assert.assertEquals(league.getTotalGames(), league.getTotalGames());
        Assert.assertEquals(league.getNumberOfTeams(), league.getNumberOfTeams());

    }
}
