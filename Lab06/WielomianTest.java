import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class WielomianTest{

    private static Wielomian wielomianTest;

    @BeforeAll
    public static void setUp(){
        wielomianTest = new Wielomian(3,2,6);
    }

    @Test
    public void setABC1(){
        wielomianTest.setABC(3,5,6);
        assertEquals(3.0, wielomianTest.a);
        assertEquals(5.0, wielomianTest.b);
        assertEquals(6.0, wielomianTest.c); 

        wielomianTest.setABC(5,2,4);
        assertEquals(5.0, wielomianTest.a);
        assertEquals(2.0, wielomianTest.b);
        assertEquals(4.0, wielomianTest.c); 
    }
    
    @Test
    public void getAtX(){
        assertEquals(11.0, wielomianTest.getAtX(1));
        assertEquals(39.0, wielomianTest.getAtX(3));
    }

    @Test
    public void testIntegral(){
        assertEquals(30.0, wielomianTest.integral(-1, 2));
        assertEquals(140.0, wielomianTest.integral(-3, 4));
        assertEquals(14.0, wielomianTest.integral(-1, 1));
        assertEquals(90.0, wielomianTest.integral(-3, 3));
    }
 


}
