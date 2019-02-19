package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.Workable;
import threesolid.Feedable;

class SuperWorker implements Workable, Feedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}

// With the decision to split the Working Interface and the Eating interface
// we have broken the Open/Closed principle, but this was done in order to
// honor the Interface Segregation Principle, on having more narrow, but 
// specific interfaces. Because SuperWorker needs both, the code had to be 
// modified to access both Interfaces.
// The Single Responsibility Principle is still honored here, as this class
// appeals to a single user type. 