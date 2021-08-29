package Crew;

import Enums.RankType;

public abstract class CrewMember {

    private String name;
    private RankType rankType;

    public CrewMember(String name, RankType rankType){
        this.name =name;
        this.rankType = rankType ;
    }

    public String getName() {
        return name;
    }

    public RankType getRankType() {
        return rankType;
    }

}
