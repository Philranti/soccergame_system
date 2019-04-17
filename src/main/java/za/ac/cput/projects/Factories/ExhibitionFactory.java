package za.ac.cput.projects.Factories;

import za.ac.cput.projects.SubDomain.ExhibitionMatch;

public class ExhibitionFactory {
    public static ExhibitionMatch createExhibition(String playMode, String teamChosen, String teamOpponent, boolean homeAway) {
        return new ExhibitionMatch.Builder()
                .playMode(playMode)
                .teamChosen(teamChosen)
                .teamOpponent(teamOpponent)
                .homeAway(homeAway)
                .build();
    }
}
