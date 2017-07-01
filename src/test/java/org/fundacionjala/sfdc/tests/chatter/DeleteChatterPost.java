package org.fundacionjala.sfdc.tests.chatter;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.fundacionjala.sfdc.framework.selenium.Navigator;
import org.fundacionjala.sfdc.pages.chatter.ChatterAbstractPage;
import org.fundacionjala.sfdc.pages.chatter.PostContainer;
import org.fundacionjala.sfdc.pages.chatter.PostForm;

/**
 * Class to verify the deletion of chatter post.
 */
public class DeleteChatterPost {
    private static final String POST_CONTAIN = "TestDeletePost";
    private ChatterAbstractPage chatterHome;
    private PostContainer postContainer;

    /**
     * Before method.
     */
    @BeforeMethod
    public void setUp() {
        chatterHome = Navigator.goToChatter();
        PostForm postForm = chatterHome.clickPostLnk().setPostTxt(POST_CONTAIN);
        postContainer = postForm.clickShareBtn();
    }

    /**
     * Method that verify if a chatter is deleted.
     */
    @Test
    public void deleteChatterPostTest() {
        postContainer.deletePost(POST_CONTAIN);
        Assert.assertFalse(postContainer.isPostDisplayed(), "Chatter Post Deleted");
    }

}
