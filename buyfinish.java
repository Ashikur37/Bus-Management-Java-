import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
class buyfinish implements ActionListener
{   data d=new data();
	private String uname;
	private JFrame bf=new JFrame();
	private JLabel congrats=new JLabel("Congratulation");
	private JLabel dear=new JLabel("");
	private JLabel bname=new JLabel("");
	private JLabel nt=new JLabel("");
	private JLabel blnc=new JLabel("");
	private JLabel det=new JLabel("Deatails:");
	private JLabel dat=new JLabel("");
	private JButton home=new JButton("home");
	private  JLabel time=new JLabel("Time:");
	
	private JLabel cl=new JLabel("");
	private JLabel timee=new JLabel("");
	
	buyfinish(String username,String busname,String date,String month,int number,int balance)
	{   uname=username;
	    bf.setVisible(true);
		bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bf.getContentPane().setBackground(Color.pink);
		bf.setLayout(null);
		bf.setSize(400,400);
		bf.add(congrats);
		bf.add(dear);
		bf.add(bname);
		bf.add(nt);
		bf.add(blnc);
		bf.add(home);
		bf.add(dat);
		bf.add(time);
		bf.add(timee);
		
		bf.add(cl);
		congrats.setBounds(120,20,150,20);
		congrats.setForeground(Color.GREEN);
		dear.setBounds(20,50,300,20);
		det.setBounds(20,80,100,20);
		bname.setBounds(20,110,200,20);
		cl.setBounds(160,110,60,20);
		nt.setBounds(20,140,200,20);
		blnc.setBounds(20,170,200,20);
		dat.setBounds(20,200,200,20);
		time.setBounds(20,230,80,20);
		timee.setBounds(120,230,200,20);
		String type=d.getclass(busname);
		cl.setText("( "+type+" )");
		String hour=d.gettime(busname);
		String min=d.getminute();
		int am=d.getam();
		if(am==0)
		{
			timee.setText(hour+" :"+min+" am");
		}
		else if(am==1)
		{
			timee.setText(hour+" :"+min+" pm");
		}
		home.setBounds(20,260,80,20);
		home.addActionListener(this);
		dear.setText("Dear "+uname+" your  buying  request  is  successed");
		bname.setText("Name  of  bus :  "+busname);
		nt.setText("Number  of  ticket: "+Integer.toString(number));
		blnc.setText("Total  cost :  "+Integer.toString(balance));
		dat.setText("Date :  "+date+" "+month);
		
	}
	/**
			@overriding actionPerformed() method
	    */ 
	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==home)
			{
				bf.setVisible(false);
				user u=new user(uname);
			}
		}

		}
