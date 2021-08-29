package Crew;

import Enums.RankType;

public class Pilot extends CrewMember{

    private String licence;

    public Pilot(String name, RankType rankType, String licence){
        super(name , rankType);
        this.licence = licence;
    }


    public String getLicence() {
        return licence;
    }

    public String flyPlane(){
        return "Im a bird mom!";
    }
}
