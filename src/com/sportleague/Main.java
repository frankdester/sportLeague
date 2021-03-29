package com.sportleague;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        TennisPlayer roger_federer = new TennisPlayer("Roger Federer");
        TennisPlayer raphael_nadal = new TennisPlayer("Raphael Nadal");
        TennisPlayer novak_Djokovic = new TennisPlayer("Novak Djockovic");
        TennisPlayer  gael_monfils = new TennisPlayer("Gael Monfils");

        Team<TennisPlayer> novak = new Team<>("Novak Djockovic");
        novak.addPlayer(novak_Djokovic);
        Team<TennisPlayer> roger = new Team<>("Roger Federer");
        roger.addPlayer(roger_federer);
        Team<TennisPlayer> nadal = new Team<>("Raphael Nadal");
        nadal.addPlayer(raphael_nadal);
        Team<TennisPlayer> monfils = new Team<>("Gael Monfils");
        monfils.addPlayer(gael_monfils);

        roger.matchResult(novak,6,3);
        nadal.matchResult(roger,6,4);
        monfils.matchResult(nadal,2,6);
        novak.matchResult(monfils,2,2);
        novak.matchResult(monfils,7,2);
        novak.matchResult(nadal,2,2);

        System.out.println("ranking");
        System.out.println(nadal.getName()+" : "+nadal.ranking());
        System.out.println(monfils.getName()+" : "+monfils.ranking());
        System.out.println(roger.getName()+" : "+roger.ranking());
        System.out.println(novak.getName()+" : "+novak.ranking());

        ArrayList<Team<TennisPlayer>> usopen = new ArrayList<>();
        usopen.add(roger);
        usopen.add(nadal);
        usopen.add(monfils);
        usopen.add(novak);
        Collections.sort(usopen);
        System.out.println("***********************Players ranking***********************");
        for(Team<TennisPlayer> x : usopen)
            System.out.println(x.getName()+" : "+x.ranking());
        System.out.println(monfils.matchWon());

        Football lionel_messi = new Football("Lionel Messi");
        Football gareth_bale = new Football("Gareth Bale");
        Football cristiano_ronaldo = new Football("Cristiano Ronaldo");
        Football kelian_mbappe = new Football("Kelian Mbappe");
        Football robert_lewandoski = new Football("Robert Lewandoski");
        Football luis_suarez = new Football("Luis Suarez");
        Football sergio_ramos = new Football("Sergio Ramos");

        Team<Football>  barcelona = new Team<>("Barcelona");
        barcelona.addPlayer(lionel_messi);
        Team<Football> tottenham = new Team<>("Tottenham");
        tottenham.addPlayer(gareth_bale);
        Team<Football> juventus_de_turin = new Team<>("Juventus De Turin");
        juventus_de_turin.addPlayer(cristiano_ronaldo);
        Team<Football> psg = new Team<>("Paris Saint Germain");
        psg.addPlayer(kelian_mbappe);
        Team<Football> bayern_munich = new Team<>("Bayern Munich");
        bayern_munich.addPlayer(robert_lewandoski);
        Team<Football> athletico_madrid = new Team<>("Athletico Madrid");
        athletico_madrid.addPlayer(luis_suarez);
        Team<Football> real_madrid = new Team<>("Real Madrid");
        real_madrid.addPlayer(sergio_ramos);

        barcelona.matchResult(tottenham,3,2);
        tottenham.matchResult(juventus_de_turin,2,2);
        juventus_de_turin.matchResult(psg,3,1);
        psg.matchResult(bayern_munich,2,3);
        bayern_munich.matchResult(athletico_madrid,2,0);
        athletico_madrid.matchResult(real_madrid,1,1);
        real_madrid.matchResult(barcelona,2,1);

        //ArrayList<LeagueTable<Football>> championsLeague = new ArrayList<>();
        LeagueTable<Football> championsLeague = new LeagueTable<>("championsLeague");
        championsLeague.addTeams(barcelona);
        championsLeague.addTeams(tottenham);
        championsLeague.addTeams(juventus_de_turin);
        championsLeague.addTeams(psg);
        championsLeague.addTeams(bayern_munich);
        championsLeague.addTeams(athletico_madrid);
        championsLeague.addTeams(real_madrid);

        championsLeague.leagueClassement();

    }
}
