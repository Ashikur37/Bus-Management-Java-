import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class updateprc implements ActionListener
{   data d=new data();
	private JFrame update=new JFrame();
	private JLabel selectbus=new JLabel("Select bus");
	private Choice bus=new Choice();
	private JButton prv=new JButton("Previous price");
	private JLabel prvp=new JLabel("");
	private JLabel updtprice=new JLabel("Updateprice");
	private JButton updt=new JButton("Update");
	private JButton back=new JButton("Back");
	private JTextField updprice=new JTextField();
	updateprc()
	{
		update.setVisible(true);
		update.setLayout(null);
		update.setSize(500,500);
		update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		update.getContentPane().setBackground(Color.yellow);
		update.add(selectbus);
		update.add(bus);
		update.add(prv);
		update.add(prvp);
		update.add(updtprice);
		update.add(updt);
		update.add(back);
		update.add(updprice);
		selectbus.setBounds(20,20,100,30);
		bus.setBounds(130,20,120,30);
		prv.setBounds(20,70,100,30);
		prvp.setBounds(130,70,80,20);
		updtprice.setBounds(20,120,100,30);
		updprice.setBounds(130,120,80,20);
		updt.setBounds(130,150,100,20);
		back.setBounds(290,20,100,20);
		prv.addActionListener(this);
		updt.addActionListener(this);
		back.addActionListener(this);
		String[] lst=d.getbuslist();
		
		int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to bus choice
	*/    
        		
		bus.add(lst[k]);
			}
		
	}
	/**
			@overriding actionPerformed() method
	    */ 
	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==prv)
			{
				String busname = bus.getItem(bus.getSelectedIndex());
				int prc=d.getprice(busname);
				prvp.setText(Integer.toString(prc));
			}
			else if(e.getSource()==back)
			{
				update.setVisible(false);
				owner o=new owner();
			}
			else if(e.getSource()==updt)
			{
				String prce=updprice.getText();
				int pricee=Integer.parseInt(prce);
				String busname = bus.getItem(bus.getSelectedIndex());
				d.updateprice(busname,pricee);
			}
		}
	
}