import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Framingawt5
{
	Frame win;

	Button btnNorth, btnSouth, btnEast, btnWest, btnCenter;
	BorderLayout layout;

	Framingawt5()
	{
		win = new Frame("BorderLayout");

		btnNorth = new Button("NORTH");
		btnSouth = new Button("SOUTH");
		btnEast  = new Button("EAST");
		btnWest  = new Button("WEST");
		btnCenter= new Button("CENTER");

		BorderLayout layout = new BorderLayout(10,10);
		win.setLayout(layout);

		win.add(btnNorth, "North");
		win.add(btnSouth, "South");
		win.add(btnEast, "East");
		win.add(btnWest, "West");
		win.add(btnCenter,"Center");

		win.addWindowListener(this);
		win.setSize(750,350);

		win.setLocationRelativeTo(null);
		win.setVisible(true);
	}

	public void windowOpened(WindowEvent we){}
		public void wondowClosing(WindowEvent we)
		{
			System.exit(0);
		}

		public void windowClosed(WindowEvent we){}
		public void WindowIconfied(WindowEvent we){}
		public void windowActivated(WindowEvent we){}
		public void windowDeiconfied(WindowEvent we){}
		public void windowDeactivated(WindowEvent we){}

		public static void main(String[] args) 
		{
			Framingawt5 ob = new Framingawt5();
		}
	
}