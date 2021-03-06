package org.fundacionjala.sfdc.pages.leads;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.fundacionjala.sfdc.framework.selenium.CommonActions;
import org.fundacionjala.sfdc.pages.AssertsDetails;
import org.fundacionjala.sfdc.pages.base.DetailBase;

import static org.fundacionjala.sfdc.pages.leads.LeadFields.COMPANY;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.ADDRESS;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.ANNUAL_REVENUE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.CURRENT_GENERATORS;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.DESCRIPTION;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.EMAIL;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.FAX;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.FULL_NAME;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.INDUSTRY;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.LEAD_SOURCE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.LEAD_STATUS;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.MOBILE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.NUMBER_LOCATIONS;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.NUM_EMPLOYEES;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.PHONE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.PRIMARY;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.PRODUCT_INTEREST;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.RATING;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.SICCODE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.TITLE;
import static org.fundacionjala.sfdc.pages.leads.LeadFields.WEBSITE;


/**
 * Class to manage the Detail of the LeadHome Page when it was created.
 */
public class LeadDetails extends DetailBase {

    /*LeadHome Information*/
    @FindBy(xpath = "//span[text()='Lead Owner']/parent::div/following-sibling::div/span/div/div")
    @CacheLookup
    private WebElement ownerLabel;

    @FindBy(xpath = "//span[text()='Details']")
    @CacheLookup
    private WebElement detailsButton;

