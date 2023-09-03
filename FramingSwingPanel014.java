import java.awt.Frame;
import java.awt.Panel;



class FramingSwingPanel014
{
	Frame win;
	Panel panel;

	public  FramingSwingPanel014()
	{
		win = new Frame("Panel");
		panel = new Panel();

		win.add(panel);

		win.setSize(750,350);
		win.setLocation(200,100);
		win.setVisible(true); 
	}

	public static void main(String[] args) 
	{
		 FramingSwingPanel014 ob = new  FramingSwingPanel014();
	}
}