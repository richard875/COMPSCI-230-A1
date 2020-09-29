// Richard Lee
// rli315
// This is the Moving Square File extending Moving Rectangle Class

import java.awt.*;

class MovingSquare extends MovingRectangle {
	public MovingSquare() {
		super();
	}
	
	public MovingSquare(int widthHeight) {
		super.width = widthHeight;
		super.height = widthHeight;
	}
	
	public MovingSquare(int x, int y, int wh, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, wh, wh, mw, mh, bc, fc, pathType);
	}
	
	public void setWidth(int w) {
		super.width = w;
		super.height = w;
	}
	
	public void setHeight(int w) {
		super.width = w;
		super.height = w;
	}
}