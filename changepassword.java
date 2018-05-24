import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class changepassword implements ActionListener
{   data d=new data();
    private String uname;
	private JFrame password=new JFrame();
	private JLabel oldp=new JLabel("Old password");
	private JLabel newp=new JLabel("New Password");
	private JPasswordField oldpassword=new JPasswordField();
	private JPasswordField newpassword=new JPasswordField();
	private JButton update =new JButton("Update");
	private JButton back =new JButton("Back");
	
	changepassword(String username)
	{
		uname=username;
		password.setVisible(true);
		password.setLayout(null);
		password.setSize(400,400);
		password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		password.getContentPane().setBackground(Color.red);  //change the color of password frame
		password.add(oldp);
		password.add(oldpassword);
		password.add(newp);
		password.add(newpassword);
		password.add(update);
		password.add(back);
		oldp.setBounds(20,20,120,20);
		newp.setBounds(20,60,120,20);
		oldpassword.setBounds(150,20,120,20);
		newpassword.setBounds(150,60,120,20);
		update.setBounds(100,100,120,20);
		back.setBounds(300,10,120,20);
		oldpassword.setEchoChar('*');
		newpassword.setEchoChar('*');
		update.addActionListener(this);
		back.addActionListener(this);
	}
		/**
			@overriding actionPerformed() method
	*/ 
			@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==update)
		{
			String psd = new String(oldpassword.getPassword());
	String npsd = new String(newpassword.getPassword());
	   
	int i=d.logindata(uname,psd);
	   
	if(i!=0)
	{
		d.updatepassword(uname,npsd);
		
	}
	else
		JOptionPane.showMessageDialog(password,"Wrong Old password");
			
		}
		else if(e.getSource()==back)
		{
			password.setVisible(false);
			start s=new start();
			s.back(uname);
		}
		
	}
	
}