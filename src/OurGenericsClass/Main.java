package OurGenericsClass;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer balakov = new FootballPlayer("Balakov");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer stoichkov = new SoccerPlayer("Stoichkov");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        // adelaideCrows.addPlayer(pat);
        // adelaideCrows.addPlayer(stoichkov);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam  = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        melbourne.addPlayer(balakov);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 2, 1);
        hawthorn.matchResult(adelaideCrows, 3, 2);

        adelaideCrows.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(melbourne.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(hawthorn));
    }
}
