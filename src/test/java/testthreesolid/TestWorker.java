package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	BaseWorker w = new BaseWorker();
	@Test
	@DisplayName("Work Method Test")
	public void newtestKAMWorkerPass(){
	      assertEquals(w.Work(), true);
	}
}
