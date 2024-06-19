package logins;

import org.testng.annotations.Test;

import Basepakage.init_LoadApplication;
import elementrepository.growwLoginRepository;
import exceltestdata.GrowwLoginDataHandle;


public class LoginGroww extends init_LoadApplication {
	//Login to an Existing Groww Account with data stored in a local excel file
	

	@Test
	public void verifyLoginwithValidCread() throws Exception {
	
		growwLoginRepository p1=new growwLoginRepository(driver);
		
		String x1="D:\\\\Testing Training\\\\Test data\\\\growwlogindata.xlsx";
		String Sheet="Sheet1";
		
		int rowCount= GrowwLoginDataHandle.getRowCount(x1,Sheet);//Access from Excelutil Class from utilitypkg
		

		for(int i=1;i<=rowCount;i++) 
		{
		String Email=GrowwLoginDataHandle.getCellValue(x1,Sheet,i,0);//Function Call1
	
		String pwd=GrowwLoginDataHandle.getCellValue(x1,Sheet,i,1);//Function Call2	
		
		p1.loginoption();
		
	
		p1.setvalueemail(Email);
		p1.Continue();
		
		p1.setvaluepassword(pwd);
		p1.login();
		
		}
	}	

}
