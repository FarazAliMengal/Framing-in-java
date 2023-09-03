import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


class Framingawt3
{
	Frame win;

	Button btnNorth, btnSouth, btnEast, btnWest, btnCentre;
	BorderLayout layout;

	public void Framingawt3()
	{
		win = new Frame("BorderLayout");

		btnNorth = new Button("NORTH");
		btnSouth = new Button("SOUTH");
		btnWest  = new Button("WEST");
		btnEast  = new Button("EAST");
		btnCentre = new Button("CENTER");

		win.add(btnNorth,"North");
		win.add(btnSouth,"South");
		win.add(btnEast,"East");
		win.add(btnWest,"West");
		win.add(btnCentre,"Center");  

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
		Framingawt3 ob = new Framingawt3();
	}
}
