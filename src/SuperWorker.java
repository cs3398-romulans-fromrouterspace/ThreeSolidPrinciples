package ThreeSolidPrinciples;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import ThreeSolidPrinciples.IEat;
import ThreeSolidPrinciples.ISick;
import ThreeSolidPrinciples.BaseWorker;

class SuperWorker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.format(".... working much more");
	}
	eat() {
		System.out.format(".... eating so much more");
	}
	sick() {
		System.out.format(".... Recovering so much faster");
	}
}

