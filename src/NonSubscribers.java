public class NonSubscribers extends Passenger {

    private double discount;


    public NonSubscribers(String name, String ID,double discount) {
        super(name, ID);
        this.discount = discount;
    }

    @Override
    public void calculateTripCost(Car car){

        try {
            if (car.getMaximumCapacity() ==0 )
                throw new Exception("Car: "+car.getCode()+" Maximum Capacity is "+car.getMaximumCapacity()+" cannot proceed for "+super.getName());


            double cost = car.getRoute().getPrice() - (car.getRoute().getPrice() * discount );
            this.setTripCost(cost);
            car.setMaximumCapacity((car.getMaximumCapacity()-1));
            this.setCar(car);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        System.out.println("\n_____________Trip INFO (Non Subscriber)____________\n");

        if(this.getCar() != null){
            System.out.println("----------------");
            System.out.println("Passenger info");
            System.out.println("----------------");

            System.out.println("Passenger name: " + super.getName());
            System.out.println("Passenger ID: " + super.getID());

            if(this.getDiscount() !=0 ){
                System.out.println("Passenger trip cost after "+this.getDiscount()*100+"% : "+(float)this.getTripCost());
            }else
                System.out.println("Passenger trip cost: "+(float)this.getTripCost());

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


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
