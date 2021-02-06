package org.demoframe.testPom;

import org.demoframe.genric.BaseTest;
import org.demoframe.genric.ExcelData;
import org.demoframe.pom.ActiTimeLogin;
import org.demoframe.pom.ActitimeHome;
import org.testng.annotations.Test;

public class TestActitimeLogin extends BaseTest {
	@Test
	public void validLogin() throws Exception {
		String user = ExcelData.readCell(excel_path, loginparameter, 1, 0);
		String pass = ExcelData.readCell(excel_path, loginparameter, 1, 1);
		ActiTimeLogin atl = new ActiTimeLogin(driver);
		atl.sendUsername(user);
		atl.sendPassword(pass);
		atl.clicklogin();
		ActitimeHome ah = new ActitimeHome(driver);
		ah.varifyHpIsDisplayed(driver, "Enter", TO);

	}
}
