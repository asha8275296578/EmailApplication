package Email;

public class EmailApp 
{
	public static void main(String []args)
	{
		email e=new email("Asha","Darade");
		e.setAlternateemail("asha.darade63@gmail.com");
		e.setMailboxcapacity(1000);
		e.setPassword("Sevenpsr@123");
		System.out.println("Alternate emailid is: "+ e.getAlternateemail());
		System.out.println("capacity for mailbox is:"+ e.getMailboxcapacity());
		System.out.println("your new password is :"+e.getPassword());
		
	}

}
