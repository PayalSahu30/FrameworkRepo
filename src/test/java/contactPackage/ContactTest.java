package contactPackage;
import org.testng.annotations.Test;

public class ContactTest 
{
@Test(groups="smokeTest")
public void createContact()
{
	System.out.println("==executing CreateContact==");
	
	//Data from cmdLine
	
	String Browser=  System.getProperty("browser");
	String URL=System.getProperty("url");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(Browser);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}

@Test(groups="regressionTest")
public void modifyContact()
{
	System.out.println("==executing ModifyContact==");
}
@Test
public void deleteContact()
{
	System.out.println("==executing DeleteContact==");
}
}
