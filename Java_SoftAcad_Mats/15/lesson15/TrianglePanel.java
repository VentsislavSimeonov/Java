package lesson15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TrianglePanel extends JPanel {
	private int side;

	public TrianglePanel(int side) {
		this.side = side;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xCenter = this.getWidth() / 2;
		int yCenter = this.getHeight() / 2;
		this.setBackground(Color.BLUE);
		int[] x = { xCenter, xCenter + side, xCenter };
		int[] y = { yCenter, yCenter, yCenter + side };
		g.setColor(Color.RED);
		g.fillPolygon(x, y, 3);
		g.setColor(Color.CYAN);
		
		Font font = new Font(g.getFont().getName(), Font.BOLD, 22);
		g.setFont(font);
		g.drawString("Krali Marko", xCenter, yCenter);
	}
}