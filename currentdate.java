import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class currentdate
{
	private String d;
	private String m;
	private String mm;
	private int mint;
	currentdate()
	{
		DateFormat month = new SimpleDateFormat("MM");
		DateFormat dat = new SimpleDateFormat("dd");
	   //get current date time with Date()
	   Date date = new Date();
	  m= month.format(date);
	  d= dat.format(date);
	  int mon = Integer.parseInt(m);
	   mint=mon;
	}
	public String getdates()
	{
		
		return d;
	}
	public int getdate()
	{
		int dat = Integer.parseInt(d);
		return dat;
	}	
   public String getmonth()
   {   
	   int mon = Integer.parseInt(m);
	   mint=mon;
	   if(mon==1)
	   {
		   mm="january";
	   }
	   else if(mon==2)
	   {
		   mm="february";
	   }
	   else if(mon==10)
	   {
		   mm="october";
	   }
	   else if(mon==3)
	   {
		   mm="march";
	   }
	   else if(mon==4)
	   {
		   mm="april";
	   }
	   else if(mon==5)
	   {
		   mm="may";
	   }
	   else if(mon==6)
	   {
		   mm="june";
	   }
	   else if(mon==7)
	   {
		   mm="july";
	   }
	   else if(mon==8)
	   {
		   mm="august";
	   }
	   else if(mon==9)
	   {
		   mm="september";
	   }
	   else if(mon==11)
	   {
		   mm="november";
	   }
	   else if(mon==12)
	   {
		   mm="december";
	   }
		return mm;
	   
   }
   public int getmonthint()
   {
	   return mint;
   }
  
	   
	
}