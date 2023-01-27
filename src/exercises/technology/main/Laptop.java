package exercises.technology.main;

public class Laptop extends Computer {
    private double screenSize;
    public boolean touchPad = false;

    public Laptop(double screenSize, String cpu, String gpu, String ram) {
        super(cpu, gpu, ram);
        this.screenSize = screenSize;
    }

    public void touchPadOn(){
        touchPad = true;
        System.out.println("Touchpad toggled on.");
    }
    public void touchPadOff(){
        touchPad = false;
        System.out.println("Touchpad toggled off.");
    }
    public void powerStatus(double dub){
        if(dub==0){
            System.out.println("LAPTOP MUST BE CHARGED");
        } else {
            System.out.println("CURRENT LAPTOP BATTERY: " + dub);
        }
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
