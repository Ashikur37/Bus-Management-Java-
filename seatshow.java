import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
class seatshow implements ActionListener
{   data d=new data();
	private JFrame st=new JFrame();
	private int cmonth;
	private String cmon;
	private JLabel dat=new JLabel("Date");
	private JLabel mon=new JLabel("Month");
	private Choice date=new Choice();
	private Choice month=new Choice();
	private JButton show=new JButton("Show bus");
	private Choice bus=new Choice();
	private JButton plan=new JButton("Show seatplan");
	private JButton back=new JButton("Back");
	seatshow()
	{      st.setVisible(true);
		   st.setLayout(null);
           st.setSize(400,400);	
		   st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   st.getContentPane().setBackground(Color.yellow);
        st.add(dat);
		st.add(mon);
		st.add(date);
		st.add(month);
		st.add(show);
		st.add(bus);
		st.add(plan);
		st.add(back);
		dat.setBounds(20,20,100,20);
		date.setBounds(130,20,100,20);
		mon.setBounds(20,50,100,20);
		month.setBounds(130,50,100,20);
		show.setBounds(20,80,100,20);
		bus.setBounds(130,80,100,20);
		plan.setBounds(20,120,150,20);
		back.setBounds(20,160,80,20);
		show.addActionListener(this);
		plan.addActionListener(this);
		back.addActionListener(this);
		currentdate c=new currentdate();
		cmonth=c.getmonthint();		   
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
				st.setVisible(false);
				sellinfo s=new sellinfo();
				
			}
			else if(e.getSource()==show)
			{
				 bus.removeAll();
				String monn = month.getItem(month.getSelectedIndex());
				String datt = date.getItem(date.getSelectedIndex());
				int size=d.getdatebuscounter(datt,monn);
                String[] lst=new String[size];				
				lst=d.getdatebus(datt,monn);
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to bus
	*/    
        		
		bus.add(lst[k]);
			}
			}
			else if(e.getSource()==plan)
			{
			 st.setVisible(false);
			String monn = month.getItem(month.getSelectedIndex());
				String datt = date.getItem(date.getSelectedIndex());
				String bname = bus.getItem(bus.getSelectedIndex());
				seatname s=new seatname(bname,datt,monn);
			}
		}
}