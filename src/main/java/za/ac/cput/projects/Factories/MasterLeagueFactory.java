package za.ac.cput.projects.Factories;

import za.ac.cput.projects.SubDomain.MasterLeague;

public class MasterLeagueFactory {
    public static MasterLeague createMasterLeage(String masterLeagueName, String teamChosen) {
        return new MasterLeague.Builder()
                .masterLeagueName(masterLeagueName)
                .teamChosen(teamChosen)
                .build();
    }
}
