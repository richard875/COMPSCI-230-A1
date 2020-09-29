// Richard Lee
// rli315
// This is the Moving Pyramid File

import java.awt.*;

class MovingPyramid extends MovingRectangle {	
	private int xSize;
	private int ySize;
	public static int NUMBER_OF_ROWS = 5;
	
	public MovingPyramid() {
		super();
		setUp();
	}
	
	public MovingPyramid(int heightWidth) {
		super.width = heightWidth;
		super.height = heightWidth;
		setUp();
	}
	
	public MovingPyramid(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
		setUp();
	}
	
	public void draw(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.white);
		g2d.fillRect(super.x + (4*(super.width / 9)), super.y, super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (3*(super.width / 9)), super.y + (1*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (5*(super.width / 9)), super.y + (1*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (2*(super.width / 9)), super.y + (2*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (4*(super.width / 9)), super.y + (2*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (6*(super.width / 9)), super.y + (2*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (1*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (3*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (5*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (7*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (0*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (2*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (4*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (6*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (8*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.setPaint(super.fillColor);
		g2d.fillRect(super.x + (4*(super.width / 9)), super.y + (1*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (3*(super.width / 9)), super.y + (2*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (5*(super.width / 9)), super.y + (2*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (2*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (4*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (6*(super.width / 9)), super.y + (3*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (1*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (3*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (5*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.fillRect(super.x + (7*(super.width / 9)), super.y + (4*(super.height / 5)), super.width / 9, super.height / 5);
		g2d.setPaint(super.borderColor);
		g2d.drawRect(super.x, super.y, super.width, super.height);
	}
	
	public int getXSize() {
		return super.width / 9;
	}
	
	public int getYSize() {
		return super.height / 5;
	}
	
	private void setUp() {
		this.xSize = getXSize();
		this.ySize = getYSize();
	}
	
	public void setHeight(int h) {
		super.height = h;
		this.ySize = getXSize();
	}
	
	public void setWidth(int w) {
		super.width = w;
		this.xSize = getYSize();
	}
}