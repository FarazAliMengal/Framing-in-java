import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class FramingSwing05 implements ActionListener
{

	JFrame win;
	JButton btnAdd,btnSub,btnKiloToGram,btnGramToKilo,btnMarksheet,btnTrollyLoad,btnExit,btnAboutus;

	Font btnFont;
	GridLayout layout;

	public FramingSwing05() 
	{
		win = new JFrame();
		win.setTitle("Menu");

		btnFont = new Font("Times New Roman",Font.BOLD,22);

		btnAdd = new JButton("Add");
		btnAdd.setFocusable(false);
		btnAdd.setFont(btnFont);
		win.add(btnAdd);

		btnSub = new JButton("Sub");
		btnSub.setFocusable(false);
		btnSub.setFont(btnFont);
		win.add(btnSub);

		btnKiloToGram = new JButton("Kilo To Gram");
		btnKiloToGram.setFocusable(false);
		btnKiloToGram.setFont(btnFont);
		win.add(btnKiloToGram);

		btnGramToKilo = new JButton("Gram To Kilo");
		btnGramToKilo.setFocusable(false);
		btnGramToKilo.setFont(btnFont);
		win.add(btnGramToKilo);

		btnMarksheet = new JButton("Marksheet");
		btnMarksheet.setFocusable(false);
		btnMarksheet.setFont(btnFont);
		win.add(btnMarksheet);

		btnTrollyLoad = new JButton("Trolly Load");
		btnTrollyLoad.setFocusable(false);
		btnTrollyLoad.setFont(btnFont);
		win.add(btnTrollyLoad);

		btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.setFont(btnFont);
		win.add(btnExit);

		layout = new GridLayout(7,2);
		win.setLayout(layout);

		win.setSize(450,450);
		win.setLocationRelativeTo(null);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		btnAdd.addActionListener(this);
		btnSub.addActionListener(this);
		btnKiloToGram.addActionListener(this);
		btnGramToKilo.addActionListener(this);
		btnMarksheet.addActionListener(this);
		btnTrollyLoad.addActionListener(this);
		btnExit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(btnAdd == ae.getSource())
			{
				FramingSwing06 ob1 = new FramingSwing06();
				win.hide();
			}

			if(btnSub == ae.getSource())
		{
			FramingSwing07 ob1 = new FramingSwing07();
			win.hide();
		}	
 
		if(btnKiloToGram  ==  ae.getSource())
		{
			FramingSwing08 ob1 = new FramingSwing08();
			win.hide();
		}

		if(btnGramToKilo == ae.getSource())
		{
			FramingSwing09 ob1 = new FramingSwing09();
			win.hide();
		}

		if(btnMarksheet == ae.getSource())
		{
			FramingSwing010 ob1 = new FramingSwing010();
			win.hide();
		}

		if(btnTrollyLoad == ae.getSource())
		{
			FramingSwing011 ob1 = new FramingSwing011();
			win.hide();
		}

		if(btnExit == ae.getSource())
		{
			System.exit(0);
		}
	}



	public static void main(String[] args) 
	{
		new FramingSwing05();
	}

}

