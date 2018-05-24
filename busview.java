import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class busview implements ActionListener
{  	data d=new data();
	private String uname;
	private String[] lst=new String[100];
	private String[] buses=new String[100];
	private String busname;
	private JFrame bf =new JFrame();
	private List f=new List(2,false);
	private String frm;
	private String tto;
	private String hr;
	private String mn;
	private String date;
	private String month;
	private int ck=0;
	private String ttp;
	private JCheckBox box = new JCheckBox("Search with time");
	private Choice hour=new Choice();
	private Choice min=new Choice();
	private Choice tp=new Choice();
	private List t=new List(2,false);
	private List s=new List(2,false);
	private JLabel from=new JLabel("From");
	private JLabel to=new JLabel("To");
	private JButton back=new JButton("Back");
	private JButton buyticket=new JButton("Buy Ticket");
	busview(String username)
	{
		uname=username;
		bf.setSize(500,500);
		bf.setVisible(true);
		bf.setLayout(null);
		bf.add(f);
		bf.add(t);
		bf.add(s);
		bf.add(from);
		bf.add(to);
		bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bf.getContentPane().setBackground(Color.yellow);
		bf.add(box);
		bf.add(hour);
		bf.add(min);
		bf.add(tp);
		bf.add(back);
		bf.add(buyticket);
		list();
		from.setBounds(20,20,80,20);
		f.setBounds(20,60,100,150);
		to.setBounds(130,20,80,20);
		back.setBounds(250,20,80,20);
		t.setBounds(130,60,100,150);
		s.setBounds(250,60,150,100);
		box.setBounds(20,225,150,20);
		hour.setBounds(20,260,60,30);
		min.setBounds(90,260,60,30);
		tp.setBounds(160,260,60,30);
		buyticket.setBounds(260,220,100,20);
		buyticket.addActionListener(this);
		back.addActionListener(this);
		f.addActionListener(this);
		t.addActionListener(this);
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{   if(e.getSource()==back)
		{
			bf.setVisible(false);
			user u=new user(uname);
		}
		else if(e.getSource()==buyticket)
		{
			
			bf.setVisible(false);//JFrame of bus list
			int i[];
			i=s.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			busname=s.getItem(i[j]);
		   currentdate c=new currentdate();
		   date=c.getdates();
		   month=c.getmonth();
			buyticket b=new buyticket(uname,busname,date,month);
			
		}
	    
			 else if((e.getSource()==t))
		{
           s.removeAll();		
		int i[];
		
		i=f.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			frm=f.getItem(i[j]);
			i=t.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			tto=t.getItem(i[j]);
		
		lst=d.showb(frm,tto);
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{
			
				s.add(lst[k]);
			
			}
		}
		else if((e.getSource()==f))
		{
           s.removeAll();		
		int i[];
		
		i=f.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			frm=f.getItem(i[j]);
			i=t.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			tto=t.getItem(i[j]);
		
		lst=d.showb(frm,tto);
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{
			
				s.add(lst[k]);
			
			}
		}
		if(box.isSelected())
		{
			if(ck==0)
			{
				
				 hour.add("Hour");
			 min.add("Minute");
			for(int i=0;i<=59;i++)
			{   String s=Integer.toString(i);
				min.add(s);
				if(i<13&&i>0)
					hour.add(s);
			}
			tp.add("AM");
			tp.add("PM");
			}
			ck++;
         
		 {
			 s.removeAll();		
		int i[];
		int ii;
		i=f.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			frm=f.getItem(i[j]);
			i=t.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			tto=t.getItem(i[j]);
		
		   hr = hour.getItem(hour.getSelectedIndex());
		   mn = min.getItem(min.getSelectedIndex());
		    ttp = tp.getItem(tp.getSelectedIndex());
		   if(ttp.equals("PM"))
		   {
			   int hor = Integer.parseInt(hr);
			    hor=hor+12;
				hr=Integer.toString(hor);
			   
		   }
           
		
		
		
		
		
		
		
		lst=d.showbt(frm,tto,hr,mn);
		
		
		
		
		
		
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{
			
				s.add(lst[k]);
			
			}
			 
			 
			 
			 
		 }

			
		}
		else
		{hour.removeAll();
			min.removeAll();
			tp.removeAll();
           ck=0;
			
			
		}
		
	}
	void list()
	{
		
		lst=d.showf();
			int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				
				f.add(lst[k]);
			}
			lst=d.showt();
			int szz=lst.length;
			for(int k=0;k<szz;k++)
			{
				t.add(lst[k]);
			}
		
		
		
	}
	
	
	
	
}