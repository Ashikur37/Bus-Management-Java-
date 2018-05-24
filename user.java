import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class user implements ActionListener
{   private String username;
	private JFrame userfst=new JFrame();
	private JButton businfo=new JButton("Bus Information");
	private JButton viewstatus=new JButton("View Schedule");
	private JButton changepassword=new JButton("Change Password");
	private JButton logout=new JButton("Log Out");
	user(String name)
	{
		username=name;
		userfst.setVisible(true);
		userfst.setLayout(null);
		userfst.setSize(500,500);
		userfst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userfst.getContentPane().setBackground(Color.green);
		userfst.add(businfo);
		userfst.add(viewstatus);
		userfst.add(changepassword);
		userfst.add(logout);
		businfo.setBounds(20,20,150,30);
		viewstatus.setBounds(20,70,150,30);
		changepassword.setBounds(20,120,150,30);
		logout.setBounds(20,170,150,30);
		businfo.addActionListener(this);
		
		changepassword.addActionListener(this);
		logout.addActionListener(this);
		viewstatus.addActionListener(this);
	}
	
	/**
			@overriding actionPerformed() method
	    */ 
	@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==businfo)
			{userfst.setVisible(false);
		busview b=new busview(username);
				
			}
			
			else if(e.getSource()==changepassword)
			{    userfst.setVisible(false);
				changepassword c=new changepassword(username);
			}
			else if(e.getSource()==logout)
			{
				userfst.setVisible(false);
				signin s=new signin();
			}
			else if(e.getSource()==viewstatus)
			{
				userfst.setVisible(false);
				usershow u=new usershow(username);
			}
			
		}
	
}