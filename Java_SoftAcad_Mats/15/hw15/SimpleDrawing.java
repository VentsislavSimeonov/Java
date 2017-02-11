package hw15;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SimpleDrawing {
	private final static String[] POSSIBLE_COLORS = {"White", "Blue", "Red", "Green", "Black"};
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Simple drawing");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);		
		
		String[] figures = {"Rectangle", "Circle"};
		String figure = (String)JOptionPane.showInputDialog(null, "Enter figure to be drawn", "Choose figure", JOptionPane.QUESTION_MESSAGE, null, figures, "Rectangle");
		
		String numberStr = JOptionPane.showInputDialog(null, "Enter number of shapes to be drawn");
		int number = Integer.parseInt(numberStr);
		
		String distanceStr = JOptionPane.showInputDialog(null, "Enter distance");
		int distance = Integer.parseInt(distanceStr);
		
		String color = (String) JOptionPane.showInputDialog(null, "Choose color", "Color", JOptionPane.QUESTION_MESSAGE, null, POSSIBLE_COLORS, null);
		
		DrawingPanel drawingPanel = new DrawingPanel(figure, color, number, distance);
		frame.add(drawingPanel);
		
		frame.setVisible(true);
	}
}
