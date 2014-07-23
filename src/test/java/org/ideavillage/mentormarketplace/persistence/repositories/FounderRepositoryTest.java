/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author 212412062
 */
public class FounderRepositoryTest extends TestCase {
    
//    public FounderRepositoryTest(String testName) {
//        super(testName);
//    }
//
//    public static Test suite() {
//        TestSuite suite = new TestSuite(FounderRepositoryTest.class);
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
//     * Test of countByFirstName method, of class FounderRepository.
//     */
//    public void testCountByFirstName() {
//        System.out.println("countByFirstName");
//        String firstName = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByFirstName(firstName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLastName method, of class FounderRepository.
//     */
//    public void testCountByLastName() {
//        System.out.println("countByLastName");
//        String lastName = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLastName(lastName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByIndustry method, of class FounderRepository.
//     */
//    public void testCountByIndustry() {
//        System.out.println("countByIndustry");
//        String industry = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByIndustry(industry);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByAreasOfExpertise method, of class FounderRepository.
//     */
//    public void testCountByAreasOfExpertise() {
//        System.out.println("countByAreasOfExpertise");
//        String areasOfExpertise = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByAreasOfExpertise(areasOfExpertise);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByBackground method, of class FounderRepository.
//     */
//    public void testCountByBackground() {
//        System.out.println("countByBackground");
//        String background = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByBackground(background);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByWebsite method, of class FounderRepository.
//     */
//    public void testCountByWebsite() {
//        System.out.println("countByWebsite");
//        String website = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByWebsite(website);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByFacebook method, of class FounderRepository.
//     */
//    public void testCountByFacebook() {
//        System.out.println("countByFacebook");
//        String facebook = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByFacebook(facebook);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByTwitter method, of class FounderRepository.
//     */
//    public void testCountByTwitter() {
//        System.out.println("countByTwitter");
//        String twitter = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByTwitter(twitter);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByOtherSocialMedia method, of class FounderRepository.
//     */
//    public void testCountByOtherSocialMedia() {
//        System.out.println("countByOtherSocialMedia");
//        String otherSocialMedia = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByOtherSocialMedia(otherSocialMedia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInId method, of class FounderRepository.
//     */
//    public void testCountByLinkedInId() {
//        System.out.println("countByLinkedInId");
//        String linkedInId = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInPictureURL method, of class FounderRepository.
//     */
//    public void testCountByLinkedInPictureURL() {
//        System.out.println("countByLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInPictureURL(linkedInPictureURL);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInCurrentCompany method, of class FounderRepository.
//     */
//    public void testCountByLinkedInCurrentCompany() {
//        System.out.println("countByLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInCurrentCompany(linkedInCurrentCompany);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInCurrentJobTitle method, of class FounderRepository.
//     */
//    public void testCountByLinkedInCurrentJobTitle() {
//        System.out.println("countByLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByFirstName method, of class FounderRepository.
//     */
//    public void testFindByFirstName() {
//        System.out.println("findByFirstName");
//        String firstName = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByFirstName(firstName, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLastName method, of class FounderRepository.
//     */
//    public void testFindByLastName() {
//        System.out.println("findByLastName");
//        String lastName = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByLastName(lastName, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByIndustry method, of class FounderRepository.
//     */
//    public void testFindByIndustry() {
//        System.out.println("findByIndustry");
//        String industry = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByIndustry(industry, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByAreasOfExpertise method, of class FounderRepository.
//     */
//    public void testFindByAreasOfExpertise() {
//        System.out.println("findByAreasOfExpertise");
//        String areasOfExpertise = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByAreasOfExpertise(areasOfExpertise, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByBackground method, of class FounderRepository.
//     */
//    public void testFindByBackground() {
//        System.out.println("findByBackground");
//        String background = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByBackground(background, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByWebsite method, of class FounderRepository.
//     */
//    public void testFindByWebsite() {
//        System.out.println("findByWebsite");
//        String website = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByWebsite(website, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByFacebook method, of class FounderRepository.
//     */
//    public void testFindByFacebook() {
//        System.out.println("findByFacebook");
//        String facebook = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByFacebook(facebook, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByTwitter method, of class FounderRepository.
//     */
//    public void testFindByTwitter() {
//        System.out.println("findByTwitter");
//        String twitter = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByTwitter(twitter, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByOtherSocialMedia method, of class FounderRepository.
//     */
//    public void testFindByOtherSocialMedia() {
//        System.out.println("findByOtherSocialMedia");
//        String otherSocialMedia = "";
//        Pageable pageable = null;
//        FounderRepository instance = new FounderRepositoryImpl();
//        Page<Founder> expResult = null;
//        Page<Founder> result = instance.findByOtherSocialMedia(otherSocialMedia, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInId method, of class FounderRepository.
//     */
//    public void testFindByLinkedInId() {
//        System.out.println("findByLinkedInId");
//        String linkedInId = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        Founder expResult = null;
//        Founder result = instance.findByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInPictureURL method, of class FounderRepository.
//     */
//    public void testFindByLinkedInPictureURL() {
//        System.out.println("findByLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        Founder expResult = null;
//        Founder result = instance.findByLinkedInPictureURL(linkedInPictureURL);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInCurrentCompany method, of class FounderRepository.
//     */
//    public void testFindByLinkedInCurrentCompany() {
//        System.out.println("findByLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        Founder expResult = null;
//        Founder result = instance.findByLinkedInCurrentCompany(linkedInCurrentCompany);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInCurrentJobTitle method, of class FounderRepository.
//     */
//    public void testFindByLinkedInCurrentJobTitle() {
//        System.out.println("findByLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        FounderRepository instance = new FounderRepositoryImpl();
//        Founder expResult = null;
//        Founder result = instance.findByLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class FounderRepositoryImpl implements FounderRepository {
//
//        public long countByFirstName(String firstName) {
//            return 0L;
//        }
//
//        public long countByLastName(String lastName) {
//            return 0L;
//        }
//
//        public long countByIndustry(String industry) {
//            return 0L;
//        }
//
//        public long countByAreasOfExpertise(String areasOfExpertise) {
//            return 0L;
//        }
//
//        public long countByBackground(String background) {
//            return 0L;
//        }
//
//        public long countByWebsite(String website) {
//            return 0L;
//        }
//
//        public long countByFacebook(String facebook) {
//            return 0L;
//        }
//
//        public long countByTwitter(String twitter) {
//            return 0L;
//        }
//
//        public long countByOtherSocialMedia(String otherSocialMedia) {
//            return 0L;
//        }
//
//        public long countByLinkedInId(String linkedInId) {
//            return 0L;
//        }
//
//        public long countByLinkedInPictureURL(String linkedInPictureURL) {
//            return 0L;
//        }
//
//        public long countByLinkedInCurrentCompany(String linkedInCurrentCompany) {
//            return 0L;
//        }
//
//        public long countByLinkedInCurrentJobTitle(String linkedInCurrentJobTitle) {
//            return 0L;
//        }
//
//        public Page<Founder> findByFirstName(String firstName, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByLastName(String lastName, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByIndustry(String industry, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByAreasOfExpertise(String areasOfExpertise, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByBackground(String background, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByWebsite(String website, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByFacebook(String facebook, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByTwitter(String twitter, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Founder> findByOtherSocialMedia(String otherSocialMedia, Pageable pageable) {
//            return null;
//        }
//
//        public Founder findByLinkedInId(String linkedInId) {
//            return null;
//        }
//
//        public Founder findByLinkedInPictureURL(String linkedInPictureURL) {
//            return null;
//        }
//
//        public Founder findByLinkedInCurrentCompany(String linkedInCurrentCompany) {
//            return null;
//        }
//
//        public Founder findByLinkedInCurrentJobTitle(String linkedInCurrentJobTitle) {
//            return null;
//        }
//    }
//    
}
