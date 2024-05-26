package Cordinates;

public class Line {
	//private int x2,y2;
	private Point[] points = new Point[2];

	
	public Line(int x1,int y1,int x2,int y2) {
		points[0] = new Point(x1, y1);
		points[1] = new Point(x2, y2);

	}
	
	public Line(Point p1, Point p2) {
		points[0] = p1;
		points[1] = p2;

	}
	
	public String display() {
		return  "Line: [" + points[0].getX() + "," + points[0].getY()+"] [" + points[1].getX() + ","+ points[1].getY() + "]";
		//return "x1 and y1:"+ptLine.display()+"second cord: "+"x2 and y2"+"["+x2+","+y2+"]";
	}

}
