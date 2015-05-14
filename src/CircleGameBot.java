import java.awt.*;
import java.awt.event.*;

public class CircleGameBot implements MouseMotionListener{

	
	public static void main(String[] args) throws AWTException{
		Robot bot = new Robot();
		addMouseMotionListener(this);
		
	}
	
	public static void printPixelColor(int x, int y) throws AWTException{
		
		Robot bot = new Robot();
		System.out.println(bot.getPixelColor(x,y));
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
