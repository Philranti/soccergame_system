package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.ExhibitionFactory;
import za.ac.cput.projects.SubDomain.ExhibitionMatch;

public class ExhibitonTest {
    private ExhibitionMatch exhibition;
    private boolean home = true;
    private boolean away = false;

    @Before
    public void setUp() {
        exhibition = ExhibitionFactory.createExhibition("Beginner", "Chelsea", "Arsenal", true);
    }

    @Test
    public void createExhibition(){
        Assert.assertEquals(exhibition.getPlayMode(), exhibition.getPlayMode());
        Assert.assertEquals(exhibition.getTeamChosen(), exhibition.getTeamChosen());
        Assert.assertEquals(exhibition.getTeamOpponent(), exhibition.getTeamOpponent());
        Assert.assertEquals(exhibition.isHomeAway(), true);


    }
}
