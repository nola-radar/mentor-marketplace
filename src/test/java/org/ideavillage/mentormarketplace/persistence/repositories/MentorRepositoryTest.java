/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author 212412062
 */
public class MentorRepositoryTest extends TestCase {
//    
//    public MentorRepositoryTest(String testName) {
//        super(testName);
//    }
//
//    public static Test suite() {
//        TestSuite suite = new TestSuite(MentorRepositoryTest.class);
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
//     * Test of countByFirstName method, of class MentorRepository.
//     */
//    public void testCountByFirstName() {
//        System.out.println("countByFirstName");
//        String firstName = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByFirstName(firstName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLastName method, of class MentorRepository.
//     */
//    public void testCountByLastName() {
//        System.out.println("countByLastName");
//        String lastName = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLastName(lastName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByIndustry method, of class MentorRepository.
//     */
//    public void testCountByIndustry() {
//        System.out.println("countByIndustry");
//        String industry = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByIndustry(industry);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByAreasOfExpertise method, of class MentorRepository.
//     */
//    public void testCountByAreasOfExpertise() {
//        System.out.println("countByAreasOfExpertise");
//        String areasOfExpertise = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByAreasOfExpertise(areasOfExpertise);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByBackground method, of class MentorRepository.
//     */
//    public void testCountByBackground() {
//        System.out.println("countByBackground");
//        String background = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByBackground(background);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByWebsite method, of class MentorRepository.
//     */
//    public void testCountByWebsite() {
//        System.out.println("countByWebsite");
//        String website = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByWebsite(website);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByFacebook method, of class MentorRepository.
//     */
//    public void testCountByFacebook() {
//        System.out.println("countByFacebook");
//        String facebook = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByFacebook(facebook);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByTwitter method, of class MentorRepository.
//     */
//    public void testCountByTwitter() {
//        System.out.println("countByTwitter");
//        String twitter = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByTwitter(twitter);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByOtherSocialMedia method, of class MentorRepository.
//     */
//    public void testCountByOtherSocialMedia() {
//        System.out.println("countByOtherSocialMedia");
//        String otherSocialMedia = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByOtherSocialMedia(otherSocialMedia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInId method, of class MentorRepository.
//     */
//    public void testCountByLinkedInId() {
//        System.out.println("countByLinkedInId");
//        String linkedInId = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInPictureURL method, of class MentorRepository.
//     */
//    public void testCountByLinkedInPictureURL() {
//        System.out.println("countByLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInPictureURL(linkedInPictureURL);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInCurrentCompany method, of class MentorRepository.
//     */
//    public void testCountByLinkedInCurrentCompany() {
//        System.out.println("countByLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInCurrentCompany(linkedInCurrentCompany);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInCurrentJobTitle method, of class MentorRepository.
//     */
//    public void testCountByLinkedInCurrentJobTitle() {
//        System.out.println("countByLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByFirstName method, of class MentorRepository.
//     */
//    public void testFindByFirstName() {
//        System.out.println("findByFirstName");
//        String firstName = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByFirstName(firstName, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLastName method, of class MentorRepository.
//     */
//    public void testFindByLastName() {
//        System.out.println("findByLastName");
//        String lastName = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByLastName(lastName, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByIndustry method, of class MentorRepository.
//     */
//    public void testFindByIndustry() {
//        System.out.println("findByIndustry");
//        String industry = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByIndustry(industry, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByAreasOfExpertise method, of class MentorRepository.
//     */
//    public void testFindByAreasOfExpertise() {
//        System.out.println("findByAreasOfExpertise");
//        String areasOfExpertise = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByAreasOfExpertise(areasOfExpertise, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByBackground method, of class MentorRepository.
//     */
//    public void testFindByBackground() {
//        System.out.println("findByBackground");
//        String background = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByBackground(background, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByWebsite method, of class MentorRepository.
//     */
//    public void testFindByWebsite() {
//        System.out.println("findByWebsite");
//        String website = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByWebsite(website, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByFacebook method, of class MentorRepository.
//     */
//    public void testFindByFacebook() {
//        System.out.println("findByFacebook");
//        String facebook = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByFacebook(facebook, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByTwitter method, of class MentorRepository.
//     */
//    public void testFindByTwitter() {
//        System.out.println("findByTwitter");
//        String twitter = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByTwitter(twitter, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByOtherSocialMedia method, of class MentorRepository.
//     */
//    public void testFindByOtherSocialMedia() {
//        System.out.println("findByOtherSocialMedia");
//        String otherSocialMedia = "";
//        Pageable pageable = null;
//        MentorRepository instance = new MentorRepositoryImpl();
//        Page<Mentor> expResult = null;
//        Page<Mentor> result = instance.findByOtherSocialMedia(otherSocialMedia, pageable);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInId method, of class MentorRepository.
//     */
//    public void testFindByLinkedInId() {
//        System.out.println("findByLinkedInId");
//        String linkedInId = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        Mentor expResult = null;
//        Mentor result = instance.findByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInPictureURL method, of class MentorRepository.
//     */
//    public void testFindByLinkedInPictureURL() {
//        System.out.println("findByLinkedInPictureURL");
//        String linkedInPictureURL = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        Mentor expResult = null;
//        Mentor result = instance.findByLinkedInPictureURL(linkedInPictureURL);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInCurrentCompany method, of class MentorRepository.
//     */
//    public void testFindByLinkedInCurrentCompany() {
//        System.out.println("findByLinkedInCurrentCompany");
//        String linkedInCurrentCompany = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        Mentor expResult = null;
//        Mentor result = instance.findByLinkedInCurrentCompany(linkedInCurrentCompany);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInCurrentJobTitle method, of class MentorRepository.
//     */
//    public void testFindByLinkedInCurrentJobTitle() {
//        System.out.println("findByLinkedInCurrentJobTitle");
//        String linkedInCurrentJobTitle = "";
//        MentorRepository instance = new MentorRepositoryImpl();
//        Mentor expResult = null;
//        Mentor result = instance.findByLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class MentorRepositoryImpl implements MentorRepository {
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
//        public Page<Mentor> findByFirstName(String firstName, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByLastName(String lastName, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByIndustry(String industry, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByAreasOfExpertise(String areasOfExpertise, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByBackground(String background, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByWebsite(String website, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByFacebook(String facebook, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByTwitter(String twitter, Pageable pageable) {
//            return null;
//        }
//
//        public Page<Mentor> findByOtherSocialMedia(String otherSocialMedia, Pageable pageable) {
//            return null;
//        }
//
//        public Mentor findByLinkedInId(String linkedInId) {
//            return null;
//        }
//
//        public Mentor findByLinkedInPictureURL(String linkedInPictureURL) {
//            return null;
//        }
//
//        public Mentor findByLinkedInCurrentCompany(String linkedInCurrentCompany) {
//            return null;
//        }
//
//        public Mentor findByLinkedInCurrentJobTitle(String linkedInCurrentJobTitle) {
//            return null;
//        }
//    }
//    
}
