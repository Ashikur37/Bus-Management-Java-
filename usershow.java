import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class usershow implements ActionListener
{  data d=new data();
	private String username;
	private JFrame us =new JFrame();
	private int cmonth;
	private int not;
	private String cmon;
	private JLabel dat=new JLabel("Date");
	private JLabel mon=new JLabel("Month");
	private Choice date=new Choice();
	private Choice month=new Choice();
	private JButton show=new JButton("Show");
	private Choice bus=new Choice();
	private JButton nticket=new JButton("No of ticket");
	private JLabel noticket=new JLabel("0");
	private JButton back=new JButton("Back");
	private JLabel time=new JLabel("Time");
	private JLabel timee=new JLabel("");
	private JLabel type=new JLabel("class");
	usershow(String uname)
	{
		username=uname;
		us.setVisible(true);
		us.setLayout(null);
		us.setSize(400,400);
		us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		us.getContentPane().setBackground(Color.magenta);
		us.add(dat);
		us.add(mon);
		us.add(date);
		us.add(month);
		us.add(show);
		us.add(bus);
		us.add(nticket);
		us.add(noticket);
		us.add(back);
		us.add(time);
		us.add(timee);
		us.add(type);
		dat.setBounds(20,20,100,20);
		mon.setBounds(20,50,100,20);
		date.setBounds(130,20,100,20);
		month.setBounds(130,50,100,20);
		show.setBounds(20,80,100,20);
		bus.setBounds(130,80,100,20);
		nticket.setBounds(20,110,100,20);
		noticket.setBounds(130,110,100,20);
		back.setBounds(250,20,80,20);
		time.setBounds(20,140,80,20);
		timee.setBounds(120,140,100,20);
		type.setBounds(20,170,150,20);
		
		currentdate c=new currentdate();
		cmonth=c.getmonthint();
		nticket.addActionListener(this);
		back.addActionListener(this);
		show.addActionListener(this);
		for (int i=1; i<32; i++)
		{  
			String s = Integer.toString (i);
			date.add(s);
		}
		if(cmonth==1)
		{
			cmon="january";
			month.add(cmon);
			month.add("february");
		}
		else if (cmonth==2)
		{
			cmon="february";
			month.add(cmon);
			month.add("march");
		}
		else if (cmonth==3)
		{
			cmon="march";
			month.add(cmon);
			month.add("april");
		}
		else if (cmonth==4)
		{
			cmon="april";
			month.add(cmon);
			month.add("may");
		}
		else if (cmonth==5)
		{
			cmon="may";
			month.add(cmon);
			month.add("june");
		}
		else if (cmonth==6)
		{
			cmon="june";
			month.add(cmon);
			month.add("july");
		}
		else if (cmonth==7)
		{
			cmon="july";
			month.add(cmon);
			month.add("august");
		}
		else if (cmonth==8)
		{
			cmon="august";
			month.add(cmon);
			month.add("september");
		}
		else if (cmonth==9)
		{
			cmon="september";
			month.add(cmon);
			month.add("october");
		}
		else if (cmonth==10)
		{
			cmon="october";
			month.add(cmon);
			month.add("november");
		}
		else if (cmonth==11)
		{   cmon="november";
			month.add(cmon);
			month.add("december");
		}
		else if (cmonth==12)
		{
			cmon="december";
			month.add(cmon);
			month.add("january");
		}
		
	}
	/**
			@overriding actionPerformed() method
	    */ 
	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==back)
			{
				us.setVisible(false);
				user u=new user(username);
			}
			else if(e.getSource()==show)
			{    bus.removeAll();
				String monn = month.getItem(month.getSelectedIndex());
				String datt = date.getItem(date.getSelectedIndex());
				int size=d.getuserbuscounter(username,datt,monn);
                String[] lst=new String[size];				
				lst=d.getuserbus(username,datt,monn);
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to bus
	*/    
        		
		bus.add(lst[k]);
			}
			}
			else if(e.getSource()==nticket)
			{  	noticket.setText("");
				String bname=bus.getItem(bus.getSelectedIndex());
				String hour=d.gettime(bname);
				String tp=d.getclass(bname);
				type.setText("Class:  "+tp);
		String min=d.getminute();
		int am=d.getam();
		if(am==0)
		{
			timee.setText(hour+" :"+min+" am");
		}
		else
			timee.setText(hour+" :"+min+" pm");
				String monn = month.getItem(month.getSelectedIndex());
				String datt = date.getItem(date.getSelectedIndex());
				int number=d.getuserticket(username,datt,monn,bname);
				noticket.setText(Integer.toString(number));
			}
			
		}
}