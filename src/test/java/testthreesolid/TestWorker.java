package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	private  Worker w = new Worker();
	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod(){
		assertEquals("I'm working already!", w.work());
	}

	// @Test
	// @DisplayName("Hollie's Pass Test")
	// public void newtesthbwWorkerPass() {

	// }
}