package exercises.technology.test;

import exercises.technology.main.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class ComputerTest {
    @Test
    public void testUniqueComputers() {
        // Create two Computer objects
        Computer computer1 = new Computer("intelCoreI7", "GTX 1660", "16GB");
        Computer computer2 = new Computer("intelCoreI5", "GTX 1650", "8GB");

        // Test Computer for unique ID
        assertNotEquals(computer1.getId(), computer2.getId());
    }

    @Test
    public void testUniqueLaptops() {
        // Create two Laptop objects
        Laptop laptop1 = new Laptop(15, "intelCoreI5", "integrated GFX", "8GB");
        Laptop laptop2 = new Laptop(13, "intelCoreI3", "integrated GFX", "4GB");

        // Test Laptop for unique ID
        assertNotEquals(laptop1.getId(), laptop2.getId());
    }

    @Test
    public void testUniqueSmartphones() {
        // Create two Smartphone objects
        Smartphone smartphone1 = new Smartphone("Android", "Snapdragon 665", "Adreno 612", "4GB");
        Smartphone smartphone2 = new Smartphone("iOS", "A13 Bionic", "Apple GPU", "3GB");

        // Test Smartphone for unique ID
        assertNotEquals(smartphone1.getId(), smartphone2.getId());

    }



    @Test
    public void testMyPcSpecs() {
        // Test that myPC has the correct CPU
        assertEquals("intelCoreI7", Main.myPC.getCpu());

        // Test that myPC has the correct GPU
        assertEquals("GTX 1660", Main.myPC.getGpu());

        // Test that myPC has the correct amount of RAM
        assertEquals("16GB", Main.myPC.getRam());

        //Test that myPC connects to Wi-Fi
    }

    @Test
    public void testComputerConnectToWiFi() {
        Main.myPC.connectToWiFi("password");
        assertTrue(Main.myPC.wifi);
        Main.myPC.connectToWiFi("PaSsWoRd");
        assertFalse(Main.myPC.wifi);
    }

    @Test
    public void testComputerPower() {
        Main.myPC.powerStatus("ON");
        assertTrue(Main.myPC.power);
        Main.myPC.powerStatus("OFF");
        assertFalse(Main.myPC.power);
    }

    @Test
    public void testMyLaptopSpecs() {
        // Test that myLaptop has the correct screen size
        assertEquals(15, Main.myLaptop.getScreenSize(), .001);

        // Test that myLaptop has the correct CPU
        assertEquals("intelCoreI5", Main.myLaptop.getCpu());

        // Test that myLaptop has the correct GPU
        assertEquals("integrated GFX", Main.myLaptop.getGpu());

        // Test that myLaptop has the correct amount of RAM
        assertEquals("8GB", Main.myLaptop.getRam());
    }

    @Test
    public void testLaptopTouchpad() {
        // Test that the touchpad turns off
        Main.myLaptop.touchPadOff();
        assertFalse(Main.myLaptop.touchPad);

        // Test that the touchpad turns on
        Main.myLaptop.touchPadOn();
        assertTrue(Main.myLaptop.touchPad);
    }

    @Test
    public void testMyCellSpecs() {
        // Test that myCell has the correct brand
        assertEquals("Android", Main.myCell.getBrand());

        // Test that myCell has the correct CPU
        assertEquals("Snapdragon 665", Main.myCell.getCpu());

        // Test that myCell has the correct GPU
        assertEquals("Adreno 612", Main.myCell.getGpu());

        // Test that myCell has the correct amount of RAM
        assertEquals("4GB", Main.myCell.getRam());
    }

    @Test
    public void testCellScanner() {
        // Test that the face scanner turns off
        Main.myCell.faceScannerOff();
        assertFalse(Main.myCell.scanner);

        // Test that the face scanner turns on
        Main.myCell.faceScannerOn();
        assertTrue(Main.myCell.scanner);
    }
}