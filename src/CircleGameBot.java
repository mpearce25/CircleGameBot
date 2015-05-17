import java.applet.Applet;
import java.awt.*;

import javax.swing.*;

public class CircleGameBot extends JPanel {

	public static void displayGUI(JFrame frame) throws AWTException {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the menu bar. Make it have a green background.
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(154, 165, 127));
		greenMenuBar.setPreferredSize(new Dimension(200, 20));

		// Create a yellow label to put in the content pane.

		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(getColor());
		yellowLabel.setPreferredSize(new Dimension(200, 180));

		// Set the menu bar and add the label to the content pane.
		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] a) throws AWTException {

		JFrame frame = new JFrame("Test");

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					displayGUI(frame);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Color color = new Color(255, 255, 255);

		for (int i = 0; i < 100;) {
			if (!color.equals(getColor())) {
				color = getColor();
				System.out.println(getColor());

				// JFrame frame = new JFrame("TopLevelDemo");

			}
		}
	}

	public static Color getColor() throws AWTException {

		Robot bot = new Robot();

		double x = MouseInfo.getPointerInfo().getLocation().getX();
		double y = MouseInfo.getPointerInfo().getLocation().getY();

		return (bot.getPixelColor((int) x, (int) y));

	}

	public static String getColorString() throws AWTException {

		return getColor().toString();
	}
}
