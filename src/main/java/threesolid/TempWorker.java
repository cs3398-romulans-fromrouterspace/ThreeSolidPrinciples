package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

import threesolid.IEat;
import threesolid.ISick;
import threesolid.BaseWorker;

class TempWorker extends BaseWorker implements IEat, ISick{

  @Override
  public void basework() {
		System.out.println("I do diffrent work");
	}
  public String eat() {
      return "I am a temp worker, I don't eat much";
  }
  public void sick() {
      System.out.println("I can't call off sick, I have no sick days.");
  }

}

// Single Responsibility is in play here because this class only handels the TempWorker class and nothing else
// Interface Segregation was used to keep the eat/sick interface  separate from the robot interface because people don't reboot
//Open/Close was broken to have more interfaces
