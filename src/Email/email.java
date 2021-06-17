package Email;

import java.util.Scanner;

public class email 
{
	String firstname;
	String lastname;
	String Password;
	String department;
	String email_id;
	String companysuffix="knp";
	int Mailboxcapacity;
	String alternateemail;
	public email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("welcome " + this.firstname+ " "+ this.lastname);
	this.department=Setdepartment();
		System.out.println("your Assigned department is  :"+  this.department);;
		this.Password=Randompassword(8);
		System.out.println("Random password is "+this.Password);
		email_id=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix+".com";
		
		System.out.println("your email id is "+email_id);

		
		
		
	}
	private String Setdepartment()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1.sales");
		System.out.println("2.developement");
		System.out.println("3.other");
		System.out.println("enter the choice");
		int choice=scan.nextInt();
		if( choice==1) 
		{
			return "Sales";
		}
		else if(choice==2)
		{
			return "developement";
			
		}
		else
		{
			return "other";
		}
		
	}
private String Randompassword(int length)
{
	String Passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
	char[]Password=new char[length];
	
	for(int i=0;i<length;i++)
	{
		int rand=(int)(Math.random()*Passwordset.length());
		Password[i]=Passwordset.charAt(rand);
	}
	return new String (Password);
	
	
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getMailboxcapacity() {
	return Mailboxcapacity;
}
public void setMailboxcapacity(int mailboxcapacity) {
	Mailboxcapacity = mailboxcapacity;
}
public String getAlternateemail() {
	return alternateemail;
}
public void setAlternateemail(String alternateemail) {
	this.alternateemail = alternateemail;
}


}
