import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FramingSwing011 implements ActionListener
{
	JFrame win;

	JLabel lbl1;
	JTextField txt1;

	JButton btnSumbit,btnExit,btnBack;
	GridLayout layout; 
	Color color;
	Font lblFont,txtFont,btnFont;

	public FramingSwing011()
	{
		win = new JFrame();
		win.setTitle("Troly Load");

		lblFont = new Font("Forte",Font.PLAIN,18);
		btnFont = new Font("Agency FB",Font.PLAIN,22);
		txtFont = new Font("Times New Romen",Font.BOLD,22);

		lbl1 = new JLabel("Enter Atoms");
		lbl1.setFont(lblFont);
		win.add(lbl1);

		txt1 = new JTextField();
		txt1.setFont(txtFont);
		win.add(txt1);

		btnSumbit = new JButton("Sumbit");
		btnSumbit.setFocusable(false);
		btnSumbit.setFont(btnFont);
		win.add(btnSumbit);

		btnExit = new JButton("Exit");
		btnExit.setFocusable(false);
		btnExit.setFont(btnFont);
		win.add(btnExit);

		btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.setFont(btnFont);
		win.add(btnBack);

		layout = new GridLayout(3,2);
		win.setLayout(layout);

		win.setSize(450,450);
		win.setLocationRelativeTo(null);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		btnSumbit.addActionListener(this);
		btnExit.addActionListener(this);
		btnBack.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(btnSumbit == ae.getSource())
		{
			JOptionPane.showMessageDialog(null,"Thanks");
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
		new FramingSwing011();
	}
}
