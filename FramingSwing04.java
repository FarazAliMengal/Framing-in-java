import java.awt.Frame;
import java.awt.Button;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FramingSwing04 implements ActionListener
{
	Frame win;
	Button btnprev;

	public FramingSwing04()
	{
		win = new Frame("Previous Frame");

		btnprev = new Button("Previous");
		win.add(btnprev);

		btnprev.addActionListener(this);
		win.setSize(200,100);
		win.show();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(btnprev == ae.getSource())
		{
			FramingSwing04 ob = new FramingSwing04();
			win.hide();
		}
	}

	public static void main(String[] args) 
	{
		new FramingSwing04();
	}
}