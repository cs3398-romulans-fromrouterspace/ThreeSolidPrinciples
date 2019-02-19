package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.IReboot;
import threesolid.BaseWorker;

class Robot extends BaseWorker implements IReboot{
	public void work() {
		System.out.println("I do robot work");
	}
	public void reboot(){
		System.out.println("Need to reboot segfault");
	}
}

// With the implementation of the Robot class, we kept in mind
// that the Robot class need only implement the Workable interface.
// The Open/Closed Principle was broken, but was broken in an effort
// to "thin" out the exisiting Interfaces, segregating the work
// function from the eat function. The robot class needs only one
// of these functions, and to minimize potential issues of implementing
// an interface with more functions than necessary, we split the original
// IWorker Interface. This honors the "Interface Segregation" Principle.
// This class also honors the "Single Responsibility" by appealing to
// a single type of user, a "robot" worker.
