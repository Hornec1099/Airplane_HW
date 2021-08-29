package Crew;

import Enums.RankType;

public class CabinCrew extends CrewMember{

    public CabinCrew(String name, RankType rankType){
        super(name, rankType);
    }

    public String RelayCaptainMessage(String command){
        return "The Captain says Yuo should all " + command;
    }
}
