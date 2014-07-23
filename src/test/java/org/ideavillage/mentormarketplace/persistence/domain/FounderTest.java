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
public class FounderTest extends TestCase {
    
//    public FounderTest(String testName) {
//        super(testName);
//    }
//
//    public static Test suite() {
//        TestSuite suite = new TestSuite(FounderTest.class);
//        return suite;
//    }
//    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    /**
//     * Test of getId method, of class Founder.
//     */
//    public void testGetId() {
//        System.out.println("getId");
//        Founder instance = new Founder();
//        Long expResult = null;
//        Long result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setId method, of class Founder.
//     */
//    public void testSetId() {
//        System.out.println("setId");
//        Long id = null;
//        Founder instance = new Founder();
//        instance.setId(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFirstName method, of class Founder.
//     */
//    public void testGetFirstName() {
//        System.out.println("getFirstName");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getFirstName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFirstName method, of class Founder.
//     */
//    public void testSetFirstName() {
//        System.out.println("setFirstName");
//        String firstName = "";
//        Founder instance = new Founder();
//        instance.setFirstName(firstName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLastName method, of class Founder.
//     */
//    public void testGetLastName() {
//        System.out.println("getLastName");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getLastName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLastName method, of class Founder.
//     */
//    public void testSetLastName() {
//        System.out.println("setLastName");
//        String lastName = "";
//        Founder instance = new Founder();
//        instance.setLastName(lastName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIndustry method, of class Founder.
//     */
//    public void testGetIndustry() {
//        System.out.println("getIndustry");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getIndustry();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIndustry method, of class Founder.
//     */
//    public void testSetIndustry() {
//        System.out.println("setIndustry");
//        String industry = "";
//        Founder instance = new Founder();
//        instance.setIndustry(industry);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAreasOfExpertise method, of class Founder.
//     */
//    public void testGetAreasOfExpertise() {
//        System.out.println("getAreasOfExpertise");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getAreasOfExpertise();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAreasOfExpertise method, of class Founder.
//     */
//    public void testSetAreasOfExpertise() {
//        System.out.println("setAreasOfExpertise");
//        String areasOfExpertise = "";
//        Founder instance = new Founder();
//        instance.setAreasOfExpertise(areasOfExpertise);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBackground method, of class Founder.
//     */
//    public void testGetBackground() {
//        System.out.println("getBackground");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getBackground();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBackground method, of class Founder.
//     */
//    public void testSetBackground() {
//        System.out.println("setBackground");
//        String background = "";
//        Founder instance = new Founder();
//        instance.setBackground(background);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWebsite method, of class Founder.
//     */
//    public void testGetWebsite() {
//        System.out.println("getWebsite");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getWebsite();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setWebsite method, of class Founder.
//     */
//    public void testSetWebsite() {
//        System.out.println("setWebsite");
//        String website = "";
//        Founder instance = new Founder();
//        instance.setWebsite(website);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFacebook method, of class Founder.
//     */
//    public void testGetFacebook() {
//        System.out.println("getFacebook");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getFacebook();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFacebook method, of class Founder.
//     */
//    public void testSetFacebook() {
//        System.out.println("setFacebook");
//        String facebook = "";
//        Founder instance = new Founder();
//        instance.setFacebook(facebook);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTwitter method, of class Founder.
//     */
//    public void testGetTwitter() {
//        System.out.println("getTwitter");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getTwitter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTwitter method, of class Founder.
//     */
//    public void testSetTwitter() {
//        System.out.println("setTwitter");
//        String twitter = "";
//        Founder instance = new Founder();
//        instance.setTwitter(twitter);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOtherSocialMedia method, of class Founder.
//     */
//    public void testGetOtherSocialMedia() {
//        System.out.println("getOtherSocialMedia");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getOtherSocialMedia();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setOtherSocialMedia method, of class Founder.
//     */
//    public void testSetOtherSocialMedia() {
//        System.out.println("setOtherSocialMedia");
//        String otherSocialMedia = "";
//        Founder instance = new Founder();
//        instance.setOtherSocialMedia(otherSocialMedia);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInId method, of class Founder.
//     */
//    public void testGetLinkedInId() {
//        System.out.println("getLinkedInId");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getLinkedInId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInId method, of class Founder.
//     */
//    public void testSetLinkedInId() {
//        System.out.println("setLinkedInId");
//        String linkedInId = "";
//        Founder instance = new Founder();
//        instance.setLinkedInId(linkedInId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInPictureURL method, of class Founder.
//     */
//    public void testGetLinkedInPictureURL() {
//        System.out.println("getLinkedInPictureURL");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getLinkedInPictureURL();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInPictureURL method, of class Founder.
//     */
//    public void testSetLinkedInPictureURL() {
//        System.out.println("setLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        Founder instance = new Founder();
//        instance.setLinkedInPictureURL(linkedInPictureURL);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInCurrentCompany method, of class Founder.
//     */
//    public void testGetLinkedInCurrentCompany() {
//        System.out.println("getLinkedInCurrentCompany");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getLinkedInCurrentCompany();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInCurrentCompany method, of class Founder.
//     */
//    public void testSetLinkedInCurrentCompany() {
//        System.out.println("setLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        Founder instance = new Founder();
//        instance.setLinkedInCurrentCompany(linkedInCurrentCompany);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLinkedInCurrentJobTitle method, of class Founder.
//     */
//    public void testGetLinkedInCurrentJobTitle() {
//        System.out.println("getLinkedInCurrentJobTitle");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.getLinkedInCurrentJobTitle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLinkedInCurrentJobTitle method, of class Founder.
//     */
//    public void testSetLinkedInCurrentJobTitle() {
//        System.out.println("setLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        Founder instance = new Founder();
//        instance.setLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hashCode method, of class Founder.
//     */
//    public void testHashCode() {
//        System.out.println("hashCode");
//        Founder instance = new Founder();
//        int expResult = 0;
//        int result = instance.hashCode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Founder.
//     */
//    public void testEquals() {
//        System.out.println("equals");
//        Object object = null;
//        Founder instance = new Founder();
//        boolean expResult = false;
//        boolean result = instance.equals(object);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Founder.
//     */
//    public void testToString() {
//        System.out.println("toString");
//        Founder instance = new Founder();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
