import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class data{ 
   private String q;
   private int l=0;
   String time;
   private int prices,numbers=0;
   private int sizee=0;
   private String tk;
   private int a1s,a2s,a3s,a4s,b1s,b2s,b3s,b4s,c1s,c2s,c3s,c4s,d1s,d2s,d3s,d4s,e1s,e2s,e3s,e4s,e5s;
   private String a1m,a2m,a3m,a4m,b1m,b2m,b3m,b4m,c1m,c2m,c3m,c4m,d1m,d2m,d3m,d4m,e1m,e2m,e3m,e4m,e5m;
   private String[] lst=new String[100];
   private String s;
   private int am;
   String classs;
   int nos=0;
   private String minute;
	Connection con;
	Statement stmt;
	data(){
		try{		
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bus_management","root",""); 
	//here data is database name, root is username and password is ""
			stmt=con.createStatement();  
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public int aprovedusercounter()
{
	int i=0;
	try{  
String sql = "select* from user_info where status =1 ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return i;

}
public String getclass(String bname)
{
		try{  
String sql = "select* from bus_info where bname='"+bname+"' ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			
			 classs=rs.getString("class");
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return classs;

	
	
}
	public String gettime(String bname)
{
	 
	try{  
          am=0;
		
		
			 for(int i=1;i<=24;i++)
			 {   
				 for(int j=0;j<59;j++)
				 {    int ii=0; 
			         String h=Integer.toString(i);
					  String m=Integer.toString(j);
					 String sql = "select* from bus_info where bname='"+bname+"' and time = ('"+h+":"+m+"')";
                       int xx=i;
                     stmt.executeQuery(sql); 
                     ResultSet rs = stmt.executeQuery(sql); 
					 while(rs.next())
					{
			
							ii++;
			
						}
					 if(ii==1)
					 {   if(xx>12)
						 { xx=xx-12;
					      h=Integer.toString(xx);
					     am=1;}
						 time=h;
						 minute=m;
					 }
				 }
			 }
			
		
 
  
}catch(Exception e){ System.out.println(e);}  
return time;

}
public String getminute()
{
	return minute;
}
public int getam()
{     
	return am;
}
	public int getprice(String bname)
{
	 
	try{  
String sql = "select* from bus_info where bname='"+bname+"' ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			
			 prices=rs.getInt("price");
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return prices;

}
		public int unaprovedusercounter()
{
	int i=0;
	try{  
String sql = "select* from user_info where status =0 ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return i;

}
	public String[] unaproveduser()
{   String[] ll=new String[100]; 
	try{  
String sql = "select* from user_info where status =0 ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 s = rs.getString("username");
			 ll[i]=s;
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return ll;

}
public int getbuscounter()
{
	int sz=0;
	try
	{
		String sql = "select* from bus_info  ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
 	
		
		while(rs.next())
		{
			sz++;
			
		}
		
	}
	catch(Exception e){ System.out.println(e);} 
	return sz;
	
}
public String[] getbuslist()
{  int sz=getbuscounter();   
String[] ll=new String[sz]; 
	try{  
String sql = "select* from bus_info  ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
 	
		int i=0;
		while(rs.next())
		{
			 s = rs.getString("bname");
			 ll[i]=s;
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return ll;

}
public String[] aproveduser()
{   String[] ll=new String[100]; 
	try{  
String sql = "select* from user_info where status =1 ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{   int chk=0;
			 s = rs.getString("username");
			 if(s.equals("admin")||s.equals("owner"))
			 {
				 chk=1;
			 }
			 if(chk==0)
			 {
				  ll[i]=s;
			 i++;
			 }
			
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return ll;

}
	public void removeuser ( String username)
{
	try{  
String sql = "delete from user_info where username = ('"+username+"') ";

stmt.executeUpdate(sql);  

 
  
}catch(Exception e){ System.out.println("oo");}  
}
public void removebus ( String bname)
{
	try{  
String sql = "delete from bus_info where bname = ('"+bname+"') ";

stmt.executeUpdate(sql);  

 
  
}catch(Exception e){ System.out.println("oo");}  
}
public void aproveuser(String username)
{
	try{  
String sql = "update user_info set status ='1' where username = ('"+username+"') ";

stmt.executeUpdate(sql);  

 
  
}catch(Exception e){ System.out.println("oo");}  
}

	public String[] showf()
{
	try{  
String sql = "select* from bus_info ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{    int chk=0;
			 s = rs.getString("from");
			    for(int y=i-1;y>=0;y--)
				{
					if(s.equals(lst[y]))
						chk=1;
				}
			 if(chk==0)	
			 {
				 lst[i]=s;
			 i++;
			 } 
			 
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return lst;

}
	public String[] showt()
{
	try{  
String sql = "select* from bus_info ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			int chk=0;
			 s = rs.getString("to");
			    for(int y=i-1;y>=0;y--)
				{
					if(s.equals(lst[y]))
						chk=1;
				}
			 if(chk==0)	
			 {
				 lst[i]=s;
			 i++;
			 } 
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return lst;

}
public String[] showb(String from,String to)
{
	String[] ls=new String[100];
	try{  
String sql = "SELECT bname FROM `bus_info` WHERE `from` LIKE ('"+from+"') AND `to` LIKE ('"+to+"')  ";

stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 s = rs.getString("bname");
			 ls[i]=s;
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println(e);}  
return ls;

}
public String[] showbt(String from,String to,String hour,String min)
{

	String[] ls=new String[100];
	try{  
String sql = "SELECT bname FROM `bus_info` WHERE `from` LIKE ('"+from+"') AND `to` LIKE ('"+to+"') and time = ('"+hour+":"+min+"') ";

//SELECT * FROM `bus_info` WHERE `from` LIKE 'dhaka' AND `to` LIKE 'lakhmipur' AND `time` = '14:27'
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 s = rs.getString("bname");
			 ls[i]=s;
			 i++;
			
		}
 
  
}catch(Exception e){ System.out.println("wrong");}  
return ls;

}
public int getuserbuscounter(String username,String date, String month)
{
    sizee=0;
	try{  
String sql = "select* from user where username='"+username+"' and date='"+date+"' and month='"+month+"'";

        
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			sizee++;
			
			
		}
		
 
  
}catch(Exception e){ System.out.println(e);}  
return sizee;

}
public int getdatebuscounter(String date, String month)
{
    sizee=0;
	try{  
String sql = "select* from bus where date='"+date+"' and month='"+month+"'";

        
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			sizee++;
			
			
		}
		
 
  
}catch(Exception e){ System.out.println(e);}  
return sizee;

}
public int getuserticket(String username,String date, String month,String bname)
{ 

	try{  
	numbers=0;
String sql = "select* from user where username='"+username+"' and date='"+date+"' and month='"+month+"' and bname='"+bname+"'";

        
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			
			numbers=rs.getInt("ticket");
			
		}
		
 
  
}catch(Exception e){ System.out.println(e);}  
return numbers;

}
public String[] getuserbus(String username,String date, String month)
{

	String[] ls=new String[sizee];
	try{  
String sql = "select* from user where username='"+username+"' and date='"+date+"' and month='"+month+"'";

        
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			String ss = rs.getString("bname");
			 ls[i]=ss;
			 i++;
			
			
		}
		
 
  
}catch(Exception e){ System.out.println(e);}  
return ls;

}
public String[] getdatebus(String date, String month)
{

	String[] ls=new String[sizee];
	try{  
String sql = "select* from bus where date='"+date+"' and month='"+month+"'";

        
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			String ss = rs.getString("bname");
			 ls[i]=ss;
			 i++;
			
			
		}
		
 
  
}catch(Exception e){ System.out.println(e);}  
return ls;

}
public  void addbus(String bname,String from,String to,String clas,int price,String hour,String min){  
try{  

String sql = "INSERT INTO `bus_info` ( `bname`, `from`, `to`, `class`, `price`, `time`) VALUES ( '"+bname+"', '"+from+"', '"+to+"', '"+clas+"', '"+price+"', '"+hour+":"+min+"');";
//INSERT INTO `bus_info` ( `bname`, `from`, `to`, `class`, `price`, `time`) VALUES ( 'sas', 'asa', 'dd', 'ssaas', '122', '16:1');

stmt.executeUpdate(sql); 
 
  
}catch(Exception e){ System.out.println(e);}  
  
}
public  void insertdata(String username,String password,String age){  
try{  

String sql = "INSERT INTO user_info(username, password, age,status) VALUES ('"+username+"','"+password+"','"+age+"','0')";
//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";
stmt.executeUpdate(sql); 
 
  
}catch(Exception e){ System.out.println(e);}  
  
}  
public  void insertbus(String bname, String date, String month, int ticket){  
int t=0;
try{  

String sql = "SELECT * FROM `bus` WHERE bname='"+bname+"' and date='"+date+"' and month='"+month+"'";
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 i++;
			
		}
if(i==0)
{
	String sql1="INSERT INTO `bus` (`bname`, `date`, `month`, `ticket`) VALUES ('"+bname+"', '"+date+"', '"+month+"', '"+0+"')";
	stmt.executeUpdate(sql1); 
}	
stmt.executeQuery(sql); 
ResultSet rs1 = stmt.executeQuery(sql); 
		while(rs1.next())
		{
			 t= rs1.getInt("ticket");
			 
			
		} 
		t=t+ticket;
String sql2 = "update bus set ticket ='"+t+"' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql2);  		


  
}catch(Exception e){ System.out.println(e);}  
  
} 
public  void insertsellinfo(String date, String month, int ticket, int amount){  
int t=0;
int am=0;
try{  

String sql = "SELECT * FROM `sell_info` WHERE date='"+date+"' and month='"+month+"'";
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 i++;
			
		}
if(i==0)
{
	String sql1="INSERT INTO `sell_info` (`date`, `month`, `ticket`, `amount`) VALUES ('"+date+"', '"+month+"', '"+0+"', '"+0+"')";
	stmt.executeUpdate(sql1); 
}	
stmt.executeQuery(sql); 
ResultSet rs1 = stmt.executeQuery(sql); 
		while(rs1.next())
		{
			 t= rs1.getInt("ticket");
			 am=rs1.getInt("amount");
			
		} 
		t=t+ticket;
		am=am+amount;
		System.out.println(t+" "+am);
String sql2 = "update sell_info set ticket ='"+t+"' where date = ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql2);  
String sql3 = "update sell_info set amount ='"+am+"' where date = ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql3); 		


  
}catch(Exception e){ System.out.println(e);}  
  
}
public  void insertusert(String username,String bname, String date, String month, int ticket){  
int t=0;
try{  

String sql = "SELECT * FROM `user` WHERE username='"+username+"' and bname='"+bname+"' and date='"+date+"' and month='"+month+"'";
stmt.executeQuery(sql); 
ResultSet rs = stmt.executeQuery(sql); 
		int i=0;
		while(rs.next())
		{
			 i++;
			
		}
if(i==0)
{
	String sql1="INSERT INTO `user` (`username`, `date`, `month`, `bname`, `ticket`) VALUES ('"+username+"', '"+date+"', '"+month+"', '"+bname+"', '0')";
	stmt.executeUpdate(sql1); 
}	
stmt.executeQuery(sql); 
ResultSet rs1 = stmt.executeQuery(sql); 
		while(rs1.next())
		{
			 t= rs1.getInt("ticket");
			 
			
		} 
		t=t+ticket;
String sql2 = "update user set ticket ='"+t+"' where username=('"+username+"') and  bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql2);  		


  
}catch(Exception e){ System.out.println(e);}  
  
}
public  void updatepassword(String username,String password){  
try{  
String sql = "update user_info set password = ('"+password+"') where username= ('"+username+"') ";
//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";
stmt.executeUpdate(sql); 
 
  
}catch(Exception e){ System.out.println(e);}  
  
}


public  int checkuser(String username){  

	try{  l=0;

		String sql = "SELECT* FROM user_info WHERE username='"+username+"'";//
		//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 
			l++;
		}
		
		//con.close();  
		
	}
	catch(Exception e){
		System.out.println(e);
		}  
	return l;
}  
public  int logindata(String username,String password){ 
int status=0;
	try{  
        l=0;
		
		
		String sql = "SELECT* FROM user_info WHERE username='"+username+"' and password='"+password+"'";//
		//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 l++;
			 status = rs.getInt("status");
			 s=rs.getString("username");
		}
		
		//con.close();  
		
	}
	
	catch(Exception e){
		System.out.println(e);
		}  
		if(l==1)
		{
			if(s.equals("admin"))
				l=3;
			else if(s.equals("owner"))
				l=5;
			else
				l=l+status;
		}
			return l;
	
}
public  String getinfo(String colm,String username){  
	try{  
       
		String sql = "SELECT* FROM user_info WHERE username='"+username+"'";//
		//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 q=rs.getString(colm);
		}
		
		//con.close();  
		
	}
	
	
	catch(Exception e){
		System.out.println(e);
		}  
		return q;
		
}
public  String getticket(String date,String month){  
    
	try{  
       tk="0";
		String sql = "SELECT* FROM sell_info WHERE date='"+date+"' and month='"+month+"'";//

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 int t=rs.getInt("ticket");
			 tk=Integer.toString(t);
		}
		
		//con.close();  
		
	}
	
	
	catch(Exception e){
		System.out.println(e);
		}  
	return tk;	
		
}
public  String getamount(String date,String month){  

	try{  
       tk="0";
		String sql = "SELECT* FROM sell_info WHERE date='"+date+"' and month='"+month+"'";//

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 int t=rs.getInt("amount");
			 tk=Integer.toString(t);
		}
		
		//con.close();  
		
	}
	
	
	catch(Exception e){
		System.out.println(e);
		}  
	return tk;	
		
}
public  int seatinfo(String bname,String date,String month){ 
    int cx=0; 
	try{  
       
		String sql = "SELECT* FROM seat_info WHERE bname='"+bname+"' and date='"+date+"' and month='"+month+"'";//
		//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 cx++;
		}
		
		
		
	}
	
	
	catch(Exception e){
		System.out.println(e);
		}  
		return cx;
		
}
public void insertseatinfo(String bname,String date,String month)
{
	try{  
String sql = "INSERT INTO `seat_info` (`bname`, `date`, `month`, `a1`, `a2`, `a3`, `a4`, `b1`, `b2`, `b3`, `b4`, `c1`, `c2`, `c3`, `c4`, `d1`, `d2`, `d3`, `d4`, `e1`, `e2`, `e3`, `e4`, `e5`, `a1n`, `a2n`, `a3n`, `a4n`, `b1n`, `b2n`, `b3n`, `b4n`, `c1n`, `c2n`, `c3n`, `c4n`, `d1n`, `d2n`, `d3n`, `d4n`, `e1n`, `e2n`, `e3n`, `e4n`, `e5n`) VALUES ('"+bname+"', '"+date+"', '"+month+"', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free', 'free')";
//String sql = "INSERT INTO user_info " +"VALUES ('xyz','1253','68')";
stmt.executeUpdate(sql); 
 
  
}catch(Exception e){ System.out.println(e);} 
	
	
}

