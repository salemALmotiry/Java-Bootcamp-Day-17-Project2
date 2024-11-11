public abstract class Passenger {

    private String name;
    private String ID;
    private Car car;
    private double tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void calculateTripCost(Car car) ;
    public abstract void display() ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
