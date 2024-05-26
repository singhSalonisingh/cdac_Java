package Cordinates;

public class Rectangle {
private Point[] points = new Point[4];
public Rectangle(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
	points[0]=new Point(x1,y1);
	points[1]=new Point(x2,y2);
	points[2]=new Point(x3,y3);
	points[3]=new Point(x4,y4);
}
public Rectangle(Point p1,Point p2,Point p3,Point p4) {
	points[0]=p1;
	points[1]=p2;
	points[2]=p3;
	points[3]=p4;
}
public String display() {
	return  "Rectangle: [" + points[0].getX() + "," + points[0].getY()+"] [" + points[1].getX() + ","+ points[1].getY() +
			"] [" + points[2].getX() + ","+ points[2].getY() + "] [" + points[3].getX() + ","+ points[3].getY() + "]";
}
}
