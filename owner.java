import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class owner implements ActionListener
{   data d=new data();
	private JFrame own =new JFrame();
	private JFrame busadd=new JFrame();
	private JFrame busremove=new JFrame();
	private JLabel name=new JLabel("Bus name");
	private JLabel from=new JLabel("From");
	private JLabel to=new JLabel("To");
	private JLabel time=new JLabel("Time");
	private JLabel price=new JLabel("Price");
	private JLabel cl=new JLabel("Class");
	private JTextField nam=new JTextField();
	private JTextField fro=new JTextField();
	private JTextField t=new JTextField();
	private Choice buslist=new Choice();
	private Choice hour=new Choice();
	private Choice min=new Choice();
	private Choice tp=new Choice();
	private Choice cls=new Choice();
	private JTextField pric=new JTextField();
	private JButton logout=new JButton("Log out");
	private JButton sellinfo=new JButton("View sell info");
	private JButton add=new JButton("Add");
	private JButton remove=new JButton("Remove");
	private JButton addbus=new JButton("Add Bus");
	private JButton updateprice=new JButton("Update Price");
	private JButton removebus=new JButton("Remove Bus");
	private JButton changepassword=new JButton("Change Password");
	private JButton back=new JButton("Back");
	private JButton backs=new JButton("Back");
	private JButton backss=new JButton("Back");
	
	owner()
	{
		own.setVisible(true);
		own.setLayout(null);
		own.setSize(350,350);
		own.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		own.getContentPane().setBackground(Color.blue);

		busadd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		busadd.getContentPane().setBackground(Color.green);
        busadd.add(backs);
		
		busremove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		busremove.getContentPane().setBackground(Color.red);
		busremove.add(backss);
		backs.addActionListener(this);
		backss.addActionListener(this);
		busadd.setLayout(null);
		busadd.setSize(500,500);
		busremove.setSize(450,300);
		busremove.setLayout(null);
		own.add(addbus);
		own.add(removebus);
		own.add(updateprice);
		own.add(logout);
		own.add(sellinfo);
		own.add(changepassword);
		addbus.setBounds(20,20,150,30);
		removebus.setBounds(20,60,150,30);
		updateprice.setBounds(20,100,150,30);
		changepassword.setBounds(20,140,150,30);
		sellinfo.setBounds(20,180,150,30);
		logout.setBounds(20,220,150,30);
		busadd.add(name);
	
		busadd.add(from);
		busadd.add(to);
		busadd.add(time);
		busadd.add(price);
		busadd.add(add);
		busadd.add(nam);
		busadd.add(fro);
		busadd.add(t);
		busadd.add(hour);
		busadd.add(min);
		busadd.add(tp);
		busadd.add(pric);
		busadd.add(cls);
		busadd.add(cl);
		busremove.add(buslist);
		busremove.add(remove);
		
		buslist.setBounds(20,20,140,30);
		remove.setBounds(170,20,90,30);
		backss.setBounds(280,20,90,30);
		name.setBounds(20,20,100,20);
		backs.setBounds(350,20,90,30);
		
		from.setBounds(20,50,100,20);
		to.setBounds(20,80,100,20);
		time.setBounds(20,110,100,20);
		price.setBounds(20,140,100,20);
		back.setBounds(280,10,100,30);
		nam.setBounds(130,20,100,20);
		fro.setBounds(130,50,100,20);
		t.setBounds(130,80,100,20);
		hour.setBounds(130,110,80,20);
		min.setBounds(220,110,80,20);
		tp.setBounds(310,110,100,20);
		pric.setBounds(130,140,100,20);
		cl.setBounds(20,170,100,20);
		cls.setBounds(130,170,80,20);
		add.setBounds(40,220,100,20);
		remove.addActionListener(this);
		add.addActionListener(this);
		addbus.addActionListener(this);
		removebus.addActionListener(this);
		updateprice.addActionListener(this);
		changepassword.addActionListener(this);
		back.addActionListener(this);
		logout.addActionListener(this);
		sellinfo.addActionListener(this);
	}
	/**
			@overriding actionPerformed() method
	*/ 
			@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==addbus)
		{	own.setVisible(false);
			addingbus();
		}
		else if(e.getSource()==backs)
		{
			busadd.setVisible(false);
			owner o =new owner();
		}
		else if(e.getSource()==backss)
		{
		    busremove.setVisible(false);
			owner o =new owner();
		}
		else if(e.getSource()==add)
		{
			
			String hr = hour.getItem(hour.getSelectedIndex());
		  String mn = min.getItem(min.getSelectedIndex());
		   String ttp = tp.getItem(tp.getSelectedIndex());
		   if(ttp.equals("PM"))
		   {
			   int hor = Integer.parseInt(hr);
			    hor=hor+12;
				hr=Integer.toString(hor);
			   
		   }
		   String clss=cls.getItem(cls.getSelectedIndex());
		   String bname=nam.getText();
		   String fromm=fro.getText();
		   String too=t.getText();
		   String pricee=pric.getText();
		   int pricc=Integer.parseInt(pricee);
		   JOptionPane.showMessageDialog(busadd,bname+" has added");
		   d.addbus(bname,fromm,too,clss,pricc,hr,mn);
		}
		else if(e.getSource()==changepassword)
		{
			own.setVisible(false);
			changepassword c=new changepassword("owner");
			
		}
		else if(e.getSource()==back)
		{
			busadd.setVisible(false);
			own.setVisible(true);
			
		}
		else if(e.getSource()==removebus)
		{
			own.setVisible(false);
			removingbus();
			
		}
		else if(e.getSource()==remove)
		{
			String busname = buslist.getItem(buslist.getSelectedIndex());
			d.removebus(busname);
			buslist.removeAll();
			removingbus();
			
		}
		else if(e.getSource()==updateprice)
		{
			own.setVisible(false);
			updateprc u=new updateprc();
		}
		else if(e.getSource()==logout)
		{
			own.setVisible(false);
			signin s=new signin();
		}
		else if(e.getSource()==sellinfo)
		{
			own.setVisible(false);
			sellinfo s=new sellinfo();
		}
		
	}
	public void removingbus()
	{
		busremove.setVisible(true);
		String[] lst=d.getbuslist();
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to bus list
	*/    
        		
		buslist.add(lst[k]);
			}
		
	}
	public void addingbus()
	{
		busadd.setVisible(true);
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
			cls.add("AC");
			cls.add("Non AC");
		 
		
	}
	
	
}