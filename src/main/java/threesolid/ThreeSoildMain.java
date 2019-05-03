package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class ThreeSoildMain {

    public static Manager tsManager = new Manager();

    // The entry main() method
    public static void main(String[] args) {
        try {
            System.out.format("Starting ... \n"); // Start of Program
        } catch (Exception main_except) {
            main_except.printStackTrace();
        }

        BaseWorker Kendra = new BaseWorker(); // Calls BaseWorker class
        System.out.println("\nBaseWorker: ");
        Kendra.basework();

        Worker David = new Worker(); // Calls worker class
        System.out.println("Worker: ");
        David.work();
        David.eat();
        David.sick();

        SuperWorker SuperMan = new SuperWorker(); // Calls SuperWorker Class
        System.out.println("SuperWorker: ");
        SuperMan.work();
        SuperMan.eat();
        SuperMan.sick();

        TempWorker Joker = new TempWorker(); // Calls TempWorker Class
        System.out.println("TempWorker: ");
        Joker.basework();
        Joker.eat();
        Joker.sick();

        Robot Watson = new Robot(); // Calls Robot Class
        System.out.println("Robot: ");
        Watson.work();
        Watson.reboot();

        ProductManager BatMan = new ProductManager(); // Calls ProductManager Class
        System.out.println("Product Manager: ");
        BatMan.defineProduct();

        ProjectManager WonderWoman= new ProjectManager(); // Calls ProjectManager Class
        System.out.println("Project Manager: ");
        WonderWoman.scheduleWork();


        try {
            System.out.format("\nStopping ... \n"); //Program Stops
        } catch (Exception main_except) {
            main_except.printStackTrace();
        }

        System.exit(0);
    }
}
