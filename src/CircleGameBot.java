import java.awt.*;
import java.awt.event.*;

public class CircleGameBot implements MouseListener{

	
	public static void main(String[] args) throws AWTException{
		Robot bot = new Robot();
		
		
	}
	
	public static void printPixelColor(int x, int y) throws AWTException{
		
		Robot bot = new Robot();
		System.out.println(bot.getPixelColor(x,y));
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			printPixelColor(e.getX(),e.getY());
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Hey");
		
	}
}
