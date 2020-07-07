package GenericsChallenge;

import OurGenericsClass.BaseballPlayer;
import OurGenericsClass.FootballPlayer;
import OurGenericsClass.Team;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam  = new Team<>("Chicago Cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 2, 1);
        hawthorn.matchResult(adelaideCrows, 3, 2);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
    }
}
