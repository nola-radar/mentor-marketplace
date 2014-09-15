/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.repositories;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;

/**
 *
 * @author 212412062
 */
public class MmuserRepositoryTest extends TestCase {
    
    public MmuserRepositoryTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MmuserRepositoryTest.class);
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
//     * Test of findByEmail method, of class MmuserRepository.
//     */
//    public void testFindByEmail() {
//        System.out.println("findByEmail");
//        String email = "";
//        MmuserRepository instance = new MmuserRepositoryImpl();
//        Mmuser expResult = null;
//        Mmuser result = instance.findByEmail(email);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByEmail method, of class MmuserRepository.
//     */
//    public void testCountByEmail() {
//        System.out.println("countByEmail");
//        String email = "";
//        MmuserRepository instance = new MmuserRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByEmail(email);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByLinkedInId method, of class MmuserRepository.
//     */
//    public void testFindByLinkedInId() {
//        System.out.println("findByLinkedInId");
//        String linkedInId = "";
//        MmuserRepository instance = new MmuserRepositoryImpl();
//        Mmuser expResult = null;
//        Mmuser result = instance.findByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countByLinkedInId method, of class MmuserRepository.
//     */
//    public void testCountByLinkedInId() {
//        System.out.println("countByLinkedInId");
//        String linkedInId = "";
//        MmuserRepository instance = new MmuserRepositoryImpl();
//        long expResult = 0L;
//        long result = instance.countByLinkedInId(linkedInId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class MmuserRepositoryImpl implements MmuserRepository {
//
//        public Mmuser findByEmail(String email) {
//            return null;
//        }
//
//        public long countByEmail(String email) {
//            return 0L;
//        }
//
//        public Mmuser findByLinkedInId(String linkedInId) {
//            return null;
//        }
//
//        public long countByLinkedInId(String linkedInId) {
//            return 0L;
//        }
//    }
//    
}
