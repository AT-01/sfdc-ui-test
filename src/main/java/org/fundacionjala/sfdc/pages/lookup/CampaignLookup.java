package org.fundacionjala.sfdc.pages.lookup;

import org.fundacionjala.sfdc.pages.campaigns.NewCampaignForm;

/**
 * This class handle campaign lookup.
 */
public class CampaignLookup extends ModalWindow {

    public static final String ALL_CAMPAIGN = "All Campaigns";


    /**
     * Constructor 
     */
    public CampaignLookup() {
        init();
    }

    public NewCampaignForm selectCampaignWithNameByScope(String parentCampaign, String scope) {
        setSearchCampaignByScope(parentCampaign, scope);
        setACampaignFromResults();
        return new NewCampaignForm();
    }

    public void setSearchCampaignByScope(String campaign, String scope) {
        SearchSectionFrame searchFrame = new SearchSectionFrame();
        searchFrame.searchTheCampaign(campaign, scope);
    }

    public void setACampaignFromResults() {
        ListSectionFrame listFrame = new ListSectionFrame();
        listFrame.selectACampaignFromTheList();
        switchToParentWithoutCloseAction();
    }
}
