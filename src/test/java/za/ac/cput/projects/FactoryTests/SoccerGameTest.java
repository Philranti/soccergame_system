package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Domain.SoccerGame;
import za.ac.cput.projects.Factories.SoccerGameFactory;

public class SoccerGameTest {
    private SoccerGame soccer;
    @Before
    public void setUp() {
        soccer = SoccerGameFactory.createSoccerGame(29300,"FIFA 19", "Professional", 15);
    }

    @Test
    public void createSoccerGame(){
    Assert.assertEquals(soccer.getGameType(), soccer.getGameType());
    }
}
