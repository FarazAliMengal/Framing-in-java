import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class Framing02
{
	public static void main(String[] args) 
	{
		Frame frame = new Frame("Form");

		Label lbl1 = new Label("Name");
		Label lbl2 = new Label("Subject");

		TextField txt1 = new TextField();
		TextField txt2 = new TextField();

		Button btn1 = new Button("OK");
		Button btn2 = new Button("Nasir");

		frame.add(lbl1);
		frame.add(lbl2);

		frame.add(txt1);
		frame.add(txt2);

		frame.add(btn1);
		frame.add(btn2);

		frame.show();
	}
}


