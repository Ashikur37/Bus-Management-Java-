import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class signin implements ActionListener
{    data d=new data();
	private JFrame sin=new JFrame();
	private JTextField username=new JTextField();
	private JPasswordField password=new JPasswordField();
	private JButton sign=new JButton("Login");
	private JButton back=new JButton("Back");
	private JLabel uname=new JLabel("Username");
	private JLabel pass=new JLabel("Password");
	signin()
	{
		sin.setVisible(true);
		sin.setLayout(null);
		sin.setSize(500,500);
		sin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sin.getContentPane().setBackground(Color.magenta);
		sin.add(username);
		sin.add(sign);
		sin.add(password);
		sin.add(back);
		sin.add(pass);
		sin.add(uname);
		uname.setBounds(20,20,100,30);
		pass.setBounds(20,60,100,30);
		username.setBounds(140,20,100,30);
		password.setBounds(140,60,100,30);
		sign.setBounds(50,120,100,30);
		back.setBounds(300,10,90,30);
		sign.addActionListener(this);
		back.addActionListener(this);
		
	}
	/**
			@overriding actionPerformed() method
	*/ 
			@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sign)
		{
			 String psd = new String(password.getPassword());
	          int q=d.logindata(username.getText(),psd);
			 if(q==1)
			 
			 {
				JOptionPane.showMessageDialog(sin,"You are still unaproved"); 
			 }
			else if(q==2)
            {
				
				sin.setVisible(false);
				user u=new user(username.getText());
			}				
			else if(q==3)
			{   sin.setVisible(false);
				admin a=new admin();
			}
			else if(q==5)
			{   sin.setVisible(false);
				owner o=new owner();
			}
			else
				JOptionPane.showMessageDialog(sin,"Wrong username or password");
		}
		else if(e.getSource()==back)
		{
			sin.setVisible(false);
			start s=new start();
		}
	}
	
	
	
	
}