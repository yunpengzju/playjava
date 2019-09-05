import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author miro
 * @version $Id: TestFirstAlgo.java, v 0.1 2019-09-05 10:01:16 miro Exp $
 */
public class TestFirstAlgo {
    @Test
    void testAdd() {
        FirstAlgo algoInstance = new FirstAlgo();
        assertEquals(3, algoInstance.add(1, 2));
    }
}
