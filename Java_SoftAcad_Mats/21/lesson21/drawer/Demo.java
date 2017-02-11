package lesson21.drawer;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle());
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		
		canvas.drawAll(shapes); 
		
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		circles.add(new Circle());
		circles.add(new Circle());
		
		canvas.drawAll(circles); 
	}
}
