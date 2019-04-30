package threesolid;
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;
import threesolid.IReboot;
import threesolid.BaseWorker;
import threesolid.Robot;
class AnneBot extends Robot{
	public boolean isAnneRad(){
		return true;
	}
	public String getInLoser(){
		return "We're going shopping.";
	}
}