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

class FramingSwing09 implements ActionListener
{
	JFrame win;
	JLabel lbl1,lbl2,lbl3;

	JButton btnkiltogram,btnExit,btnBack;
	JTextField txt1,txt2,txt3;

	GridLayout layout;
	Color color;
	Font btnFont,txtFont,lblFont;

	public FramingSwing09()
	{
		win = new JFrame();
		win.setTitle("Kilo To Gram");

		lblFont = new Font("Forte",Font.PLAIN,18);
		txtFont = new Font("Agency FB",Font.PLAIN,22);
		btnFont = new Font("Times New Roman",Font.BOLD,22);

		lbl1 = new JLabel("Enter Grams");
		lbl1.setFont(lblFont);
		win.add(lbl1);

		txt1 = new JTextField();
		txt1.setFont(txtFont);
		win.add(txt1);

		lbl2 = new JLabel("Kilo");
		lbl2.setFont(lblFont);
		win.add(lbl2);

		txt2 = new JTextField();
		txt2.setEditable(false);
		txt2.setFont(txtFont);
		win.add(txt2);

		btnkiltogram = new JButton("Sumbit");
		btnkiltogram.setFocusable(false);
		btnkiltogram.setFont(btnFont);
		win.add(btnkiltogram);

		btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.setFont(btnFont);
		win.add(btnExit);

		btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.setFont(btnFont);
		win.add(btnBack);

		layout = new GridLayout(4,2);
		win.setLayout(layout);

		win.setSize(450,450);
		win.setLocationRelativeTo(null);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		btnkiltogram.addActionListener(this);
		btnBack.addActionListener(this);
		btnExit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(btnkiltogram == ae.getSource())
		{
			String v1 = txt1.getText();
			int a = Integer.parseInt(v1);

			txt2.setText(""+(a/1000));

			try 
			{
				File file=new File("F:\\Filling\\GramToKilo.txt");
				file.createNewFile();
				
				FileInputStream th1=new FileInputStream(file);
				PrintStream ob2=new PrintStream(file);

				ob2.println(""+a);
				ob2.println(""+(a/1000));
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
		new FramingSwing09();
	}



}
