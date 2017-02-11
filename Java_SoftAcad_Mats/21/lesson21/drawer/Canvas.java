package lesson21.drawer;

import java.util.List;


public class Canvas {
	

	public void draw(Shape s) {
		s.draw(this);
	}
	
	// public void drawAll(List<Shape> shapes) {
	// List<Shape> shapes
	// List<? extends Shape> shapes
	public void drawAll(List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
}
