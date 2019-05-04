package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	 Worker w = new Worker();

	@Test
	@DisplayName("Austin Pass")
	public void newTestAMWorkerPass(){
		assertEquals("Worker working...", w.work());
	}

	@Test
	@DisplayName("Austin fail")
	public void newTestAMWorkerFail(){
		assertEquals("This is gonna fail", w.work());
	}
}