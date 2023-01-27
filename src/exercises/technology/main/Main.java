package exercises.technology.main;

public class Main {
    //build an average mid-range pc
    public static Computer myPC = new Computer("intelCoreI7","GTX 1660","16GB");

    //build an average mid-range laptop
    public static Laptop myLaptop = new Laptop(15, "intelCoreI5","integrated GFX","8GB");

    //build an average mid-range smartphone
    public static Smartphone myCell = new Smartphone("Android","Snapdragon 665","Adreno 612","4GB");

    //do stuff with your devices here
    public static void main(String[] args) {

        // Computer

        System.out.println("\nYour average mid-range computer specs: "
                + myPC.getCpu() + ", " + myPC.getGpu() + ", " + myPC.getRam() + " RAM.");
        myPC.connectToWiFi("password");
        myPC.powerStatus("ON");


        // Laptop

        System.out.println("\nYour average mid-range laptop specs: "
                + myLaptop.getScreenSize() + ", " + myLaptop.getCpu() + ", "
                + myLaptop.getGpu() + ", " + myLaptop.getRam() + " RAM.");
        myLaptop.touchPadOff();
        myLaptop.touchPadOn();
        myLaptop.connectToWiFi("qwerty");
        myLaptop.powerStatus(87);

        // Smartphone

        System.out.println("\nYour average mid-range smartphone specs: "
                + myCell.getBrand() + ", " + myCell.getCpu() + ", "
                + myCell.getCpu() + ", " + myCell.getRam() + " RAM.");
        myCell.faceScannerOff();
        myCell.faceScannerOn();
        myCell.connectToWiFi("asdf1234");
        myCell.powerStatus(0);
    }
}
