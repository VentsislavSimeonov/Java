package lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, 100, 100);
		g.drawRect(100, 100, 100, 200);
		g.drawOval(200, 100, 300, 300);
		// Color color = new Color(20, 33, 122);
		Color newColor = Color.BLUE;
		g.setColor(newColor);
		g.drawLine(20, 20, 20, 300);
		g.fillRect(100, 100, 100, 200);
		int[] x = { 600, 700, 650, 800 };
		int[] y = { 300, 300, 500, 1000 };
		g.setColor(Color.RED);
		g.fillPolygon(x, y, 4);
	}
}