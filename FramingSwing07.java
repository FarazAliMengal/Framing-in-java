import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileInputStream;


class FramingSwing07 implements ActionListener
{
	JFrame win;

	JLabel lbl1,lbl2,lbl3;
	JTextField txt1,txt2,txt3;

	JButton btnSub,btnExit,btnBack;
	GridLayout layout;
	Color color;
	Font btnFont,lblFont,txtFont;

	{
		win = new JFrame();
		win.setTitle("Subtraction");

		lblFont = new Font("Forte",Font.PLAIN,18);
		txtFont = new Font("Agency FB",Font.PLAIN,22);
		btnFont = new Font("Times New Roman",Font.BOLD,22);

		lbl1 = new JLabel("Enter First Value");
		lbl1.setFont(lblFont);
		win.add(lbl1);

		txt1 = new JTextField();
		txt1.setFont(txtFont);
		win.add(txt1);

		lbl2 = new JLabel("Enter Second Value");
		lbl2.setFont(lblFont);
		win.add(lbl2);

		txt2 = new JTextField();
		txt2.setFont(txtFont);
		win.add(txt2);

		lbl3 = new JLabel("Result");
		lbl3.setFont(lblFont);
		win.add(lbl3);

		txt3 = new JTextField();
		txt3.setEditable(false);
		txt3.setFont(txtFont);
		win.add(txt3);

		btnSub = new JButton("Sub");
		btnSub.setFocusable(false);
		btnSub.setFont(btnFont);
		win.add(btnSub);

		btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.setFont(btnFont);
		win.add(btnExit);

		btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.setFont(btnFont);
		win.add(btnBack);

		layout = new GridLayout(5,2);
		win.setLayout(layout);

		btnSub.addActionListener(this);
		btnExit.addActionListener(this);
		btnBack.addActionListener(this);

		win.setSize(450,450);
		win.setLocationRelativeTo(null);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(btnSub == ae.getSource())
			{
				String v1 = txt1.getText();
				String v2 = txt2.getText();

				int a = Integer.parseInt(v1);
				int b = Integer.parseInt(v2);

				txt3.setText(""+(a-b));

				try 
				{
					File file=new File("F:\\Filling\\Subtraction.txt");
					file.createNewFile();
				
					FileInputStream th1=new FileInputStream(file);
					PrintStream ob2=new PrintStream(file);

					ob2.println(""+a);
					ob2.println(""+b);
					ob2.println(""+(a-b));
				}

				catch(Exception e)
				{
					System.out.print(e);
				}
			}

			if(btnExit == ae.getSource())
			{
				System.exit(0);
			}

			if(btnBack == ae.getSource())
			{
				FramingSwing05 ob = new FramingSwing05();
				win.hide();
			}
		}

		public static void main(String[] args) 
		{
			new FramingSwing07();
		}
}