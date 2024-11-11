public class Car {

    private String code;
    private  Route route;
    private int maximumCapacity;

    public Car(String code, Route route, int maximumCapacity) {
        this.code = code;
        this.route = route;
        this.maximumCapacity = maximumCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}
