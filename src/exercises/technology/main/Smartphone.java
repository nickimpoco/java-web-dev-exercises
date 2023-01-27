package exercises.technology.main;

public class Smartphone extends Computer {
    private String brand;
    public boolean scanner = false;

    public Smartphone(String brand, String cpu, String gpu, String ram) {
        super(cpu, gpu, ram);
        this.brand = brand;
    }
    //todo: additional battery statuses
    public void powerStatus(double dub){
        if(dub==0){
            System.out.println("PHONE MUST BE CHARGED");
        } else {
            System.out.println("CURRENT PHONE BATTERY: " + dub);
        }
    }
    public void faceScannerOn(){
        scanner = true;
        System.out.println("Face scanner disabled.");
    }
    public void faceScannerOff(){
        scanner = false;
        System.out.println("Face scanner enabled.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
