package za.ac.cput.projects.FactoryTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Factories.CareerFactory;
import za.ac.cput.projects.SubDomain.SoccerCareerLeague;

public class CareerTest {
    private SoccerCareerLeague career;
    @Before
    public void setUp() {
        career = CareerFactory.createCareer("Coaching Career", "Barcelona" );
    }

    @Test
    public void createCareer(){
        Assert.assertEquals(career.getCareerType(), career.getCareerType());
        Assert.assertEquals(career.getTeamCareerChosen(), career.getTeamCareerChosen());
    }

}
