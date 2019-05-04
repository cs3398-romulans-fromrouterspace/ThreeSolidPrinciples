package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	Robot w = new Robot();
	@Test
	@DisplayName("Work Method Test Pass")
//public void newTestKAMWWorkerPass() {
//       assertEquals("Need to reboot segfault",w.reboot());
//}
	@Test
	@DisplayName("Work Method Test Fail")
	public void newTestKAMWWorkerFail() {
		assertEquals("Robot will not reboot",w.reboot());
	}
}
