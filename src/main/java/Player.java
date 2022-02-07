public class Player {

    // Properties
    private String name;
    private String position;
    private int number;
    private int contractLength;

    // Constructor
    public Player(String name, String position, int number, int contractLength) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }


    public Player() {
    }

    // Getters & Setters
    // Encapsulation -> Properties of a class are not accessible directly. They can only be accessed using methods
    // name
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    //position
    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    //number
    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    //contractLength
    public int getContractLength () {
        return contractLength;
    }

    public void setContractLength (int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }
}
