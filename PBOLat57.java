/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program Latihan 57
 */

// Class Vehicle
class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.myBrand = brand;
        this.myModel = model;
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        this.myModel = model;
    }
}

// Class Bicycle yang merupakan subclass dari Vehicle
class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, String model, int gears) {
        super(brand, model);
        this.numberOfGears = gears;
    }

    public void displayInfo() {
        System.out.println("Bicycle\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nJumlah Gear: " + numberOfGears);
    }
}

// Class Skateboard yang merupakan subclass dari Vehicle
class Skateboard extends Vehicle {
    private double boardLength;

    public Skateboard(String brand, String model, double length) {
        super(brand, model);
        this.boardLength = length;
    }

    public void displayInfo() {
        System.out.println("Skateboard\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nPanjang Board: " + boardLength);
    }
}

public class PBOLat57 {
    public static void main(String[] args) {
        // Membuat objek Bicycle
        Bicycle bicycle = new Bicycle("Trex Bike", "7.4FX", 23);
        bicycle.displayInfo();
        System.out.println();

        // Membuat objek Skateboard
        Skateboard skateboard = new Skateboard("Ally Skate", "Rocket", 54.5);
        skateboard.displayInfo();
    }
}

