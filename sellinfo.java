import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class sellinfo implements ActionListener
{
	JFrame sell=new JFrame();
	JButton showdate=new JButton("View date wise sell");
	JButton showseat=new JButton("View seat plan");
	JButton back=new JButton("Back");
	sellinfo()
	{
		sell.setVisible(true);
		sell.setLayout(null);
		sell.setSize(300,300);
		sell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sell.getContentPane().setBackground(Color.orange);
		sell.add(showdate);
		sell.add(showseat);
		sell.add(back);
		showdate.setBounds(20,20,150,30);
		showseat.setBounds(20,60,150,30);
		back.setBounds(20,100,100,30);
		showdate.addActionListener(this);
		showseat.addActionListener(this);
		back.addActionListener(this);
	}
	/**
			@overriding actionPerformed() method
	    */ 
	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==back)
			{
				sell.setVisible(false);
				owner o=new owner();
			}
			else if(e.getSource()==showdate)
			{
				sell.setVisible(false);
				datesell s=new datesell();
			}
			else if(e.getSource()==showseat)
			{
				sell.setVisible(false);
				seatshow s=new seatshow();
			}
		}
}