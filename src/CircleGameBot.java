import java.awt.*;
import java.awt.event.*;

<<<<<<< HEAD
public class CircleGameBot {

	public static void main(String[] args){
=======
public class CircleGameBot implements MouseMotionListener{

	
	public static void main(String[] args) throws AWTException{
		Robot bot = new Robot();
		addMouseMotionListener(this);
>>>>>>> origin/master
		
	
		
<<<<<<< HEAD
		for (int i = 0; i < 100; i ++){
			
			
			System.out.println(getColor());
		}
	}
	
	public static String getColor(){
		Robot bot = new Robot();
		
		String color = "";
		Mouse
		return color;
	}
=======
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


	
>>>>>>> origin/master
}
