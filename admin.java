import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class admin implements ActionListener
{  /**
		    @create object of data class
	*/
			data d=new data();
    /**
		    @create JFrameS
	*/
	String aprvuser;
  private JFrame adm=new JFrame();
  
  private JFrame remove=new JFrame();
  private JFrame aprv=new JFrame();
   /**
		    @create JButton
	*/
   
   private JButton aproveuser=new JButton("Aprove User");
   private JButton removeuser=new JButton("Remove User");
   private JButton changepassword=new JButton("Change password");
   private JButton back=new JButton("Back");
   private JButton back1=new JButton("Back");
   private JButton logout=new JButton("Log out");
   /**
		    @create List
	*/
   private List user=new List(2,false);
   private List users=new List(2,false);
   /**
		    @create JLabel
	*/private JLabel unaproved=new JLabel("Unaproved user");
	private JLabel userlist=new JLabel("User List");
	
   /**
		    @create JButtons
	*/
   private JButton aprove =new JButton("Aprove");
   private JButton home=new JButton("Home");
   private JButton remov=new JButton("Remove");
   /**
		    @Constructor
	*/
   admin()
   {
	   /**
		    @Setup JFrames
	*/
	   adm.setVisible(true);
	   adm.setLayout(null);
	   adm.setSize(400,400);
	   adm.add(logout);
	   
	   adm.add(aproveuser);
	   adm.getContentPane().setBackground(Color.red);
	   adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   adm.add(removeuser);
	   adm.add(changepassword);
	   aprv.setLayout(null);
       aprv.getContentPane().setBackground(Color.red);

	   aprv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   remove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	remove.getContentPane().setBackground(Color.red);

	   aprv.setSize(400,400);
	   remove.setLayout(null);
	   remove.setSize(400,400);
	 /**
		    @Add components to JFrames
	*/
	   aprv.add(unaproved);
	   aprv.add(back);
	   aprv.add(user);
	   aprv.add(aprove);
	   aprv.add(home);
	   remove.add(userlist);
	   remove.add(users);
	   remove.add(remov);
	   remove.add(home);
	   remove.add(back1);
	   aproveuser.setBounds(20,20,120,30);
	   removeuser.setBounds(20,70,120,30);
	   changepassword.setBounds(20,120,150,30);
	   logout.setBounds(20,170,120,30);
	   unaproved.setBounds(20,20,130,30);
	   userlist.setBounds(20,20,130,30);
	   back.setBounds(200,20,100,20);
	   back1.setBounds(200,20,100,20);
	   user.setBounds(20,60,100,150);
	   users.setBounds(20,60,100,150);
	   aprove.setBounds(50,230,100,20);
	   remov.setBounds(50,230,100,20);
	   /**
		    @Add JButtons to ActionListener
	*/
	   aproveuser.addActionListener(this);
	   removeuser.addActionListener(this);
	   remov.addActionListener(this);
	   aprove.addActionListener(this);
	   home.addActionListener(this);
	   changepassword.addActionListener(this);
	   back.addActionListener(this);
	   back1.addActionListener(this);
	   logout.addActionListener(this);
   }
   public void aproving()
   {  
   /**
		    @Set aprv JFrame visible
	*/
	     aprv.setVisible(true);
	  /**
		    @Call list method
	*/ 
			list();
	   
	   
   }
   public void removing()
   {  
   /**
		    @Set aprv JFrame visible
	*/
	     remove.setVisible(true);
	  /**
		    @Call lists method
	*/ 
			lists();
	   
	   
   }
   
   public void list()
   {	 int count=d.unaprovedusercounter();
       
         String[] lst=new String[count];
	   lst=d.unaproveduser();
			 int sz=lst.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to user list
	*/
				user.add(lst[k]);
			}
			
   }
   public void lists()
   {	 int count=d.aprovedusercounter();
       
         String[] ls=new String[count];
	   ls=d.aproveduser();
			 int sz=ls.length;
			for(int k=0;k<sz;k++)
			{   
				/**
		    @Add elements to users list
	*/
				users.add(ls[k]);
			}
			
   }
   /**
			@overriding actionPerformed() method
	*/ 
			@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==aproveuser)
		{
			adm.setVisible(false);
			aproving();
		}
		else if(e.getSource()==removeuser)
		{
			adm.setVisible(false);
			removing();
		}
		else if(e.getSource()==aprove)
		{
			
			 int i[];
		
		i=user.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			aprvuser=user.getItem(i[j]);
		d.aproveuser(aprvuser);
		JOptionPane.showMessageDialog(aprv,aprvuser+" has been approved");
		user.removeAll();
		list();
		}
		else if(e.getSource()==remov)
		{
			
			 int i[];
		
		i=users.getSelectedIndexes();
		for(int j=0;j<i.length;j++)
			aprvuser=users.getItem(i[j]);
		d.removeuser(aprvuser);
		JOptionPane.showMessageDialog(remove,aprvuser+" has been removed");
		users.removeAll();
		lists();
		}
		else if(e.getSource()==changepassword)
		{
			adm.setVisible(false);
			changepassword c=new changepassword("admin");
		}
		else if(e.getSource()==back)
		{
			aprv.setVisible(false);
			admin a=new admin();
		}
		else if(e.getSource()==back1)
		{
			remove.setVisible(false);
			admin a=new admin();
		}
		else if(e.getSource()==logout)
		{
			adm.setVisible(false);
			signin s=new signin();
		}
	}
	
	
}