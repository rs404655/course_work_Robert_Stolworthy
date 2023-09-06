
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   if (Math.abs(center.x - other.center.x) <= (2*radius) &&
       Math.abs(center.y - other.center.y) <= (2*radius))
      return true;
   return false;
}

}

