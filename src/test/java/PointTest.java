import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void test() {
        Point test = new Point(6, 7);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 7);
    }
    @Test
    public void testSetters() {
        Point test = new Point(6, 8);
        test.setX(6);
        test.setY(8);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(),8);
    }
    @Test
    public void testSelectable() {
        Point test = new Point(6, 7, true);
        assertTrue(test.getIsSelectable());
        test.setIsSelectable(false);
        assertTrue(!test.getIsSelectable());
    }
}
