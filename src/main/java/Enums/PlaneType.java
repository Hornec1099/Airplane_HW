package Enums;

public enum PlaneType {

    BOEING747(100, 350),
    BIGENGINE(50, 150),
    PROPELLER(4, 75);



    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }
    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
