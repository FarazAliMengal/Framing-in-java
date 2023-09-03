import javax.swing.*;


class FramingSwing1
{
	public static void main(String[] args) 
	{
		JFrame win = new JFrame("JSwing");

		JLabel lbl1 = new JLabel("Name");
		JTextField txt = new JTextField();
		JButton btn = new JButton("Ok");

		win.add(lbl1);
		win.add(txt);
		win.add(btn);
		win.show();

		win.setDefaultCloseOperation(JFrame.EXIT_ON_ClOSE);
		
	}
}

