/* 

Class Manager

Open-Close Principle: Assume that we've created the Worker class before
the Manager class.  At the start, we didn't know we'd need a Manager class.
Rather than modify existing code, we simply added NEW code to the program.

Inteface Segragation:  The Manager design didn't simply cram managerial duties 
into the Worker class.  The respective duties are separated.

Single Responsibility:  A Worker object will not use manage().  Only the 
Manager class will use the method manage().  It is better to have several 
focused classes, rather than a few catch-all classes.

*/

package threesolid;

public class Manager implements WorkableInterface{
	
/*	WorkableInterface worker;
	// I removed this portion because it was simpler to have the Manager class
	// as a subclass, rather than creating a contained object.
	public void setWorker(WorkableInterface w) {
		worker=w;
	}
	public void manage() {
		worker.work();
	}
*/
	public void manage(){
		System.out.println("Manager has managed.");
	}
}