    @FindBy(xpath = "//span[text()='Name']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement nameLabel;

    @FindBy(xpath = "//span[text()='Company']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement companyLabel;

    @FindBy(xpath = "//span[text()='Title']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement titleLabel;

    @FindBy(xpath = "//span[text()='Lead Source']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement leadSourceLabel;

    @FindBy(xpath = "//span[text()='Industry']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement industryLabel;

    @FindBy(xpath = "//span[text()='Annual Revenue']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement annualRevenueLabel;

    @FindBy(xpath = "//span[text()='Phone']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement phoneLabel;

    @FindBy(xpath = "//span[text()='Mobile']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement mobileLabel;

    @FindBy(xpath = "//span[text()='Fax']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement faxLabel;

    @FindBy(xpath = "//span[text()='Email']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement emailLabel;

    @FindBy(xpath = "//span[text()='Website']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement websiteLabel;

    @FindBy(xpath = "//span[text()='Lead Status']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement leadStatusLabel;

    @FindBy(xpath = "//span[text()='Rating']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement ratingLabel;

    @FindBy(xpath = "//span[text()='No. of Employees']/parent::div/following-sibling::div/span/span")
    @CacheLookup
    private WebElement numEmployeesLabel;

    /*Address Information*/
    @FindBy(xpath = "//span[text()='Address']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement addressLabel;

    /*additional information*/
    @FindBy(xpath = "//span[text()='Product Interest']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement productInterestLabel;

    @FindBy(xpath = "//span[text()='SIC Code']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement sicCodeLabel;

    @FindBy(xpath = "//span[text()='Number of Locations']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement numLocationsLabel;

    @FindBy(xpath = "//span[text()='Current Generator(s)']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement currentGeneratorsLabel;

    @FindBy(xpath = "//span[text()='Primary']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement primaryLabel;

    /*Others*/
    @FindBy(xpath = "//span[text()='Description']/parent::div/following-sibling::div/span")
    @CacheLookup
    private WebElement descriptionLabel;

    @FindBy(xpath = "//span[text()='Created By']/parent::div/following-sibling::div/span/div")
    @CacheLookup
    private WebElement createdByLabel;

    @FindBy(xpath = "//span[text()='Last Modified By']/parent::div/following-sibling::div/span/div")
    @CacheLookup
    private WebElement lastModifiedByLabel;

    @FindBy(css = "div.listRelatedObject.campaignBlock table.list")
    @CacheLookup
    private WebElement campaignBlock;

    @FindBy(css = "a[title='Show more actions for this record']")
    @CacheLookup
    private WebElement buttonMoreActions;

    @FindBy(css = "button[title='Delete']")
    @CacheLookup
    private WebElement buttonDeleteConfirm;


    /**
     * Method that gets the Owner that was registered in the creation of LeadHome.
     */
    public void clickDetailsButton() {
        CommonActions.clickElement(detailsButton);
    }

    /**
     * This method gets the LeadHome Name that was registered in the creation of LeadHome.
     *
     * @return the LeadHome Name.
     */
    public String getNameLabel() {
        return nameLabel.getText();
    }

    /**
     * This method gets the Company that was registered in the creation of LeadHome.
     *
     * @return a String that is the company information.
     */
    public String getCompanyLabel() {
        return companyLabel.getText();
    }

    /**
     * This method gets the Title of the LeadHome.
     *
     * @return a String that is the LeadHome Title.
     */
    public String getTitleLabel() {
        return titleLabel.getText();
    }

    /**
     * This method gets the Source info of the LeadHome.
     *
     * @return a String that is the Source info of the LeadHome.
     */
    public String getLeadSourceLabel() {
        return leadSourceLabel.getText();
    }

    /**
     * This method gets the selected industry for the LeadHome.
     *
     * @return a String with the industry info.
     */
    public String getIndustryLabel() {
        return industryLabel.getText();
    }

    /**
     * This method gets the Annual Revenue info for the LeadHome.
     *
     * @return a String with the Annual Revenue info.
     */
    public String getAnnualRevenueLabel() {

        return annualRevenueLabel.getText().substring(1);
    }

    /**
     * This method gets the Phone number.
     *
     * @return a String with the Phone number.
     */
    public String getPhoneLabel() {
        return phoneLabel.getText();
    }

    /**
     * This method gets the Mobile number.
     *
     * @return a String with the Mobile number.
     */
    public String getMobileLabel() {
        return mobileLabel.getText();
    }

    /**
     * This method gets the Fax number.
     *
     * @return a String with the Fax number.
     */
    public String getFaxLabel() {
        return faxLabel.getText();
    }

    /**
     * This method gets the registered Email.
     *
     * @return a String with the Email data.
     */
    public String getEmailLabel() {
        return emailLabel.getText();
    }

    /**
     * This method gets the website.
     *
     * @return a String with the website info.
     */
    public String getWebsiteLabel() {
        return websiteLabel.getText();
    }

    /**
     * This method gets the status of the LeadHome.
     *
     * @return a String with the status info.
     */
    public String getLeadStatusLabel() {
        return leadStatusLabel.getText();
    }

    /**
     * This method gets the rating.
     *
     * @return a String with the Rating info.
     */
    public String getRatingLabel() {
        return ratingLabel.getText();
    }

    /**
     * This method gets the number of Employees.
     *
     * @return a String with the number of the employees.
     */
    public String getNumEmployeesLabel() {
        return numEmployeesLabel.getText();
    }

    /**
     * this method gets the Address.
     *
     * @return a String with the Address info.
     */
    public String getAddressLabel() {
        return addressLabel.getText();
    }

    /**
     * This method gets the product interest for the lead.
     *
     * @return a String with the Products interest info.
     */
    public String getProductInterestLabel() {
        return productInterestLabel.getText();
    }

    /**
     * This method gets the SIC code.
     *
     * @return a String with the SIC code.
     */
    public String getSicCodeLabel() {
        return sicCodeLabel.getText();
    }

    /**
     * This method gets the number of Locations.
     *
     * @return a String with the number of locations info.
     */
    public String getNumLocationsLabel() {
        return numLocationsLabel.getText();
    }

    /**
     * This method gets the Current generator.
     *
     * @return a String with the current generator.
     */
    public String getCurrentGeneratorsLabel() {
        return currentGeneratorsLabel.getText();
    }

    /**
     * This method gets the selected Primary info.
     *
     * @return a String with the primary info.
     */
    public String getPrimaryLabel() {
        return primaryLabel.getText();
    }

    /**
     * This method gets the description.
     *
     * @return a String with the description info.
     */
    public String getDescriptionLabel() {
        return descriptionLabel.getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, AssertsDetails> getStrategyAssertMap() {
        final Map<String, AssertsDetails> strategyMap = new HashMap<>();

        strategyMap.put(FULL_NAME.toString(), this::getNameLabel);
        strategyMap.put(COMPANY.toString(), this::getCompanyLabel);
        strategyMap.put(TITLE.toString(), this::getTitleLabel);
        strategyMap.put(LEAD_SOURCE.toString(), this::getLeadSourceLabel);
        strategyMap.put(INDUSTRY.toString(), this::getIndustryLabel);
        strategyMap.put(PHONE.toString(), this::getPhoneLabel);
        strategyMap.put(MOBILE.toString(), this::getMobileLabel);
        strategyMap.put(FAX.toString(), this::getFaxLabel);
        strategyMap.put(ANNUAL_REVENUE.toString(), this::getAnnualRevenueLabel);

        strategyMap.put(EMAIL.toString(), this::getEmailLabel);
        strategyMap.put(WEBSITE.toString(), this::getWebsiteLabel);
        strategyMap.put(LEAD_STATUS.toString(), this::getLeadStatusLabel);
        strategyMap.put(RATING.toString(), this::getRatingLabel);
        strategyMap.put(NUM_EMPLOYEES.toString(), this::getNumEmployeesLabel);
        strategyMap.put(ADDRESS.toString(), this::getAddressLabel);

        strategyMap.put(PRODUCT_INTEREST.toString(), this::getProductInterestLabel);
        strategyMap.put(SICCODE.toString(), this::getSicCodeLabel);
        strategyMap.put(NUMBER_LOCATIONS.toString(), this::getNumLocationsLabel);
        strategyMap.put(CURRENT_GENERATORS.toString(), this::getCurrentGeneratorsLabel);
        strategyMap.put(PRIMARY.toString(), this::getPrimaryLabel);

        strategyMap.put(DESCRIPTION.toString(), this::getDescriptionLabel);

        return strategyMap;
    }

    /**
     * Method that gets the Owner that was registered in the creation of LeadHome.
     */
    public void clickButtonMoreActions() {
        CommonActions.sleep(5000);
        CommonActions.clickElement(buttonMoreActions);
    }

    /**
     * Method that gets the Owner that was registered in the creation of LeadHome.
     */
    public void buttonDeleteConfirm() {
        CommonActions.sleep(5000);
        CommonActions.clickElement(buttonDeleteConfirm);
    }

    /**
     * Method that gets the Owner that was registered in the creation of LeadHome.
     */
    public void waitNewButton() {
        CommonActions.sleep(3000);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public LeadForm clickEditButton() {
        clickButtonMoreActions();
        CommonActions.clickElement(editBtn);
        return new LeadForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LeadHome clickDeleteButton() {
        clickButtonMoreActions();
        CommonActions.clickElement(deleteBtn);
        buttonDeleteConfirm();
        return new LeadHome();
    }
}
