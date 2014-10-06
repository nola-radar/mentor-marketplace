package org.ideavillage.mentormarketplace.core.services;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author 212412062
 */
public class ServicesSuite extends TestCase {
    
    public ServicesSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ServicesSuite");
        suite.addTest(RepositoryUserDetailsServiceTest.suite());
        suite.addTest(SimpleSocialUserDetailsServiceTest.suite());
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
