package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.MasterLeagueFactory;
import za.ac.cput.projects.SubDomain.MasterLeague;

public class MasterLeagueTest {
    private MasterLeague master;
    @Before
    public void setUp() {
        master = MasterLeagueFactory.createMasterLeage("Premier Soccer League","Cape Town City");
    }

    @Test
    public void createMasterLeague(){
        Assert.assertEquals(master.getMasterLeagueName(), master.getMasterLeagueName());
        Assert.assertEquals(master.getTeamChosen(), master.getTeamChosen());
    }
}
