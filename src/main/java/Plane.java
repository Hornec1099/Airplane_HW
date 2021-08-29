import Enums.PlaneType;

public class Plane {

    private String name;
    private PlaneType planeType;

    public Plane(String name, PlaneType planeType){
        this.name =name;
        this.planeType =planeType;
    }

    public String getName() {
        return name;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacityFromEnum(){
        return planeType.getCapacity();
    }

    public int getWeightFromEnum(){
        return planeType.getWeight();
    }
}
