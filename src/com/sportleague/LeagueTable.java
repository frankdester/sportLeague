package com.sportleague;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<L extends Player> {
    public String name;
    private ArrayList<Team<L>> teams;//arraylist team  private ArrayList<Team<L>> teams


    public LeagueTable(String name){
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean addTeams(Team<L> team){
        if(this.teams.contains(team)){
            System.out.println(team+" already exist");
            return false;
        }else{
            this.teams.add(team);
            return true;
        }
    }
    public boolean leagueClassement(){
        if(this.teams != null){
            Collections.sort(this.teams);
            System.out.println("*****championsLeague classement*****");
            for(Team<L> foot : this.teams)
                System.out.println(foot.getName()+" matches won :"+foot.matchWon()+" matches tied :"+foot.matchTied()+
                        " matches lost :"+foot.matchLost()+" total ranking ///"+foot.ranking()+"///");
            return true;
        }else
            return false;
    }
}

