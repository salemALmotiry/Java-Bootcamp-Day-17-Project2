import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Route route1 = new Route("Tuwaiq Academy","RIYADH PARK",30.55);
        Route route2 = new Route("Roshn Front","Tuwaiq mountain",100.65);
        Route route3 = new Route("Sudair Street, King Fahd Dist","SHOBAH Dist",41.24);
        Route route4 = new Route("Riyadh Shaffa Dist","King Fahad road",76.21);
        Route route5 = new Route(" Bab Makkah ","Rouwais",81.35);


        Car car1 = new Car("TAX25410",route1,4);
        Car car2 = new Car("TAX25411",route2,0);
        Car car3 = new Car("TAX25412",route3,3);
        Car car4 = new Car("TAX25413",route4,4);
        Car car5 = new Car("TAX25414",route5,3);

        ArrayList<Passenger> passengers = getPassengers();

        System.out.println("FILLED TRIPS LOGS");
        passengers.get(0).calculateTripCost(car1);
        passengers.get(1).calculateTripCost(car2);
        passengers.get(2).calculateTripCost(car3);
        passengers.get(3).calculateTripCost(car3);
        passengers.get(4).calculateTripCost(car5);
        System.out.println("FILLED TRIPS LOGS ENDS");


        System.out.println("\nTRIPS LOGS");
        for (Passenger passenger : passengers) {
           passenger.display();
        }










    }

    public static ArrayList<Passenger> getPassengers() {
        Subscribers passenger1 = new Subscribers("Mohammed","1455474555");

        NonSubscribers passenger2 = new NonSubscribers("Khaled","1455471549",0);
        Subscribers passenger3 = new Subscribers("Salem","1455474555");
        NonSubscribers passenger4 = new NonSubscribers("Sara","1455471549",0);
        NonSubscribers passenger5 = new NonSubscribers("Omer","1455471549",.10);

        ArrayList<Passenger> passengers = new ArrayList<>();

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        return passengers;
    }
}