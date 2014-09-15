/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.domain;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author 212412062
 */
public class MentorTest extends TestCase {


    public MentorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MentorTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

//    /**
//     * Test of getId method, of class Mentor.
//     */
//    public void testGetId() {
//        System.out.println("getId");
//        Mentor instance = new Mentor();
//        Long expResult = null;
//        Long result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setId method, of class Mentor.
//     */
//    public void testSetId() {
//        System.out.println("setId");
//        Long id = null;
//        Mentor instance = new Mentor();
//        instance.setId(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFirstName method, of class Mentor.
//     */
//    public void testGetFirstName() {
//        System.out.println("getFirstName");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getFirstName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFirstName method, of class Mentor.
//     */
//    public void testSetFirstName() {
//        System.out.println("setFirstName");
//        String firstName = "";
//        Mentor instance = new Mentor();
//        instance.setFirstName(firstName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLastName method, of class Mentor.
//     */
//    public void testGetLastName() {
//        System.out.println("getLastName");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getLastName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLastName method, of class Mentor.
//     */
//    public void testSetLastName() {
//        System.out.println("setLastName");
//        String lastName = "";
//        Mentor instance = new Mentor();
//        instance.setLastName(lastName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIndustry method, of class Mentor.
//     */
//    public void testGetIndustry() {
//        System.out.println("getIndustry");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getIndustry();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIndustry method, of class Mentor.
//     */
//    public void testSetIndustry() {
//        System.out.println("setIndustry");
//        String industry = "";
//        Mentor instance = new Mentor();
//        instance.setIndustry(industry);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAreasOfExpertise method, of class Mentor.
//     */
//    public void testGetAreasOfExpertise() {
//        System.out.println("getAreasOfExpertise");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getAreasOfExpertise();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAreasOfExpertise method, of class Mentor.
//     */
//    public void testSetAreasOfExpertise() {
//        System.out.println("setAreasOfExpertise");
//        String areasOfExpertise = "";
//        Mentor instance = new Mentor();
//        instance.setAreasOfExpertise(areasOfExpertise);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBackground method, of class Mentor.
//     */
//    public void testGetBackground() {
//        System.out.println("getBackground");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getBackground();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBackground method, of class Mentor.
//     */
//    public void testSetBackground() {
//        System.out.println("setBackground");
//        String background = "";
//        Mentor instance = new Mentor();
//        instance.setBackground(background);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWebsite method, of class Mentor.
//     */
//    public void testGetWebsite() {
//        System.out.println("getWebsite");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getWebsite();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setWebsite method, of class Mentor.
//     */
//    public void testSetWebsite() {
//        System.out.println("setWebsite");
//        String website = "";
//        Mentor instance = new Mentor();
//        instance.setWebsite(website);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFacebook method, of class Mentor.
//     */
//    public void testGetFacebook() {
//        System.out.println("getFacebook");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getFacebook();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFacebook method, of class Mentor.
//     */
//    public void testSetFacebook() {
//        System.out.println("setFacebook");
//        String facebook = "";
//        Mentor instance = new Mentor();
//        instance.setFacebook(facebook);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTwitter method, of class Mentor.
//     */
//    public void testGetTwitter() {
//        System.out.println("getTwitter");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getTwitter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTwitter method, of class Mentor.
//     */
//    public void testSetTwitter() {
//        System.out.println("setTwitter");
//        String twitter = "";
//        Mentor instance = new Mentor();
//        instance.setTwitter(twitter);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOtherSocialMedia method, of class Mentor.
//     */
//    public void testGetOtherSocialMedia() {
//        System.out.println("getOtherSocialMedia");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getOtherSocialMedia();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOtherSocialMedia method, of class Mentor.
//     */
//    public void testSetOtherSocialMedia() {
//        System.out.println("setOtherSocialMedia");
//        String otherSocialMedia = "";
//        Mentor instance = new Mentor();
//        instance.setOtherSocialMedia(otherSocialMedia);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInId method, of class Mentor.
//     */
//    public void testGetLinkedInId() {
//        System.out.println("getLinkedInId");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getLinkedInId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInId method, of class Mentor.
//     */
//    public void testSetLinkedInId() {
//        System.out.println("setLinkedInId");
//        String linkedInId = "";
//        Mentor instance = new Mentor();
//        instance.setLinkedInId(linkedInId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInPictureURL method, of class Mentor.
//     */
//    public void testGetLinkedInPictureURL() {
//        System.out.println("getLinkedInPictureURL");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getLinkedInPictureURL();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInPictureURL method, of class Mentor.
//     */
//    public void testSetLinkedInPictureURL() {
//        System.out.println("setLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        Mentor instance = new Mentor();
//        instance.setLinkedInPictureURL(linkedInPictureURL);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInCurrentCompany method, of class Mentor.
//     */
//    public void testGetLinkedInCurrentCompany() {
//        System.out.println("getLinkedInCurrentCompany");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getLinkedInCurrentCompany();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInCurrentCompany method, of class Mentor.
//     */
//    public void testSetLinkedInCurrentCompany() {
//        System.out.println("setLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        Mentor instance = new Mentor();
//        instance.setLinkedInCurrentCompany(linkedInCurrentCompany);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInCurrentJobTitle method, of class Mentor.
//     */
//    public void testGetLinkedInCurrentJobTitle() {
//        System.out.println("getLinkedInCurrentJobTitle");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.getLinkedInCurrentJobTitle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInCurrentJobTitle method, of class Mentor.
//     */
//    public void testSetLinkedInCurrentJobTitle() {
//        System.out.println("setLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        Mentor instance = new Mentor();
//        instance.setLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hashCode method, of class Mentor.
//     */
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Mentor instance = new Mentor();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Mentor.
//     */
//    public void testEquals() {
//        System.out.println("equals");
//        Object object = null;
//        Mentor instance = new Mentor();
//        boolean expResult = false;
//        boolean result = instance.equals(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Mentor.
//     */
//    public void testToString() {
//        System.out.println("toString");
//        Mentor instance = new Mentor();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMmuser method, of class Mentor.
//     */
//    public void testGetMmuser() {
//        System.out.println("getMmuser");
//        Mentor instance = new Mentor();
//        Mmuser expResult = null;
//        Mmuser result = instance.getMmuser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMmuser method, of class Mentor.
//     */
//    public void testSetMmuser() {
//        System.out.println("setMmuser");
//        Mmuser Mmuser = null;
//        Mentor instance = new Mentor();
//        instance.setMmuser(Mmuser);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
