package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.IEat;
import threesolid.ISick;

public class BaseWorker implements IWork, IEat {

	public void work(){
		System.out.println("BaseWorker doing some work, yeehaw.");
	}

}