public  void setstatus(String bname,String date,String month){ 
	try{  
		
		
		String sql = "SELECT* FROM seat_info WHERE bname='"+bname+"' and date='"+date+"' and month='"+month+"'";
		

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 a1s=rs.getInt("a1");
			 a2s=rs.getInt("a2");
			 a3s=rs.getInt("a3");
			 a4s=rs.getInt("a4");
			 b1s=rs.getInt("b1");
			 b2s=rs.getInt("b2");
			 b3s=rs.getInt("b3");
			 b4s=rs.getInt("b4");
			 c1s=rs.getInt("c1");
			 c2s=rs.getInt("c2");
			 c3s=rs.getInt("c3");
			 c4s=rs.getInt("c4");
			 d1s=rs.getInt("d1");
			 d2s=rs.getInt("d2");
			 d3s=rs.getInt("d3");
			 d4s=rs.getInt("d4");
			 e1s=rs.getInt("e1");
			 e2s=rs.getInt("e2");
			 e3s=rs.getInt("e3");
			 e4s=rs.getInt("e4");
			 e5s=rs.getInt("e5");
		}
		
		//con.close();  
		
	}
	
	catch(Exception e){
		System.out.println(e);
		}  
		
}
public  void setseatname(String bname,String date,String month){ 
	try{  
		
		
		String sql = "SELECT* FROM seat_info WHERE bname='"+bname+"' and date='"+date+"' and month='"+month+"'";
		

		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next())
		{
			 a1m=rs.getString("a1n");
			 nos=nos+rs.getInt("a1");
			 nos=nos+rs.getInt("a2");
			 nos=nos+rs.getInt("a3");
			 nos=nos+rs.getInt("a4");
			 nos=nos+rs.getInt("b1");
			 System.out.println("nos"+nos);
			 nos=nos+rs.getInt("b2");
			 nos=nos+rs.getInt("b3");
			 nos=nos+rs.getInt("b4");
			 nos=nos+rs.getInt("c1");
			 nos=nos+rs.getInt("c2");
			 nos=nos+rs.getInt("c3");
			 nos=nos+rs.getInt("c4");
			 nos=nos+rs.getInt("d1");
			 nos=nos+rs.getInt("d2");
			 nos=nos+rs.getInt("d3");
			 nos=nos+rs.getInt("d4");
			 nos=nos+rs.getInt("e1");
			 nos=nos+rs.getInt("e2");
			 nos=nos+rs.getInt("e3");
			 nos=nos+rs.getInt("e4");
			 nos=nos+rs.getInt("e5");
			 a2m=rs.getString("a2n");
			 a3m=rs.getString("a3n");
			 a4m=rs.getString("a4n");
			 b1m=rs.getString("b1n");
			 b2m=rs.getString("b2n");
			 b3m=rs.getString("b3n");
			 b4m=rs.getString("b4n");
			 c1m=rs.getString("c1n");
			 c2m=rs.getString("c2n");
			 c3m=rs.getString("c3n");
			 c4m=rs.getString("c4n");
			 d1m=rs.getString("d1n");
			 d2m=rs.getString("d2n");
			 d3m=rs.getString("d3n");
			 d4m=rs.getString("d4n");
			 e1m=rs.getString("e1n");
			 e2m=rs.getString("e2n");
			 e3m=rs.getString("e3n");
			 e4m=rs.getString("e4n");
			 e5m=rs.getString("e5n");
		}
		
		//con.close();  
		
	}
	
	catch(Exception e){
		System.out.println(e);
		}  
		
}
public int getnoseat()
{
	return nos;
}
public String geta1name()
{
	return a1m;
}
public String geta2name()
{
	return a2m;
}
public String geta3name()
{
	return a3m;
}
public String geta4name()
{
	return a4m;
}
public String getb1name()
{
	return b1m;
}
public String getb2name()
{
	return b2m;
}
public String getb3name()
{
	return b3m;
}
public String getb4name()
{
	return b4m;
}
public String getc1name()
{
	return c1m;
}
public String getc2name()
{
	return c2m;
}
public String getc3name()
{
	return c3m;
}
public String getc4name()
{
	return c4m;
}
public String getd1name()
{
	return d1m;
}
public String getd2name()
{
	return d2m;
}
public String getd3name()
{
	return d3m;
}
public String getd4name()
{
	return d4m;
}
public String gete1name()
{
	return e1m;
}
public String gete2name()
{
	return e2m;
}
public String gete3name()
{
	return e3m;
}
public String gete4name()
{
	return e4m;
}
public String gete5name()
{
	return e5m;
}

