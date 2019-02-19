package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.Workable;
import threesolid.Feedable;

class Worker implements Workable, Feedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}

// Single responsibilty is in play with this class because it only represents general workers.
// Interface Segregation was used to separate the eat and work functions since the robot class won't be using eating.
// Open/Closed Principle was broken but for the sake of having more focused interfaces.