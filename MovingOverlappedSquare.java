// Richard Lee
// rli315
// This is the Moving Overlapped Square File

import java.awt.*;
import java.security.*;
import java.util.*;

class MovingOverlappedSquare extends MovingRectangle {	
	private boolean isOverlapped;
	private Random rand;
	private Rectangle square1;
	private Rectangle square2;
	public static int SIZE = 30;
	private int xDiffOne;
	private int yDiffOne;
	private int xDiffTwo;
	private int yDiffTwo;
	
	public MovingOverlappedSquare(Random rand) {
		super();
		this.rand = rand;
		this.setUp();
	}
	
	public MovingOverlappedSquare(int num, Random rand) {
		if (num < 2 * SIZE) {
			super.width = 2 * SIZE + 1;
		} else {
			super.width = num;
		}
		if (num < SIZE) {
			super.height = SIZE + 1;
		} else {
			super.height = num;
		}
		this.rand = rand;
		this.setUp();
	}
	
	public MovingOverlappedSquare(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType, Random rand) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
		if (w < 2 * SIZE) {
			super.width = 2 * SIZE + 1;
		}
		if (h < SIZE) {
			super.height = SIZE + 1;
		}
		this.rand = rand;
		this.setUp();
	}
	
	private void setUp() {
		int oneX = this.rand.nextInt(super.width - SIZE);
		int oneY = this.rand.nextInt(super.height - SIZE);
		int twoX = this.rand.nextInt(super.width - SIZE);
		int twoY = this.rand.nextInt(super.height - SIZE);
		square1 = new Rectangle(oneX+this.x, oneY+this.y, SIZE, SIZE);
		square2 = new Rectangle(twoX+this.x, twoY+this.y, SIZE, SIZE);
		if ((oneX >= twoX && oneX <= twoX + SIZE && oneY >= twoY && oneY <= twoY + SIZE)||(oneX + SIZE >= twoX && oneX <= twoX + SIZE && oneY >= twoY && oneY <= twoY + SIZE)||(oneX >= twoX && oneX <= twoX + SIZE && oneY + SIZE >= twoY && oneY <= twoY + SIZE)||(oneX + SIZE >= twoX && oneX <= twoX + SIZE && oneY + SIZE >= twoY && oneY <= twoY + SIZE)) {
			this.isOverlapped = true;
		} else {
			this.isOverlapped = false;
		}
		xDiffOne = (int) square1.getX() - super.x;
		yDiffOne = (int) square1.getY() - super.y;
		xDiffTwo = (int) square2.getX() - super.x;
		yDiffTwo = (int) square2.getY() - super.y;
	}
	
	public boolean isRandomReady() {
		return !(this.rand == null);
	}
	
	public void draw(Graphics g) {
		final Graphics2D g2d = (Graphics2D) g;
		if (this.isOverlapped) {
			g2d.setPaint(super.fillColor);
			g2d.fillRect((int) this.square1.getX(), (int) this.square1.getY(), (int) this.square1.getWidth(), (int) this.square1.getHeight());
			g2d.fillRect((int) this.square2.getX(), (int) this.square2.getY(), (int) this.square2.getWidth(), (int) this.square2.getHeight());
		}
		if (!this.isOverlapped) {
			g2d.setPaint(super.fillColor);
			g2d.drawRect((int) this.square1.getX(), (int) this.square1.getY(), (int) this.square1.getWidth(), (int) this.square1.getHeight());
			g2d.drawRect((int) this.square2.getX(), (int) this.square2.getY(), (int) this.square2.getWidth(), (int) this.square2.getHeight());
		}
		g2d.setPaint(super.borderColor);
		g2d.drawRect(super.x, super.y, super.width, super.height);
	}
	
	public boolean getIsOverlapped() {
		return this.isOverlapped;
	}
	
	public Rectangle getSquare1() {
		return square1;
	}
	
	public Rectangle getSquare2() {
		return square2;
	}
	
	public void move() {
		path.move();
		square1.setLocation(super.x + this.xDiffOne, super.y + this.yDiffOne);
		square2.setLocation(super.x + this.xDiffTwo, super.y + this.yDiffTwo);
		
	}
	
	public void setWidth(int w) {
		if (w >= 2 * SIZE) {
			super.width = w;
			this.setUp();
		}
	}

	public void setHeight(int h) {
		if (h >= SIZE) {
			super.height = h;
			this.setUp();
		}
	}
}