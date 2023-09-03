import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Framingawt1
{
	Frame win;

	Button btnNorth, btnSouth, btnEast, btnWest, btnCentre;
	BorderLayout layout;

	public Framingawt1()
	{
		win = new Frame("BorderLayout");
		win.setLayout(new BorderLayout(10,10));

		btnNorth = new Button("NORTH");
		btnSouth = new Button("SOUTH");
		btnEast  = new Button("EAST");
		btnWest  = new Button("WEST");
		btnCentre = new Button("CENTRE");

		win.add(btnNorth);
		win.add(btnSouth);
		win.add(btnEast);
		win.add(btnWest);
		win.add(btnCentre);

		win.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});

		win.setSize(750,350);
		win.setLocationRelativeTo(null);
		win.show();
	}

	public static void main(String[] args) 
	{
		Framingawt1 ob = new Framingawt1();
	}
}
