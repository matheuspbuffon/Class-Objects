public class Car {

    /**
     * Attribute
     */
    private String model;
    private String color;
    private int seats;

    /**
     * Displays attributes
     */
    public void display() {
        System.out.println("Model is: "+ model +"\n"+
                "Color is: "+ color +"\n"+
                "Seats is: "+ seats +"\n"+
                "------------------------");
    }

    /**
     * Constructor
     */
    public Car(String model, String color, int seats) {
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    /**
     * Getters
     */
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getSeats() { return seats; }

    /**
     * Setters
     */
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setSeats(int seats) { this.seats = seats; }
}
