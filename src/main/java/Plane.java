public enum Plane {

    AIRBUSA220(30, 350),
    AIRBUSA120(2, 350),
    AIRBUSA330(20, 300),
    BOEING747(40, 350),
    BOEING737(30, 450);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
