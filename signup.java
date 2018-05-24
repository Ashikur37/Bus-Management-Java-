import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class signup implements ActionListener
{   /**
		    @create object of data class
	*/
	        data d=new data();
	/**
		    @create JFrames
	*/
	        private JFrame registration=new JFrame();
	/**
		    @create JButton
	*/
		    private JButton sup=new JButton("Signup");
			private JButton back=new JButton("Back");
	
	/**
		    @create JTextFields
	*/
		    private JTextField firstname=new JTextField();
		    private JTextField lastname=new JTextField();
			private JTextField username=new JTextField();
			private JTextField age=new JTextField();
	/**
		    @create JPasswordFields
	*/
			private JPasswordField password=new JPasswordField();
			private JPasswordField rpassword=new JPasswordField();
	/**
			@create JLabels
	*/
			private JLabel fname=new JLabel("First name");
			private JLabel lname=new JLabel("Last name");
			private JLabel uname=new JLabel("User name");
			private JLabel ag=new JLabel("Age");
			private JLabel pass=new JLabel("Password");
			private JLabel rpass=new JLabel("Retype Password");
	
	
	
	
		signup()
		{
	/**
			@Setup registration JFrame
	*/
		    registration.setLayout(null);
			registration.setVisible(true);
			registration.setSize(600,600);
			registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			registration.getContentPane().setBackground(Color.orange); 
	/**
			@Add component in registration JFrame
	*/		registration.add(back);
			registration.add(sup);
			registration.add(firstname);
			registration.add(fname);
			registration.add(lastname);
			registration.add(lname);
			registration.add(username);
			registration.add(uname);
			registration.add(ag);
			registration.add(age);
			registration.add(password);
			registration.add(rpassword);
			registration.add(pass);
			registration.add(rpass);
			
	/**
			@Set bounds of components
	*/	
			fname.setBounds(20,20,150,30);
			lname.setBounds(20,60,150,30);
			uname.setBounds(20,100,150,30);
			ag.setBounds(20,140,150,30);
			pass.setBounds(20,180,150,30);
			rpass.setBounds(20,220,150,30);
			firstname.setBounds(185,20,150,30);
			lastname.setBounds(185,60,150,30);
			username.setBounds(185,100,150,30);
			age.setBounds(185,140,150,30);
			password.setBounds(185,180,150,30);
		    sup.setBounds(150,290,100,60);
			back.setBounds(150,370,100,60);
			rpassword.setBounds(185,220,150,30);
		
	
	/**
			@Add  buttons to ActionListener
	*/		
			sup.addActionListener(this);
			back.addActionListener(this);
		
		
		
	}
	
	/**
			@overriding actionPerformed() method
	*/ 
			@Override
			public void actionPerformed(ActionEvent e)
		{
	/**
			@Action against button
	*/ 
			int check=0;   
			if(e.getSource()==sup)
			{
				String pas = new String(password.getPassword());
		    String rpas = new String(rpassword.getPassword());
			String fn=firstname.getText();
			String ln=lastname.getText();
			String un=username.getText();
			String aa=age.getText();
			if(fn.equals("")||ln.equals("")||un.equals("")||aa.equals(""))
			{
				JOptionPane.showMessageDialog(registration,"Fill empty fields");
			}
				
			else
			{
				if(pas.equals(rpas))
			{    
		     String user=username.getText();
			  
			 
			 check=d.checkuser(user);
			 if(check==1)
			   {
					JOptionPane.showMessageDialog(registration,"Username already used");   
			   
			   }
			   else
			   {
					JOptionPane.showMessageDialog(registration,"Registration Successfull");
					
					d.insertdata(username.getText(),pas,age.getText()); 
					registration.setVisible(false);
					start s=new start();
				 	
				}
			}
				
				
			
		else
					JOptionPane.showMessageDialog(registration,"Password doesnt match");
			}
			
			}
			else if(e.getSource()==back)
			{
				registration.setVisible(false);
				start s=new start();
			}
			
		}
	
	
}