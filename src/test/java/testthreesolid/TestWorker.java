package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	Robot w = new Robot();
	@Test
	@DisplayName("Work Method Test")
//public void newTestKAMWWorkerPass() {
//							assertEquals("Need to reboot segfault",w.reboot());
//	}

	public void newTestKAMWWorkerFail() {
							assertEquals("Robot will not reboot",w.reboot());
	}
}
