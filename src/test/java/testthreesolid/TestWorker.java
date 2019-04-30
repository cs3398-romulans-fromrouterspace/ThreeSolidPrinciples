package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	private  Worker w = new Worker();
	AnneBot ab = new AnneBot();
	@Test
	@DisplayName("Work Method Test")
/*	public void newtestALWorkerPass(){
		assertEquals(ab.isAnneRad(), true);
	}*/
	public void newtestALWorkerFail(){
		assertEquals(ab.getInLoser(), "We're going jogging.");
	}
}