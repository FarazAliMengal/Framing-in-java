import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Button;

class Framing4
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame("Form");
		frame.setBackground(Color.black);

		Label lbl1 = new Label("Enter Your Name ");
	//	LAYOUT_LEFT_TO_RIGHT(Lbl1);
		Label lbl2 = new Label("Possword");

		TextField txt1 = new TextField();
		TextField txt2 = new TextField();

		Button btn1 = new Button("Login");
		Button btn2 = new Button("Back");

		GridLayout layout = new GridLayout(3,2,5,5);
		frame.setLayout(layout);

		frame.add(lbl1);
		lbl1.setBackground(Color.gray);
		frame.add(txt1);

		frame.add(lbl2);
		lbl2.setBackground(Color.gray);
		frame.add(txt2);

		frame.add(btn1);
		btn1.setBackground(Color.darkGray);
		frame.add(btn2);
		btn2.setBackground(Color.darkGray);

		frame.setSize(500,500);
		frame.setLocation(300,150);

		frame.show();
	}
}

