package com.e2etests.automation.aleatoire.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.CommonUtils;

public class AleatoirePage extends BasePage {

	protected Properties properties;

	protected FileInputStream configFis;

	CommonUtils commonUtils;

	public AleatoirePage() {
		PageFactory.initElements(driver, this);
		this.commonUtils = new CommonUtils();
		System.out.println();
	}

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//*[@id=\"centered_nav\"]/a[3]")
	public static WebElement btnAleatoir;

	@FindBy(how = How.XPATH, using = "//*[@title='Facebook']")
	public static WebElement facebook;

	@FindBy(how = How.XPATH, using = "//*[@title='Twitter']")
	public static WebElement twitter;

	@FindBy(how = How.XPATH, using = "//*[@title='Share on Tumblr']")
	public static WebElement tumblr;

	/* Methods */
//	public String getUrl(String homeUrl) throws IOException 
//    {
//        properties = new Properties();
//        FileInputStream fis = new FileInputStream("src/test/resources/configs/Config.properties");
//        properties.load(fis);
//        properties.getProperty("home.url");
//        return homeUrl;
//    }
	public void clickOnAleatoire() {
		btnAleatoir.click();
	}

	public Boolean urlIsChanged() throws IOException {

		boolean check = true;
		{
			if (commonUtils.readFromConfig("home.url").equals(driver.getCurrentUrl())) {
				check = false;
			}
		}
		return check;
	}

}
