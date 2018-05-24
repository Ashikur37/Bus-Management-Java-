import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class seatname implements ActionListener
{  
     data d = new data ();
	private JFrame sn=new JFrame();
	private JLabel a1=new JLabel("");
	private JLabel a2=new JLabel("");
	private JLabel a3=new JLabel("");
	private JLabel a4=new JLabel("");
	private JLabel b1=new JLabel("");
	private JLabel b2=new JLabel("");
    private JLabel b3=new JLabel("");
    private JLabel b4=new JLabel("");
    private JLabel c1=new JLabel("");
    private JLabel c2=new JLabel("");
    private JLabel c3=new JLabel("");	
    private JLabel c4=new JLabel("");
	private JLabel d1=new JLabel("");
	private JLabel d2=new JLabel("");
	private JLabel d3=new JLabel("");
	private JLabel d4=new JLabel("");
	private JLabel e1=new JLabel("");
	private JLabel e2=new JLabel("");
	private JLabel e3=new JLabel("");
	private JLabel e4=new JLabel("");
	JLabel percent =new JLabel(" ");
	private JLabel e5=new JLabel("");
	private JButton back = new JButton ("Back");
	private JButton home = new JButton ("Home");
	seatname(String bname,String date,String month)
	{
		sn.setVisible(true);
		sn.setLayout(null);
		sn.setSize(650,600);
		sn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sn.getContentPane().setBackground(Color.cyan);
		sn.add(a1);
		sn.add(a2);
		sn.add(a3);
		sn.add(a4);
		sn.add(b1);
		sn.add(b2);
		sn.add(percent);
		sn.add(b3);
		sn.add(b4);
		sn.add(c1);
		sn.add(c2);
		sn.add(c3);
		sn.add(c4);
		sn.add(d1);
		sn.add(d2);
		sn.add(d3);
		sn.add(d4);
		sn.add(e1);
		sn.add(e2);
		sn.add(e3);
		sn.add(e4);
		sn.add(e5);
		a1.setBounds(20,20,90,30);
	a2.setBounds(110,20,90,30);
	a3.setBounds(290,20,90,30);
	a4.setBounds(380,20,90,30);
	percent.setBounds(490,20,110,20);
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
		back.setBounds(20,190,80,20);
		home.setBounds(140,190,80,20);
		sn.add(back);
		sn.add(home);
	    back.addActionListener(this);
		home.addActionListener(this);
		d.setseatname(bname,date,month);
		String a1n=d.geta1name();
		String a2n=d.geta2name();
		String a3n=d.geta3name();
		String a4n=d.geta4name();
		String b1n=d.getb1name();
		String b2n=d.getb2name();
		String b3n=d.getb3name();
		String b4n=d.getb4name();
		String c1n=d.getc1name();
		String c2n=d.getc2name();
		String c3n=d.getc3name();
		String c4n=d.getc4name();
		String d1n=d.getd1name();
		String d2n=d.getd2name();
		String d3n=d.getd3name();
		String d4n=d.getd4name();
		String e1n=d.gete1name();
		String e2n=d.gete2name();
		String e3n=d.gete3name();
		String e4n=d.gete4name();
		String e5n=d.gete5name();
		a1.setText(a1n);
		a2.setText(a2n);
		a3.setText(a3n);
		a4.setText(a4n);
		b1.setText(b1n);
		b2.setText(b2n);
		b3.setText(b3n);
		b4.setText(b4n);
		c1.setText(c1n);
		c2.setText(c2n);
		c3.setText(c3n);
		c4.setText(c4n);
		d1.setText(d1n);
		d2.setText(d2n);
		d3.setText(d3n);
		d4.setText(d4n);
		e1.setText(e1n);
		e2.setText(e2n);
		e3.setText(e3n);
		e4.setText(e4n);
		e5.setText(e5n);
		int x=d.getnoseat();
		  x=(x*100)/21;
		String pr=Integer.toString(x);
		percent.setText(pr+" % of ticket sold");
	}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==back)
			{
				sn.setVisible(false);
				seatshow s=new seatshow();
			}
			else if(e.getSource()==home)
			{
				sn.setVisible(false);
				owner o=new owner();
			}
			
		}
	
	
	
	
	
	} 
	
