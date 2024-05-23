package com.tc_awc.functionaltestcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tc_awc.constants.PropertiesOperations;
import com.tc_awc.pageobjects.addItem_Page;
import com.tc_awc.pageobjects.folder_Page;
import com.tc_awc.pageobjects.home_Page;
import com.tc_awc.pageobjects.wokflow_Page;
import com.tc_awc.utilities.DriverFactory;
import com.tc_awc.utilities.TestBase;
/* 2.6 EQR (Freeze) Release Status.*/
public class AWC_SubmitToWorkFlowEQR  extends TestBase{
	public WebDriverWait wt;
	home_Page hp = new home_Page();
	folder_Page fp = new folder_Page();
	addItem_Page ap = new addItem_Page();
	wokflow_Page wp = new wokflow_Page();
	String itemID;
	
	@Test(priority = 1, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_GeneralWIP(String itemStatus, String itemStatus_P0WIP, String itemStatus__P1WIP,
			String itemStatus_P2WIP, String itemStatus__P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();
	}
	@Test(priority = 2, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_P0WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus__P1WIP,
			String itemStatus_P2WIP, String itemStatus__P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_P0WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();


	}

	@Test(priority = 3, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_P1WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_P1WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();


	}

	@Test(priority = 4, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_P2WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_P2WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();


	}

	@Test(priority = 5, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_P3WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_P3WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 6, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_EVT1WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_EVT1WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 7, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_EVT2WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_EVT2WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 8, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_EVT3WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_EVT3WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 9, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_DVT1WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_DVT1WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 10, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_DVT2WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_DVT2WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 11, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_DVT3WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus_P1WIP,
			String itemStatus_P2WIP, String itemStatus_P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_DVT3WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 12, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_PVT1WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus__P1WIP,
			String itemStatus_P2WIP, String itemStatus__P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_PVT1WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@Test(priority = 13, dataProvider = "getData")
	public void submitToWorkflowEQRRelease_PVT2WIP(String itemStatus, String itemStatus_P0WIP, String itemStatus__P1WIP,
			String itemStatus_P2WIP, String itemStatus__P3WIP, String itemStatus_EVT1WIP, String itemStatus_EVT2WIP,
			String itemStatus_EVT3WIP, String itemStatus_DVT1WIP, String itemStatus_DVT2WIP, String itemStatus_DVT3WIP,
			String itemStatus_PVT1WIP, String itemStatus_PVT2WIP) throws Throwable {
		wt = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(30));
		AWC_Login login = new AWC_Login();
		login.login();
		wt.until(ExpectedConditions.titleContains("Teamcenter - Home"));
		hp.clickFolder();
		fp.clickNew_Add();
		hp.search_item(itemStatus_PVT2WIP);
		wp.clickOn_submitToWorkflow();
		wp.submitToWorkflowEQRRelease();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][13];
		data[0][0] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS1");
		data[0][1] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS2");
		data[0][2] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS3");
		data[0][3] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS4");
		data[0][4] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS5");
		data[0][5] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS6");
		data[0][6] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS7");
		data[0][7] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS8");
		data[0][8] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS9");
		data[0][9] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS10");
		data[0][10] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS11");
		data[0][11] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS12");
		data[0][12] = PropertiesOperations.getPropertyValueByKey("DATA_WIP_STATUS13");

		return data;
	}
}
