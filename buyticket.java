import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
class buyticket implements ActionListener
{   data d=new data();
	private String username;
    private String busname;
	private String date;
	private String month;
	private int balance=0;
	private int price;
	private int chk=0;
	private int number=0;
	private int a1s,a2s,a3s,a4s,b1s,b2s,b3s,b4s,c1s,c2s,c3s,c4s,d1s,d2s,d3s,d4s,e1s,e2s,e3s,e4s,e5s;
	private JFrame bticket=new JFrame();
	private JButton a1=new JButton("A1");
	private JLabel showbalance=new JLabel("Current balance:");
	private JLabel blnc=new JLabel("0");
	private JButton grn=new JButton("");
	private JButton rd=new JButton("");
	private JButton bl=new JButton("");
	private JLabel grns=new JLabel("- - > Available");
	private JLabel rds=new JLabel("- - > Reserved");
	private JLabel bls=new JLabel("- - > Selected");

	private JLabel ntckt=new JLabel("Number of Ticket: ");
	private JLabel nt=new JLabel("0");
	private JButton a2=new JButton("A2");
	private JButton a3=new JButton("A3");
	private JButton a4=new JButton("A4");
	private JButton b1=new JButton("B1");
	private JButton b2=new JButton("B2");
	private JButton b3=new JButton("B3");
	private JButton b4=new JButton("B4");
	private JButton c1=new JButton("C1");
	private JButton c2=new JButton("C2");
	private JButton c3=new JButton("C3");
	private JButton c4=new JButton("C4");
	private JButton d1=new JButton("D1");
	private JButton d2=new JButton("D2");
	private JButton d3=new JButton("D3");
	private JButton d4=new JButton("D4");
	private JButton e1=new JButton("E1");
	private JButton e2=new JButton("E2");
	private JButton e3=new JButton("E3");
	private JButton e4=new JButton("E4");
	private JButton e5=new JButton("E5");
    private JButton another=new JButton("Ticket for different day");
	private JButton buy=new JButton("Buy");
	private JButton back=new JButton("Back");
	buyticket(String uname,String bname,String dt,String mo)
	{ date=dt;
	  month=mo;
	username=uname;
	busname=bname;
	bticket.setVisible(true);
	bticket.setLayout(null);
	bticket.setSize(750,600);
    bticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	bticket.getContentPane().setBackground(Color.lightGray);
	bticket.add(a1);
	bticket.add(a2);
	bticket.add(a3);
	bticket.add(a4);
	bticket.add(b1);
	bticket.add(b2);
	bticket.add(b3);
	bticket.add(b4);
	bticket.add(c1);
	bticket.add(c2);
	bticket.add(c3);
	bticket.add(c4);
	bticket.add(d1);
	bticket.add(d2);
	bticket.add(d3);
	bticket.add(d4);
	bticket.add(e1);
	bticket.add(e2);
	bticket.add(e3);
	bticket.add(e4);
	bticket.add(e5);
	bticket.add(buy);
	bticket.add(back);
	bticket.add(another);
	bticket.add(ntckt);
	bticket.add(bls);
	bticket.add(nt);
	bticket.add(showbalance);
	bticket.add(blnc);
	bticket.add(grn);
	bticket.add(grns);
	bticket.add(rd);
	bticket.add(rds);

	ntckt.setBounds(490,20,150,20);
	showbalance.setBounds(490,60,150,20);
	nt.setBounds(650,20,70,20);
	blnc.setBounds(650,60,70,20);
	grn.setBounds(100,310,20,20);
	rd.setBounds(100,340,20,20);
	bl.setBounds(100,370,20,20);
	grns.setBounds(130,310,150,20);
	rds.setBounds(130,340,150,20);
	bls.setBounds(130,370,150,20);
	grn.setBackground(Color.GREEN);
	rd.setBackground(Color.RED);
	bl.setBackground(Color.BLUE);
	bticket.add(bl);
	price=d.getprice(busname);
	a1.setBounds(20,20,90,30);
	a2.setBounds(110,20,90,30);
	a3.setBounds(290,20,90,30);
	a4.setBounds(380,20,90,30);
	b1.setBounds(20,50,90,30);
	b2.setBounds(110,50,90,30);
	b3.setBounds(290,50,90,30);
	b4.setBounds(380,50,90,30);
	c1.setBounds(20,80,90,30);
	c2.setBounds(110,80,90,30);
	c3.setBounds(290,80,90,30);
	c4.setBounds(380,80,90,30);
	d1.setBounds(20,110,90,30);
	d2.setBounds(110,110,90,30);
	d3.setBounds(290,110,90,30);
	d4.setBounds(380,110,90,30);
	e1.setBounds(20,140,90,30);
	e2.setBounds(110,140,90,30);
	e3.setBounds(200,140,90,30);
	e4.setBounds(290,140,90,30);
	e5.setBounds(380,140,90,30);
	buy.setBounds(385,200,100,30);
	another.setBounds(90,250,180,30);
	back.setBounds(385,250,100,30);
	another.addActionListener(this);
	a1.addActionListener(this);
	a2.addActionListener(this);
	a3.addActionListener(this);
	a4.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	c1.addActionListener(this);
	c2.addActionListener(this);
	c3.addActionListener(this);
	c4.addActionListener(this);
	d1.addActionListener(this);
	d2.addActionListener(this);
	d3.addActionListener(this);
	d4.addActionListener(this);
	e1.addActionListener(this);
	e2.addActionListener(this);
	e3.addActionListener(this);
	e4.addActionListener(this);
	e5.addActionListener(this);
	buy.addActionListener(this);
	back.addActionListener(this);
	seatplan();
	
	}
	public void seatplan()
	{
		d.setstatus(busname,date,month);
		a1s=d.geta1status();
		a2s=d.geta2status();
		a3s=d.geta3status();
		a4s=d.geta4status();
		b1s=d.getb1status();
		b2s=d.getb2status();
		b3s=d.getb3status();
		b4s=d.getb4status();
		c1s=d.getc1status();
		c2s=d.getc2status();
		c3s=d.getc3status();
		c4s=d.getc4status();
		d1s=d.getd1status();
		d2s=d.getd2status();
		d3s=d.getd3status();
		d4s=d.getd4status();
		e1s=d.gete1status();
		e2s=d.gete2status();
		e3s=d.gete3status();
		e4s=d.gete4status();
		e5s=d.gete5status();
		seatcheck();
	}
	public void seatcheck()
	{   
			 
		
		if(a1s==1)
		{
		 a1.setBackground(Color.RED);	
		}
		else if(a1s==0)
		{
			a1.setBackground(Color.GREEN);
		}
		else
		{
			a1.setBackground(Color.BLUE);
		}
		if(a2s==1)
		{
			a2.setBackground(Color.RED);
		}
		else if(a2s==0)
		{
			a2.setBackground(Color.GREEN);
		}
		else
		{
			a2.setBackground(Color.BLUE);
		}
		if(a3s==1)
		{
			a3.setBackground(Color.RED);
		}
		else if(a3s==0)
		{
			a3.setBackground(Color.GREEN);
		}
		else
		{
			a3.setBackground(Color.BLUE);
		}
		if(a4s==1)
		{
			a4.setBackground(Color.RED);
		}
		else if(a4s==0)
		{
			a4.setBackground(Color.GREEN);
		}
		else
		{
			a4.setBackground(Color.BLUE);
		}
		if(b1s==1)
		{
			b1.setBackground(Color.RED);
		}
		else if(b1s==0)
		{
			b1.setBackground(Color.GREEN);
		}
		else
		{
			b1.setBackground(Color.BLUE);
		}
		if(b2s==1)
		{
			b2.setBackground(Color.RED);
		}
		else if(b2s==0)
		{
			b2.setBackground(Color.GREEN);
		}
		else
		{
			b2.setBackground(Color.BLUE);
		}
		if(b3s==1)
		{
			b3.setBackground(Color.RED);
		}
		else if(b3s==0)
		{
			b3.setBackground(Color.GREEN);
		}
		else
		{
			b3.setBackground(Color.BLUE);
		}
		if(b4s==1)
		{
			b4.setBackground(Color.RED);
		}
		else if(b4s==0)
		{
			b4.setBackground(Color.GREEN);
		}
		else
		{
			b4.setBackground(Color.BLUE);
		}
		if(c1s==1)
		{
			c1.setBackground(Color.RED);
		}
		else if(c1s==0)
		{
			c1.setBackground(Color.GREEN);
		}
		else
		{
			c1.setBackground(Color.BLUE);
		}
		if(c2s==1)
		{
			c2.setBackground(Color.RED);
		}
		else if(c2s==0)
		{
			c2.setBackground(Color.GREEN);
		}
		else
		{
			c2.setBackground(Color.BLUE);
		}
		if(c3s==1)
		{
			c3.setBackground(Color.RED);
		}
		else if(c3s==0)
		{
			c3.setBackground(Color.GREEN);
		}
		else
		{
			c3.setBackground(Color.BLUE);
		}
		if(c4s==1)
		{
			c4.setBackground(Color.RED);
		}
		else if(c4s==0)
		{
			c4.setBackground(Color.GREEN);
		}
		else
		{
			c4.setBackground(Color.BLUE);
		}
		if(d1s==1)
		{
			d1.setBackground(Color.RED);
		}
		else if(d1s==0)
		{
			d1.setBackground(Color.GREEN);
		}
		else
		{
			d1.setBackground(Color.BLUE);
		}
		if(d2s==1)
		{
			d2.setBackground(Color.RED);
		}
		else if(d2s==0)
		{
			d2.setBackground(Color.GREEN);
		}
		else
		{
			d2.setBackground(Color.BLUE);
		}
		if(d3s==1)
		{
			d3.setBackground(Color.RED);
		}
		else if(d3s==0)
		{
			d3.setBackground(Color.GREEN);
		}
		else
		{
			d3.setBackground(Color.BLUE);
		}
		if(d4s==1)
		{
			d4.setBackground(Color.RED);
		}
		else if(d4s==0)
		{
			d4.setBackground(Color.GREEN);
		}
		else
		{
			d4.setBackground(Color.BLUE);
		}
		if(e1s==1)
		{
			e1.setBackground(Color.RED);
		}
		else if(e1s==0)
		{
			e1.setBackground(Color.GREEN);
		}
		else
		{
			e1.setBackground(Color.BLUE);
		}
		if(e2s==1)
		{
			e2.setBackground(Color.RED);
		}
		else if(e2s==0)
		{
			e2.setBackground(Color.GREEN);
		}
		else
		{
			e2.setBackground(Color.BLUE);
		}
		if(e3s==1)
		{
			e3.setBackground(Color.RED);
		}
		else if(e3s==0)
		{
			e3.setBackground(Color.GREEN);
		}
		else
		{
			e3.setBackground(Color.BLUE);
		}
		if(e4s==1)
		{
			e4.setBackground(Color.RED);
		}
		else if(e4s==0)
		{
			e4.setBackground(Color.GREEN);
		}
		else
		{
			e4.setBackground(Color.BLUE);
		}
		if(e5s==1)
		{
			e5.setBackground(Color.RED);
		}
		else if(e5s==0)
		{
			e5.setBackground(Color.GREEN);
		}
		else 
		{
			e5.setBackground(Color.BLUE);
		}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
			bticket.setVisible(false);
			busview b=new busview(username);
		}
		else if(e.getSource()==another)
		{
			bticket.setVisible(false);
			userdate u=new userdate(username,busname);
		}
		else if(e.getSource()==buy)
		{
			
			if(number>0)
			{
				int ck=d.seatinfo(busname,date,month);
			
			
			d.insertbus(busname,date,month,number);
			d.insertsellinfo(date,month,number,balance);
			d.insertusert(username,busname,date,month,number);
			bticket.setVisible(false);
			buyfinish  b=new buyfinish(username,busname,date,month,number,balance);
			if(ck==0)
			{
				d.insertseatinfo(busname,date,month);
			}
			
			if(a1s==2)
			{
				d.inserta1(busname,date,month,username);
			}
			if(a2s==2)
			{
				d.inserta2(busname,date,month,username);
			}
			if(a3s==2)
			{
				d.inserta3(busname,date,month,username);
			}
			if(a4s==2)
			{
				d.inserta4(busname,date,month,username);
			}
			if(b1s==2)
			{
				d.insertb1(busname,date,month,username);
			}
			if(b2s==2)
			{
				d.insertb2(busname,date,month,username);
			}
			if(b3s==2)
			{
				d.insertb3(busname,date,month,username);
			}
			if(b4s==2)
			{
				d.insertb4(busname,date,month,username);
			}
			if(c1s==2)
			{
				d.insertc1(busname,date,month,username);
			}
			if(c2s==2)
			{
				d.insertc2(busname,date,month,username);
			}
			if(c3s==2)
			{
				d.insertc3(busname,date,month,username);
			}
			if(c4s==2)
			{
				d.insertc4(busname,date,month,username);
			}
			if(d1s==2)
			{
				d.insertd1(busname,date,month,username);
			}
			if(d2s==2)
			{
				d.insertd2(busname,date,month,username);
			}
			if(d3s==2)
			{
				d.insertd3(busname,date,month,username);
			}
			if(d4s==2)
			{
				d.insertd4(busname,date,month,username);
			}
			if(e1s==2)
			{
				d.inserte1(busname,date,month,username);
			}
			if(e2s==2)
			{
				d.inserte2(busname,date,month,username);
			}
			if(e3s==2)
			{
				d.inserte3(busname,date,month,username);
			}
			if(e4s==2)
			{
				d.inserte4(busname,date,month,username);
			}
			if(e5s==2)
			{
				d.inserte5(busname,date,month,username);
			}
			}
			else
				JOptionPane.showMessageDialog(bticket,"Choose seat");
			
		}
		else if(e.getSource()==a1)
		{
			if(a1s==1)
			{
				JOptionPane.showMessageDialog(bticket,"a1 is not available");
			}
			else if(a1s==0)
			{
				a1s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(a1s==2)
			{
				a1s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"a1 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==a2)
		{
			if(a2s==1)
			{
				JOptionPane.showMessageDialog(bticket,"a2 is not available");
			}
			else if(a2s==0)
			{
				a2s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(a2s==2)
			{
				a2s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"a2 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==a3)
		{
			if(a3s==1)
			{
				JOptionPane.showMessageDialog(bticket,"a3 is not available");
			}
			else if(a3s==0)
			{
				a3s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(a3s==2)
			{
				a3s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"a3 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==a4)
		{
			if(a4s==1)
			{
				JOptionPane.showMessageDialog(bticket,"a4 is not available");
			}
			else if(a4s==0)
			{
				a4s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(a4s==2)
			{
				a4s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"a4 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==b1)
		{
			if(b1s==1)
			{
				JOptionPane.showMessageDialog(bticket,"b1 is not available");
			}
			else if(b1s==0)
			{
				b1s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(b1s==2)
			{
				b1s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"b1 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==b2)
		{
			if(b2s==1)
			{
				JOptionPane.showMessageDialog(bticket,"b2 is not available");
			}
			else if(b2s==0)
			{
				b2s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(b2s==2)
			{
				b2s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"b2 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==b3)
		{
			if(b3s==1)
			{
				JOptionPane.showMessageDialog(bticket,"b3 is not available");
			}
			else if(b3s==0)
			{
				b3s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(b3s==2)
			{
				b3s=0;balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"b3 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==b4)
		{
			if(b4s==1)
			{
				JOptionPane.showMessageDialog(bticket,"b4 is not available");
			}
			else if(b4s==0)
			{
				b4s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(b4s==2)
			{
				b4s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"b4 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==c1)
		{
			if(c1s==1)
			{
				JOptionPane.showMessageDialog(bticket,"c1 is not available");
			}
			else if(c1s==0)
			{
				c1s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(c1s==2)
			{
				c1s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"c1 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==c2)
		{
			if(c2s==1)
			{
				JOptionPane.showMessageDialog(bticket,"c2 is not available");
			}
			else if(c2s==0)
			{
				c2s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(c2s==2)
			{
				c2s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"c2 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==c3)
		{
			if(c3s==1)
			{
				JOptionPane.showMessageDialog(bticket,"c3 is not available");
			}
			else if(c3s==0)
			{
				c3s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(c3s==2)
			{
				c3s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"c3 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==c4)
		{
			if(c4s==1)
			{
				JOptionPane.showMessageDialog(bticket,"c4 is not available");
			}
			else if(c4s==0)
			{
				c4s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(c4s==2)
			{
				c4s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"c4 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==d1)
		{
			if(d1s==1)
			{
				JOptionPane.showMessageDialog(bticket,"d1 is not available");
			}
			else if(d1s==0)
			{
				d1s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(d1s==2)
			{
				d1s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"d1 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==d2)
		{
			if(d2s==1)
			{
				JOptionPane.showMessageDialog(bticket,"d2 is not available");
			}
			else if(d2s==0)
			{
				d2s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(d2s==2)
			{
				d2s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"d2 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==d3)
		{
			if(d3s==1)
			{
				JOptionPane.showMessageDialog(bticket,"d3 is not available");
			}
			else if(d3s==0)
			{
				d3s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(d3s==2)
			{
				d3s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"d3 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==d4)
		{
			if(d4s==1)
			{
				JOptionPane.showMessageDialog(bticket,"d4 is not available");
			}
			else if(d4s==0)
			{
				d4s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(d4s==2)
			{
				d4s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"d4 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==e1)
		{
			if(e1s==1)
			{
				JOptionPane.showMessageDialog(bticket,"e1 is not available");
			}
			else if(e1s==0)
			{
				e1s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(e1s==2)
			{
				e1s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"e1 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==e2)
		{
			if(e2s==1)
			{
				JOptionPane.showMessageDialog(bticket,"e2 is not available");
			}
			else if(e2s==0)
			{
				e2s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
				
			}
			else if(e2s==2)
			{
				e2s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"e2 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==e3)
		{
			if(e3s==1)
			{
				JOptionPane.showMessageDialog(bticket,"e3 is not available");
			}
			else if(e3s==0)
			{
				e3s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(e3s==2)
			{
				e3s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"e3 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==e4)
		{
			if(e4s==1)
			{
				JOptionPane.showMessageDialog(bticket,"e4 is not available");
			}
			else if(e4s==0)
			{
				e4s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(e4s==2)
			{
				e4s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"e4 is unselected");
				seatcheck();
			}
		}
		else if(e.getSource()==e5)
		{
			if(e5s==1)
			{
				JOptionPane.showMessageDialog(bticket,"e5 is not available");
			}
			else if(e5s==0)
			{
				e5s=2;
				balance=balance+price;
				number++;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				seatcheck();
				
			}
			else if(e5s==2)
			{
				e5s=0;
				balance=balance-price;
				number--;
				nt.setText(Integer.toString(number));
				blnc.setText(Integer.toString(balance));
				JOptionPane.showMessageDialog(bticket,"e5 is unselected");
				seatcheck();
			}
		}
	}
	
	
	
	
}