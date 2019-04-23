package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.IEat;
import threesolid.ISick;
import threesolid.BaseWorker;

class SuperWorker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.format(".... working much more");
	}
	public void eat() {
		System.out.format(".... eating so much more");
	}
	public void sick() {
		System.out.format(".... Recovering so much faster");
	}
}
