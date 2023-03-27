package TestClass;

import BaseClass.BC27Mar;
import POM.POM27Mar;
import UtilityPackage.Utility27Mar;

public class TC01 extends BC27Mar{

	public static void main(String[] args) {
		try {
		BC27Mar r = new BC27Mar();
		r.m1("Chrome");
		
		POM27Mar p = new POM27Mar(driver);
		
		
		Thread.sleep(2000);
		p.entrusrid(Utility27Mar.readxclsht(1, 0));
		p.entrpswd(Utility27Mar.readxclsht(1, 1));
		p.clckbtn();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
