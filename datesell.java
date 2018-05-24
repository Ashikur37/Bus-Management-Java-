import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class datesell implements ActionListener
{    data d=new data();
	private JFrame ds=new JFrame();
	private int cmonth;
	private int not;
	private int ts;
	private String cmon;
	private JLabel dat=new JLabel("Date");
	private JLabel mon=new JLabel("Month");
	private Choice date=new Choice();
	private Choice month=new Choice();
	private JButton show=new JButton("Show");
	private JButton back=new JButton("Back");
	private JLabel nticket=new JLabel("No of ticket");
    private JLabel noticket=new JLabel("0");
	private JLabel total=new JLabel("Total sold ");
    private JLabel soldt=new JLabel("0");
	datesell()
	{
		ds.setVisible(true);
		ds.setLayout(null);
		ds.setSize(400,400);
		ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ds.getContentPane().setBackground(Color.green);
		ds.add(dat);
		ds.add(mon);
		ds.add(date);
		ds.add(month);
		ds.add(show);
		ds.add(back);
		ds.add(nticket);
		ds.add(noticket);
		ds.add(total);
		ds.add(soldt);
		dat.setBounds(20,20,100,20);
		mon.setBounds(20,50,100,20);
		date.setBounds(140,20,100,20);
		month.setBounds(140,50,100,20);
		show.setBounds(20,80,100,20);
		nticket.setBounds(20,110,120,20);
		total.setBounds(20,140,120,20);
		noticket.setBounds(150,110,80,20);
		soldt.setBounds(150,140,80,20);
		back.setBounds(300,20,80,20);
		currentdate c=new currentdate();
		cmonth=c.getmonthint();
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
				ds.setVisible(false);
				sellinfo s=new sellinfo();
			}
			else if(e.getSource()==show)
			{   
				String mon = month.getItem(month.getSelectedIndex());
				String dat = date.getItem(date.getSelectedIndex());
				String x=d.getticket(dat,mon);
				String y=d.getamount(dat,mon);
				noticket.setText(x);
				soldt.setText(y);
				x="0";
				y="0";
			}
			
			
		}
}