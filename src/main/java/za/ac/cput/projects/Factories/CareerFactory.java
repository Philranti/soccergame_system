package za.ac.cput.projects.Factories;
import za.ac.cput.projects.SubDomain.SoccerCareerLeague;

public class CareerFactory {
    public static SoccerCareerLeague createCareer(String careerType, String teamCareerChosen) {
        return new SoccerCareerLeague.Builder()
                .careerType(careerType)
                .teamCareerChosen(teamCareerChosen)
                .build();
    }

}
