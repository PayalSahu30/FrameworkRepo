package orgPackage;

import org.testng.annotations.Test;

public class orgTest 
{
	@Test(groups="smokeTest")
	public void createOrg()
	{
		System.out.println("==executing createOrg==");
	}
	
	@Test(groups="regressionTest")
	public void modifyOrg()
	{
		System.out.println("==executing ModifyOrg==");
	}
	
	@Test
	public void deleteOrg()
	{
		System.out.println("==executing DeleteOrg==");
	}
}
