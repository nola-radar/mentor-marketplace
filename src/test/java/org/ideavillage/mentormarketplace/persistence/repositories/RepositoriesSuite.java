package org.ideavillage.mentormarketplace.persistence.repositories;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author 212412062
 */
public class RepositoriesSuite extends TestCase {
    
    public RepositoriesSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("RepositoriesSuite");
        suite.addTest(MmuserRepositoryTest.suite());
//        suite.addTest(FounderRepositoryTest.suite());
        suite.addTest(MentorRepositoryTest.suite());
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
    
}
