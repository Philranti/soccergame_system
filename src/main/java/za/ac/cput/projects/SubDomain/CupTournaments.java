package za.ac.cput.projects.SubDomain;

import java.util.Objects;

public class CupTournaments {
   private String nameOfTournament;
    private int numberOfTournaments;
    private int numberOfCupTeams;

    private CupTournaments(Builder builder) {
        this.nameOfTournament = builder.nameOfTournament;
        this.numberOfTournaments = builder.numberOfTournaments;
        this.numberOfCupTeams = builder.numberOfCupTeams;
    }

    public String getNameOfTournament() {
        return nameOfTournament;
    }

    public int getNumberOfTournaments() {
        return numberOfTournaments;
    }

    public int getNumberOfCupTeams() {
        return numberOfCupTeams;
    }

    public static class Builder{

        private String nameOfTournament;
        private int numberOfTournaments;
        private int numberOfCupTeams;

        public Builder nameOfTournament(String nameOfTournament) {
            this.nameOfTournament = nameOfTournament;
            return this;
        }

        public Builder numberOfTournaments(int numberOfTournaments) {
            this.numberOfTournaments = numberOfTournaments;
            return this;
        }

        public Builder numberOfCupTeams(int numberOfCupTeams) {
            this.numberOfCupTeams = numberOfCupTeams;
            return this;
        }

        public CupTournaments build() {
            return new CupTournaments(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CupTournaments that = (CupTournaments) o;
        return getNumberOfTournaments() == that.getNumberOfTournaments() &&
                getNumberOfCupTeams() == that.getNumberOfCupTeams() &&
                Objects.equals(getNameOfTournament(), that.getNameOfTournament());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfTournament(), getNumberOfTournaments(), getNumberOfCupTeams());
    }

    @Override
    public String toString() {
        return "CupTournaments{" +
                "nameOfTournament='" + nameOfTournament + '\'' +
                ", numberOfTournaments=" + numberOfTournaments +
                ", numberOfTeams=" + numberOfCupTeams +
                '}';
    }
}
