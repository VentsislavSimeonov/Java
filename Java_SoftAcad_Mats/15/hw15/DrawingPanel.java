package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JSlider;

import lesson12.Person;

public class DrawingPanel extends JPanel {
	
	private static final int START_X = 10;
	private static final int START_Y = 10;
	private static final int SHAPE_WIDTH = 100;
	private static final int SHAPE_HEIGHT = 100;
	
	/**
	 * Constant for shape rectangle
	 */
	public static final String SHAPE_RECTANGLE = "Rectangle";
	/**
	 * Constant for shape circle
	 */
	public static final String SHAPE_CIRCLE = "Circle";
	private static final String[] POSSIBLE_SHAPES = {SHAPE_RECTANGLE, SHAPE_CIRCLE};
	
	private String shape;
	private Color color;
	private int number;
	private int distance;
	
	/**
	 * Construct panel with number shapes drawn. 
	 * 
	 * @param shape the shape to be drawn(See constants SHAPE_*)
	 * @param color the color of the shape
	 * @param number the number of the shapes which will be drawn
	 * @param distance the distance between the shapes
	 * 
	 */
	public DrawingPanel(String shape, String color, int number, int distance) {
		boolean isValidShape = false;
		for (int i = 0; i < POSSIBLE_SHAPES.length; i++) {
			if(POSSIBLE_SHAPES[i].equals(shape)) {
				isValidShape = true;
				break;
			}
		}
		
		
		if(!isValidShape) {
			throw new IllegalArgumentException(shape);
		}
		this.shape = shape;
		this.color = getColor(color);
		this.number = number;
		this.distance = distance;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(color);
		
		for (int i = 0; i < number; i++) {
			if(shape.equals(SHAPE_RECTANGLE)){
				g.drawRect(START_X + distance * i, START_Y + distance * i, SHAPE_WIDTH, SHAPE_HEIGHT);
			} else if(shape.equals(SHAPE_CIRCLE)) {
				g.drawOval(START_X + distance * i, START_Y + distance * i, SHAPE_WIDTH, SHAPE_HEIGHT);
			}
		}
	}
	
	private Color getColor(String color) {
		if(color.equalsIgnoreCase("White")){ // wHite === WhiTe === white === WHITE
			return Color.WHITE;
		}
		if(color.equals("Blue")){
			return Color.BLUE;
		}
		if(color.equals("Red")){
			return Color.RED;
		}
		if(color.equals("Green")){
			return Color.GREEN;
		}
		return Color.BLACK;
	}
}
