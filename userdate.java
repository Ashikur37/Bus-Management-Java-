import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class userdate implements ActionListener
{   private int cdate;//
	private int ud;
	private int cmonth;
	private int dte;
	private String username;
	private String busname;
	private String mon;//to return user choices month
	private String cmon;
	private String dat;////to return user choices date
	private JFrame dt=new JFrame();
	private Choice month=new Choice();
	private Choice date=new Choice();
	private JButton choose=new JButton("Choose");
	int mg;//,MONTH greater or equal than current month
	private String cm;
	private String cd;
	userdate(String uname,String bname)
	{   username=uname;
		busname=bname;
		dt.setVisible(true);
		dt.setLayout(null);
		dt.setSize(400,400);
		dt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dt.getContentPane().setBackground(Color.orange);
		dt.add(month);
		dt.add(date);
		dt.add(choose);
		date.setBounds(20,30,100,30);
		month.setBounds(140,30,100,30);
		choose.setBounds(260,30,100,30);
		
		currentdate c=new currentdate();
		cdate=c.getdate();
		cmonth=c.getmonthint();
		month.add("Month");
		date.add("Date");

		
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
		for (int i=1; i<32; i++)
		{  
			String s = Integer.toString (i);
			date.add(s);
		}
		
		choose.addActionListener(this);
	}
	@Override
		public void actionPerformed(ActionEvent e)
		{
		if(e.getSource()==choose)
		{mon = month.getItem(month.getSelectedIndex());
	     dat = date.getItem(date.getSelectedIndex());
		 
		 int flag=0;
		 
		 if(mon.equals(cmon))
		 {
			 dte= Integer.parseInt(dat);
			 
			 
				if(dte<cdate)
				{
					JOptionPane.showMessageDialog(dt,"The date you have choosen is expired");
					flag=1;
				}
				
		 }
		 if(flag==0)
		 {  dt.setVisible(false);
			buyticket bt=new buyticket(username,busname,dat,mon); 
		 }
			 
		 
			
		}
		}
} 