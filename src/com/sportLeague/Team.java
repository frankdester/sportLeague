package com.sportLeague;

import java.util.ArrayList;
import java.util.Collections;

public class Team<T extends Player> implements Comparable<Team<T>> {//we extend T b/c its should just take Player subclasses. Player is the upper bound of T. T represent parameter of type Player
    private final String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> teamMembers = new ArrayList<>(); //members are of type player : Arraylist<Player>

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public boolean addPlayer(T player){// object of type player //add a player of type T compared to that of the object calling
        if(this.teamMembers.contains(player)){
            System.out.println(player.getName()+" is already in the team");
            return false;
        }else{
            this.teamMembers.add(player);
            System.out.println(player.getName()+" has join the team");
            return true;
        }
    }
    public int numberOfPlayers(){
        return this.teamMembers.size();
    }
    public void matchResult(Team<T> opponent,int ourScore,int opponentResult){
        String message;
        if(ourScore > opponentResult) {
            won++;
            message = " won ";
        }else if(ourScore < opponentResult) {
            lost++;
            message = " lost ";
        }else {
            tied++;
            message = " tied ";
        }played++;
        if(opponent != null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null,opponentResult,ourScore);
        }
    }
    public int ranking(){
        return (won*2) + tied;
    }
    public int matchWon(){
        return won;
    }
    public int matchTied(){
        return tied;
    }
    public int matchLost(){
        return lost;
    }
    @Override
    public int compareTo(Team<T> opponent) {
        if(this.ranking() > opponent.ranking())
            return -1;
        else if(this.ranking() == opponent.ranking())
            return 0;
        else
            return 1;
    }


}

