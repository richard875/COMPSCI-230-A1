// Richard Lee
// rli315
// This is the Moving Ellipse File

import java.awt.*;

class MovingEllipse extends MovingShape {
	public MovingEllipse() {
		super();
	}
	
	public MovingEllipse(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
	}
	
	public MovingEllipse(int heightWidth) {
		super.width = heightWidth;
		super.height = heightWidth;
	}
	
	public void draw(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(super.fillColor);
		g2d.fillOval(super.x, super.y, super.width, super.height);
		g2d.setPaint(super.borderColor);
		g2d.drawOval(super.x, super.y, super.width, super.height);
	}
	
	public double getArea() {
		return Math.PI * (super.width/2) * (super.height/2);
	}
	
	public boolean contains(Point mousePt) {
		Point EndPt = new Point(x + super.width, y + super.height);
		double dx = (2 * mousePt.x - x - EndPt.x) / (double) width;
		double dy = (2 * mousePt.y - y - EndPt.y) / (double) height;
		return dx * dx + dy * dy < 1.0;
	}
}