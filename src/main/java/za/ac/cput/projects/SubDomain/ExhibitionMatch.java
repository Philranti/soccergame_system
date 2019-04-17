package za.ac.cput.projects.SubDomain;

import java.util.Objects;

public class ExhibitionMatch {
    private String playMode;    // play against PC or player
    private String teamChosen;  // team you choosing to play
    private String teamOpponent; // team you playing against
    private boolean homeAway;   // playing home or away

    public ExhibitionMatch() {
    }

    private ExhibitionMatch(Builder builder) {
        this.playMode = builder.playMode;
        this.teamChosen = builder.teamChosen;
        this.teamOpponent = builder.teamOpponent;
        this.homeAway = builder.homeAway;
    }

    public String getPlayMode() {
        return playMode;
    }

    public String getTeamChosen() {
        return teamChosen;
    }

    public String getTeamOpponent() {
        return teamOpponent;
    }

    public boolean isHomeAway() {
        return homeAway;
    }

    public static class Builder{

        private String playMode, teamChosen, teamOpponent;
        private boolean homeAway;

        public Builder playMode(String playMode) {
            this.playMode = playMode;
            return this;
        }

        public Builder teamChosen(String teamChosen) {
            this.teamChosen = teamChosen;
            return this;
        }

        public Builder teamOpponent(String teamOpponent) {
            this.teamOpponent = teamOpponent;
            return this;
        }

        public Builder homeAway(boolean homeAway) {
            this.homeAway = homeAway;
            return this;
        }

        public ExhibitionMatch build() {
            return new ExhibitionMatch(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExhibitionMatch that = (ExhibitionMatch) o;
        return homeAway == that.homeAway &&
                Objects.equals(playMode, that.playMode) &&
                Objects.equals(teamChosen, that.teamChosen) &&
                Objects.equals(teamOpponent, that.teamOpponent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playMode, teamChosen, teamOpponent, homeAway);
    }

    @Override
    public String toString() {
        return "ExhibitionMatch{" +
                "playMode='" + playMode + '\'' +
                ", teamChosen='" + teamChosen + '\'' +
                ", teamOpponent='" + teamOpponent + '\'' +
                ", homeAway=" + homeAway +
                '}';
    }
}
