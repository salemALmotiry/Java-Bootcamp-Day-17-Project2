
public class Subscribers extends Passenger {



    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void calculateTripCost(Car car){

        try {
            if (car.getMaximumCapacity() ==0 )
                throw new Exception("Car: "+car.getCode()+" Maximum Capacity is "+car.getMaximumCapacity()+" cannot proceed for "+super.getName());

            double cost = car.getRoute().getPrice() - (car.getRoute().getPrice() * 0.5 );
            this.setTripCost(cost);
            car.setMaximumCapacity((car.getMaximumCapacity()-1));

            this.setCar(car);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void display() {
        System.out.println("\n_____________Trip INFO (Subscriber)____________\n");

        if(this.getCar() != null){
            System.out.println("----------------");
            System.out.println("Passenger info");
            System.out.println("----------------");

            System.out.println("Passenger name: " + super.getName());
            System.out.println("Passenger ID: " + super.getID());
            System.out.println("Passenger trip cost after 50% discount: " + (float) super.getTripCost());

            System.out.println("----------------");
            System.out.println("Route info");
            System.out.println("----------------");

            System.out.println("Route: " + super.getCar().getRoute().getPickupAddress() +
                    " - " + super.getCar().getRoute().getDestinationAddress());
            System.out.println("Trip price: " + super.getCar().getRoute().getPrice());

            System.out.println("----------------");
            System.out.println("Car info");
            System.out.println("----------------");
            System.out.println("Car code: " + super.getCar().getCode());
            System.out.println("Maximum capacity (currently): " + super.getCar().getMaximumCapacity());



        }else {
            System.out.println("*Waring* No car found at this time for "+super.getName() +". Processes Field ");


        }

    }
}
