/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.web.controllers;

import junit.framework.TestCase;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.web.forms.RegistrationForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212412062
 */
public class UserControllerTest extends TestCase {
        
    public UserControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of signupForm method, of class UserController.
     */
//    public void testSignupForm() {
//        System.out.println("signupForm");
//        WebRequest request = null;
//        RegistrationForm registrationForm = null;
//        Mentor mentor = new Mentor();
//        Founder founder = new Founder();
//        UserController instance = new UserController();
//        String expResult = "mentors/create";
//        String result = instance.signupForm(request, registrationForm, mentor, founder);
//        assertEquals(expResult, result);
//        }

//    /**
//     * Test of processForm method, of class UserController.
//     */
//    public void testProcessForm() {
//        System.out.println("processForm");
//        WebRequest request = null;
//        RegistrationForm registrationForm = null;
//        Mentor mentor = new Mentor();
//        BindingResult result_2 = null;
//        UserController instance = new UserController();
//        String expResult = "redirect:/user/profile";
//        String result = instance.processForm(request, registrationForm, mentor, result_2);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of viewProfile method, of class UserController.
//     */
//    public void testViewProfile() {
//        System.out.println("viewProfile");
//        WebRequest request = null;
//        Model model = null;
//        UserController instance = new UserController();
//        String expResult = "user/profile";
//        String result = instance.viewProfile(request, model);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of viewProfileForId method, of class UserController.
//     */
//    public void testViewProfileForId() {
//        System.out.println("viewProfileForId");
//        WebRequest request = null;
//        Model model = null;
//        Long id = null;
//        UserController instance = new UserController();
//        String expResult = "";
//        String result = instance.viewProfileForId(request, model, id);
//        assertEquals(expResult, result);
//    }
        
}
