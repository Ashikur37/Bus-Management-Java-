import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class start implements ActionListener
	{ 
		 
		/**
		   @create JFrames
		*/
		  private JFrame first=new JFrame();
		  
		  /**
		   @create JLabel
		*/
			private ImageIcon image = new ImageIcon(getClass().getResource("bus_PNG8635.png"));
			private ImageIcon image1 = new ImageIcon(getClass().getResource("welcom.png"));
			private JLabel welcome=new JLabel(image1);
			private JLabel bus=new JLabel(image);
		  
		/**
		    @create JButtons
		*/
		    private JButton signup=new JButton("Sign up");
		    private JButton signin=new JButton("Sign in");
		
		/**
		    @Constructor
		*/
		start()
		{
		/**
		   @Setup first JFrame
		*/
			first.setSize(600,400);
			first.setVisible(true);
			first.setLayout(null);
			first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			first.getContentPane().setBackground(Color.YELLOW);
		/**
		    @Add component to JFrame
		*/
			first.add(bus);
			first.add(welcome);
			first.add(signup);
			first.add(signin);
		/**
		    @Set bounds of components
		*/	
			welcome.setBounds(00,20,350,70);
			bus.setBounds(00,90,350,200);
			signup.setBounds(400,80,120,40);
			signin.setBounds(400,140,120,40);
			
		/**
		    @Add JButtons to ActionListener
		*/
			signup.addActionListener(this);
			signin.addActionListener(this);
			
			
			
		}
		/**
			@overriding actionPerformed() method
	    */ 
		
		@Override
		public void actionPerformed(ActionEvent e)
		{ /**
			@Actions against JButtons
	    */
			if(e.getSource()==signup)
			{
				first.setVisible(false);
				signup s=new signup();
			}
			
			else if(e.getSource()==signin)
			{
				first.setVisible(false);
				signin s=new signin();
			}
			
		}
		public void back(String uname)
		{   first.setVisible(false);
			if(uname.equals("admin"))
			{
				admin a=new admin();
			}
		else	if(uname.equals("owner"))
			{
				owner o=new owner();
			}
			else
			{
				user u=new user(uname);
			}
		}
		/**
			@defining main method
		*/
		public static void main(String []args)
		{
		/**
			@Creating object of start class
		*/
			start s=new start();
			
			
		}
  
}