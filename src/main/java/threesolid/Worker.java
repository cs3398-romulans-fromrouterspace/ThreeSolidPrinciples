package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.IEat;
import threesolid.ISick;

class Worker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.println("Worker working...");
	}

	public void eat() {
		System.out.println("Worker eating...");
	}
	public void sick(){
		System.out.println("I need to use my sick days");
	}
}

// Single responsibilty is in play with this class because it only represents general workers.
// Interface Segregation was used to separate the eat and work functions since the robot class won't be using eating.
// Open/Closed Principle was broken but for the sake of having more focused interfaces.
