// Richard Lee
// rli315
// This is the Moving Text File, extending Moving Rectangle, a bonus for the program

import java.awt.*;
import java.util.*;
import java.security.*;
import javax.swing.*;

public class MovingText extends MovingRectangle {
	Random rn = new Random();
	private int fontSize = 25;
	private String[] text = {"My name is Richard!", "This course is fun!", "How's your day been?", "Enjoyed this assignment!"};
	private String[] font = {"Helvetica", "Baskerville", "Times", "Bodoni", "Gotham", "Didot", "Futura", "Serif", "Rockwell"};
	private String theText = getRandom(text);
	private String theFont = getRandom(font);
	
	public MovingText() {
		super();
	}
	
	public MovingText(int topLeftX, int topLeftY, int width, int height, int marginWidth, int marginHeight, Color borderColor, Color fillColor, int pathNum) {
		super(topLeftX, topLeftY, width, height, marginWidth, marginHeight, borderColor, fillColor, pathNum);
	}
	
	
	public void draw(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		Font font = new Font(theFont, Font.BOLD, this.fontSize);
		g2d.setFont(font);
		g2d.setColor(super.fillColor);
		g2d.drawString(theText, super.x, super.y);
	}
	
	public void setWidth(int newSize) {
		this.fontSize = newSize / 10;
	}
	
	public void scaleUp() {
		int newSize = this.fontSize * 10;
		setWidth(newSize + 20);
	}
	
	public void scaleDown() {
		if (this.fontSize > 5) {
			int newSize = this.fontSize * 10;
			setWidth(newSize - 20);
		}
	}
	
	public void drawHandles(Graphics g) {
		// if the shape is selected, then draw the handles
		if (super.isSelected()) {
			g.setColor(Color.black);
			g.fillRect(x - 35, y - 35, 4, 4);
			g.fillRect(x + width - 35, y + height - 35, 4, 4);
			g.fillRect(x - 35, y + height - 35, 4, 4);
			g.fillRect(x + width - 35, y - 35, 4, 4);
		}
	}
	
	public static String getRandom(String[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

}