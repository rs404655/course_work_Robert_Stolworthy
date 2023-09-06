
/***
* Example JUnit testing class for Circle2 (and Circle)
***/

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;
   private Circle2 circle1;
   private Circle2 circle3;
   private Circle2 circle4;
   


// 
// Stuff you want to do before each test case
//
@BeforeEach
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(2,3,4);
   circle2 = new Circle2(1,2,3);
   circle3 = new Circle2(-2,8,2);
   circle4 = new Circle2(6,2,3);
}

//
// Stuff you want to do after each test case
//
@AfterEach
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove2.");
   p = circle2.moveBy(1,1);
   assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg2.");
   p = circle2.moveBy(-1,-1);
   assertTrue(p.x == 0 && p.y == 1);
}

// 
// Test simple intersections between two circles
//
@Test
public void intersectionNormal()
{
   
   System.out.println("Running test intersectionNormal2.");
   assertTrue(circle1.intersects(circle2));

   
}

// 
// Test non-intersection intersection
//
@Test
public void intersectionNone()
{
   
   System.out.println("Running test intersectionNone2.");
   assertTrue(circle2.intersects(circle3) != true);

   
}

// 
// Test barely touching intersection
//
@Test
public void intersectionEdge()
{
   
   System.out.println("Running test intersectionEdge2.");
   assertTrue(circle2.intersects(circle4));

   
}

// 
// Test a positive normal scale
//
@Test
public void scaleNormal()
{
   
   System.out.println("Running test scaleNormal2.");
   circle2.radius = circle2.scale(2);
   assertTrue(circle2.radius == 6);

   
}

// 
// Test a positive decimal scale
//
@Test
public void scaleDecimal()
{
   
   System.out.println("Running test scaleDecimal2.");
   circle2.radius = circle2.scale(.8);
   assertTrue(circle2.radius == (3 * .8));

   
}


// 
// Test a negative scale
//
@Test
public void scaleNegative()
{
   
   System.out.println("Running test scaleNegative2.");
   circle2.radius = circle2.scale(-1);
   assertTrue(circle2.radius == 3);
   
}

// 
// Test a zero or no scale
//
@Test
public void scaleZero()
{
   
   System.out.println("Running test scaleZero2.");
   circle2.radius = circle2.scale(0);
   assertTrue(circle2.radius == 0);

   
}

}
