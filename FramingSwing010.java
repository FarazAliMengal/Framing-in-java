import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileInputStream;

class FramingSwing010 implements ActionListener
{
	JFrame win,win2;
	JLabel lblName,lblFather,lbldep,lblRoll,lblJava,lblPhp,lblCss;
	JLabel lblName1,lblFather1,lbldep1,lblRoll1,lblJava1,lblPhp1,lblCss1,lblTotal,lblObtain,lbl1;

	JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
	JTextField txt11,txt22,txt33,txt44,txt55,txt66,txt77,txt88,txt99;
	JButton btnSumbit,btnExit,btnBack;
	JButton btnBack1,btnExit1;

	GridLayout layout,layout1;
	Color color;
	Font lblFont,btnFont,txtFont;

	public FramingSwing010()
	{
		win = new JFrame();
		win.setTitle("Marksheet");

		lblFont = new Font("Forte",Font.PLAIN,18);
		btnFont = new Font("Agency FB",Font.PLAIN,22);
		txtFont = new Font("Times New Roman",Font.PLAIN,22);

		lblName = new JLabel("Enter Your Name");
		lblName.setFont(lblFont);
		win.add(lblName);

		txt1 = new JTextField();
		txt1.setFont(txtFont);
		win.add(txt1);

		lblFather = new JLabel("Enter Father Name");
		lblFather.setFont(lblFont);
		win.add(lblFather);

		txt2 = new JTextField();
		txt2.setFont(txtFont);
		win.add(txt2);

		lbldep = new JLabel("Enter DepartMent");
		lbldep.setFont(lblFont);
		win.add(lbldep);

		txt3 = new JTextField();
		txt3.setFont(txtFont);
		win.add(txt3);

		lblRoll = new JLabel("Enter Your Roll No");
		lblRoll.setFont(lblFont);
		win.add(lblRoll);

		txt4 = new JTextField();
		txt4.setFont(txtFont);
		win.add(txt4);

		lblJava = new JLabel("Enter Java Marks :");
		lblJava.setFont(lblFont);
		win.add(lblJava);

		txt5 = new JTextField();
		txt5.setFont(txtFont);
		win.add(txt5);

		lblPhp = new JLabel("Enter Php Marks");
		lblPhp.setFont(lblFont);
		win.add(lblPhp);

		txt6 = new JTextField();
		txt6.setFont(txtFont);
		win.add(txt6);

		lblCss = new JLabel("Enter Css Marks");
		lblCss.setFont(lblFont);
		win.add(lblCss);

		txt7 = new JTextField();
		txt7.setFont(txtFont);
		win.add(txt7);

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

		layout = new GridLayout(9,2);
		win.setLayout(layout);

		win.setSize(500,500);
		win.setLocationRelativeTo(null);
		win.setResizable(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

		btnSumbit.addActionListener(this);
		btnExit.addActionListener(this);
		btnBack.addActionListener(this);
		
	}


		public void result()
		{
			win2 = new JFrame();

					lblName1 = new JLabel("Name");
					lblName1.setFont(lblFont);
					win2.add(lblName1);
 
					txt11 = new JTextField();
					txt11.setEditable(false);
					txt11.setFont(txtFont);
					win2.add(txt11);
					

					lblFather1 = new JLabel("Father Name ");
					lblFather1.setFont(lblFont);
					win2.add(lblFather1);

					txt22 = new JTextField();
					txt22.setEditable(false);
					txt22.setFont(txtFont);
					win2.add(txt22);

					lbldep1 = new JLabel("DepartMent");
					lbldep1.setFont(lblFont);
					win2.add(lbldep1);

					txt33 = new JTextField();
					txt33.setEditable(false);
					txt33.setFont(txtFont);
					win2.add(txt33);

					lblRoll1 = new JLabel("Roll No");
					lblRoll1.setFont(lblFont);
					win2.add(lblRoll1);

					txt44 = new JTextField();
					txt44.setEditable(false);
					txt44.setFont(txtFont);
					win2.add(txt44);

					lblJava1 = new JLabel("Java Marks");
					lblJava1.setFont(lblFont);
					win2.add(lblJava1);

					txt55 = new JTextField();
					txt55.setEditable(false);
					txt55.setFont(txtFont);
					win2.add(txt55);

					lblPhp1 = new JLabel("Php Marks ");
					lblPhp1.setFont(lblFont);
					win2.add(lblPhp1);

					txt66 = new JTextField();
					txt66.setEditable(false);
					txt66.setFont(txtFont);
					win2.add(txt66);

					lblCss1 = new JLabel("Css Marks ");
					lblCss1.setFont(lblFont);
					win2.add(lblCss1);

					txt77 = new JTextField();
					txt77.setEditable(false);
					txt77.setFont(txtFont);
					win2.add(txt77);

					lblTotal = new JLabel("Total Marks");
					lblTotal.setFont(lblFont);
					win2.add(lblTotal);

					txt88 = new JTextField();
					txt88.setEditable(false);
					txt88.setFont(txtFont);
					win2.add(txt88);

					lblObtain = new JLabel("Obtain Marks ");
					lblObtain.setFont(lblFont);
					win2.add(lblObtain);

					txt99 = new JTextField();
					txt99.setEditable(false);
					txt99.setFont(txtFont);
					win2.add(txt99);

					btnBack1 = new JButton("Back");
					btnBack1.setFocusable(false);
					btnBack1.setFont(btnFont);
					win2.add(btnBack1);

					btnExit1 = new JButton("Exit");
					btnExit1.setFocusable(false);
					btnExit1.setFont(btnFont);
					win2.add(btnExit1);

					layout1 = new GridLayout(10,2);
					win2.setLayout(layout1);

					btnExit1.addActionListener(this);
					btnBack1.addActionListener(this);

					win2.setSize(450,450);
					win2.setLocationRelativeTo(null);
					win2.setResizable(false);
					win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					win2.setVisible(true);
					win2.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae)
		{
			if(btnSumbit == ae.getSource())
			{	
				String name = txt1.getText();
				String fname = txt2.getText();
				String dept = txt3.getText();
				String roll=txt4.getText();
				String v1 = txt5.getText();
				String v2 = txt6.getText();
				String v3 = txt7.getText();

				int a = Integer.parseInt(v1);
				int b = Integer.parseInt(v2);
				int c = Integer.parseInt(v3);

				int total=300;
				int obtaine = (a + b + c);

				result();


				txt11.setText(""+name);
				txt22.setText(""+fname);
				txt33.setText(""+dept);
				txt44.setText(""+roll);
				txt55.setText(""+a);
				txt66.setText(""+b);
				txt77.setText(""+c);
				txt88.setText(""+total);
				txt99.setText(""+obtaine);
			
			
				//JOptionPane.showMessageDialog(null,"\n_______________________\nName :"+txt1.getText() + "\n_______________________\nFather Name :"+txt2.getText()+"\n_______________________\nDepartMent :"+txt3.getText()+"\n_______________________\nRoll No :"+txt4.getText()+"\n_______________________\nJava Marks :"+a+"\n_______________________\nPhp Marks :"+b+"\n_______________________\nCss Marks :"+c +"\n_______________________\nTotal Marks :"+total +"\n_______________________\nObtained Marks :"+obtaine);

				

					
				try 
				{
					File file=new File("F:\\Filling\\Marksheet.txt");
					file.createNewFile();
				
					FileInputStream th1=new FileInputStream(file);
					PrintStream ob2=new PrintStream(file);
 
					ob2.println(""+txt1.getText());
					ob2.println(""+txt2.getText());
					ob2.println(""+txt3.getText());
					ob2.println(""+txt4.getText());
					ob2.println(""+a);
					ob2.println(""+b);
					ob2.println(""+c);
					ob2.println(""+total);
					ob2.println(""+obtaine);
				}

				catch(Exception e)
				{
					System.out.print(e);
				}

				win.hide();	
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

			if(btnBack1 == ae.getSource())
			{
				FramingSwing05 ob = new FramingSwing05();
				win.hide();
			}

			if(btnExit1 == ae.getSource())
			{
				System.exit(0);
			}
		}

	public static void main(String[] args) 
	{
		new FramingSwing010(); 
	}
}

