import Cordinates.Line;
import Cordinates.Point;
import Cordinates.Rectangle;
import Cordinates.Triangle;


public class DemoPoint {
public static void main(String arg[]) {
	Line l1=new Line(10,20,70,80);
	Line l2 = new Line(new Point(23, -65), new Point(45, -43));
	System.out.println(l1.display());
	System.out.println(l2.display());
//	Point p1=new Point();
	Triangle t1=new Triangle (1,2,2,3,3,4);
	System.out.println(t1.display());
	Triangle t2=new Triangle(new Point (9,8),new Point(7,6),new Point(6,5));
	System.out.println(t2.display());
	Rectangle r1=new Rectangle(1,2,3,4,5,6,7,8);
	System.out.println(r1.display());
	Rectangle r2=new Rectangle(new Point(9,8),new Point(8,7),new Point(7,6),new Point(6,5));
	System.out.println(r2.display());
	//Student[] students  = new Student[numberOfStudent];
}
}
