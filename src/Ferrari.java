public class Ferrari extends Car {

    private int keys;

    /**
     * Constructor
     */
    public Ferrari(int keys, String model, String color, int seats) {
        super(model, color, seats);
        this.keys = keys;
    }

    @Override
    public void display() {
        System.out.println("Model is: "+ super.getModel() +"\n"+
                "Color is: "+ super.getColor() +"\n"+
                "Seats is: "+ super.getSeats() +"\n"+
                "Keys is: "+ keys +"\n"+
                "------------------------");
    }
}
