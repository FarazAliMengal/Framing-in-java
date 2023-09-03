import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

class Framing3
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame("Calculator");
		frame.setBackground(Color.black);
		

		Font font = new Font("Arial",Font.ITALIC,20);

		Label lbl1 = new Label("Enter First Value");
		Label lbl2 = new Label("Enter 2nd Value");
		Label lbl3 = new Label("Result");

		TextField txt1 = new TextField();
		TextField txt2 = new TextField();
		TextField txt3 = new TextField();

		Button btn1 = new Button("+");
		btn1.setFont(font);
		btn1.setBackground(Color.gray);

		Button btn2 = new Button("-");
		btn2.setFont(font);
		btn2.setBackground(Color.gray);

		Button btn3 = new Button("*");
		btn3.setFont(font);
		btn3.setBackground(Color.gray);

		Button btn4 = new Button("/");
		btn4.setFont(font);
		btn4.setBackground(Color.gray);

		Button btn5 = new Button("%");
		btn5.setFont(font);
		btn5.setBackground(Color.gray);

		Button btn6 = new Button("Clear");
		btn6.setFont(font);
		btn6.setBackground(Color.gray);
		btn6.setForeground(Color.white);


		GridLayout layout = new GridLayout(6,2,10,10);
		frame.setLayout(layout);

		//frame.setLayout(layout);

		
		frame.add(lbl1);
		lbl1.setBackground(Color.darkGray);
		lbl1.setForeground(Color.white);
		frame.add(txt1);

		frame.add(lbl2);
		lbl2.setBackground(Color.darkGray);
		lbl2.setForeground(Color.white);
		frame.add(txt2);

		frame.add(lbl3);
		lbl3.setBackground(Color.darkGray);
		lbl3.setForeground(Color.white);
		frame.add(txt3);

		frame.add(btn1);
		//btn1.setForeground(Color.green);

		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);

		frame.setSize(500,500);
		frame.setLocation(300,150);


		frame.show();
	}
}