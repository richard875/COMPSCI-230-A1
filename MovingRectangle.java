// Richard Lee
// rli315
// This is the Moving Rectangle File

import java.awt.*;

class MovingRectangle extends MovingShape {
	public MovingRectangle() {
		super();
	}
	
	public MovingRectangle(int widthHeight) {
		super.width = widthHeight;
		super.height = widthHeight;
	}
	
	public MovingRectangle(int topLeftX, int topLeftY, int width, int height, int marginWidth, int marginHeight, Color borderColor, Color fillColor, int pathNum) {
		super(topLeftX, topLeftY, width, height, marginWidth, marginHeight, borderColor, fillColor, pathNum);
	}
	
	public void draw(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(super.fillColor);
		g2d.fillRect(super.x, super.y, super.width, super.height);
		g2d.setPaint(super.borderColor);
		g2d.drawRect(super.x, super.y, super.width, super.height);
	}
	
	public double getArea() {
		return super.width * super.height;
	}

	public boolean contains(Point mousePt) {
		if (mousePt.x >= super.x && mousePt.x <= super.x + super.width && mousePt.y >= super.y && mousePt.y <= super.y + super.height) {
			return true;
		} else {
			return false;
		}
	}
}