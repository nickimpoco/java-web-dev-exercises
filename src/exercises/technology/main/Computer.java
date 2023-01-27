package exercises.technology.main;

import static org.junit.Assert.assertTrue;

public class Computer extends AbstractEntity{
    //basic computer specs
    private String cpu;
    private String gpu;
    private String ram;
    public boolean wifi = false;
    public boolean power = false;

    public Computer(String cpu, String gpu, String ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }


    //todo: add user input
    public void powerStatus(String str){
        if(str.equalsIgnoreCase("on")){
            power = true;
            System.out.println("System online");
        } else {
            power = false;
            System.out.println("System offline");
        }
    }
    //todo: add user input
    public void connectToWiFi(String pwd){
        if(pwd.equals("password")){
            wifi = true;
            System.out.println("Connected to WiFi");
        } else {
            wifi = false;
            System.out.println("Incorrect password, not connected to WiFi");
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
