interface Area
{
float compute(float x, float y);
}
class Rectangle implements Area
{
public float compute(float x, float y)
{return(x * y);
}}
class Triangle implements Area
{public float compute(float x,float y)
{return(x * y/2);
}}

public class multipleinheritanceusinginterface {
public static void main(String args[])
{	
Rectangle rect = new Rectangle();
Triangle tri = new Triangle();
Area area;
area = rect;
System.out.println("Area Of Rectangle = "+ area.compute(100,20));
area = tri;
System.out.println("Area Of Triangle = "+ area.compute(10,200));
}}