public int geta1status()
{
	return a1s;
}
public int geta2status()
{
	return a2s;
}
public int geta3status()
{
	return a3s;
}
public int geta4status()
{
	return a4s;
}
public int getb1status()
{
	return b1s;
}
public int getb2status()
{
	return b2s;
}
public int getb3status()
{
	return b3s;
}
public int getb4status()
{
	return b4s;
}
public int getc1status()
{
	return c1s;
}
public int getc2status()
{
	return c2s;
}
public int getc3status()
{
	return c3s;
}
public int getc4status()
{
	return c4s;
}
public int getd1status()
{
	return d1s;
}
public int getd2status()
{
	return d2s;
}
public int getd3status()
{
	return d3s;
}
public int getd4status()
{
	return d4s;
}
public int gete1status()
{
	return e1s;
}
public int gete2status()
{
	return e2s;
}
public int gete3status()
{
	return e3s;
}
public int gete4status()
{
	return e4s;
}
public int gete5status()
{
	return e5s;
}
public void inserta1(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set a1 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set a1n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserta2(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set a2 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set a2n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserta3(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set a3 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set a3n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserta4(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set a4 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set a4n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}public void insertb1(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set b1 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set b1n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertb2(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set b2 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set b2n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}public void insertb3(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set b3 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set b3n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}public void insertb4(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set b4 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set b4n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertc1(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set c1 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set c1n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertc2(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set c2 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set c2n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertc3(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set c3 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set c3n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertc4(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set c4 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set c4n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertd1(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set d1 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set d1n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertd2(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set d2 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set d2n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertd3(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set d3 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set d3n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void insertd4(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set d4 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set d4n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserte1(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set e1 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set e1n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserte2(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set e2 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set e2n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserte3(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set e3 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set e3n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void inserte4(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set e4 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set e4n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  	
	
}
public void inserte5(String bname,String date,String month,String username)
{
		try{  
String sql = "update seat_info set e5 ='1' where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";

stmt.executeUpdate(sql);  
String sql1 = "update seat_info set e5n =('"+username+"') where bname = ('"+bname+"') and date= ('"+date+"') and month= ('"+month+"') ";
 stmt.executeUpdate(sql1); 
  
}catch(Exception e){ System.out.println("oo");}  
	
	
}
public void updateprice(String bname, int price)
{
	try{  
String sql = "update bus_info set price =('"+price+"') where bname = ('"+bname+"') ";

stmt.executeUpdate(sql);  

  
}catch(Exception e){ System.out.println("oo");}  
	
}
}
  
