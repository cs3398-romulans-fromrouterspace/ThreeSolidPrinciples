package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

/* 
Follows Interface Segregation Principle
Interfaces are client specific rather than general purpose
*/
interface IEat {
	public String eat();
	
}