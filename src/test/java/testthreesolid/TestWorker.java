package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	Worker w = new Worker();
	TempWorker t = new TempWorker();
	
	@Test
	@DisplayName("Hollie's Pass Test")
	public void newTestHBWWorkerPass() {
		assertEquals("Worker working...", w.work());
	}

	// @Test 
	// @DisplayName("Hollie's Fail Test")
	// public void newTestHBWWorkerFail() {
	// 	assertEquals("I am a temp worker, I eat everything", t.eat());
	// }
}