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
import static org.mockito.Mockito.mock;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.WebRequest;
import org.testng.annotations.Test;

/**
 *
 * @author 212412051
 */
@Test
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
    public void testSignupForm() {
        System.out.println("signupForm");
        WebRequest request = mock(WebRequest.class);
        RegistrationForm registrationForm = mock(RegistrationForm.class);
        Mentor mentor = new Mentor();
        Founder founder = new Founder();
        UserController instance = new UserController();
        String expResult = "register/create";
        String result = instance.signupForm(request, registrationForm, mentor, founder);
        assertEquals(expResult, result);
    }

    /**
     * Test of processForm method, of class UserController.
     */
//    public void testProcessForm() {
//        System.out.println("processForm");
//        WebRequest request = mock(WebRequest.class);
//        RegistrationForm registrationForm = mock(RegistrationForm.class);
//        BindingResult result_2 = mock(BindingResult.class);
//        UserController instance = new UserController();
//        String expResult = "";
//        String result = instance.processForm(request, registrationForm, result_2);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of viewProfile method, of class UserController.
     */
    public void testViewProfile() {
        System.out.println("viewProfile");
        WebRequest request = mock(WebRequest.class);
        Model model = mock(Model.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.viewProfile(request, model);
        assertEquals(expResult, result);
    }

    /**
     * Test of viewProfileForId method, of class UserController.
     */
//    public void testViewProfileForId() {
//        System.out.println("viewProfileForId");
//        WebRequest request = mock(WebRequest.class);
//        Model model = mock(Model.class);
//        Long id = null;
//        UserController instance = mock(UserController.class);
//        String expResult = null;
//        String result = instance.viewProfileForId(request, model, id);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of viewProfileFounder method, of class UserController.
     */
    public void testViewProfileFounder() {
        System.out.println("viewProfileFounder");
        WebRequest request = mock(WebRequest.class);
        Model model = mock(Model.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.viewProfileFounder(request, model);
        assertEquals(expResult, result);
    }

    /**
     * Test of viewEditFounder method, of class UserController.
     */
    public void testViewEditFounder() {
        System.out.println("viewEditFounder");
        WebRequest request = mock(WebRequest.class);
        RegistrationForm registrationForm = mock(RegistrationForm.class);
        Model model = mock(Model.class);
        BindingResult result_2 = mock(BindingResult.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.viewEditFounder(request, registrationForm, model, result_2);
        assertEquals(expResult, result);
    }

    /**
     * Test of processFounderEdit method, of class UserController.
     */
    public void testProcessFounderEdit() {
        System.out.println("processFounderEdit");
        WebRequest request = mock(WebRequest.class);
        Model model = mock(Model.class);
        RegistrationForm registrationForm = mock(RegistrationForm.class);
        BindingResult result_2 = mock(BindingResult.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.processFounderEdit(request, model, registrationForm, result_2);
        assertEquals(expResult, result);
    }

    /**
     * Test of viewProfileMentor method, of class UserController.
     */
    public void testViewProfileMentor() {
        System.out.println("viewProfileMentor");
        WebRequest request = mock(WebRequest.class);
        Model model = mock(Model.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.viewProfileMentor(request, model);
        assertEquals(expResult, result);
    }

    /**
     * Test of viewEditMentor method, of class UserController.
     */
    public void testViewEditMentor() {
        System.out.println("viewEditMentor");
        WebRequest request = mock(WebRequest.class);
        RegistrationForm registrationForm = mock(RegistrationForm.class);
        Model model = mock(Model.class);
        BindingResult result_2 = mock(BindingResult.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.viewEditMentor(request, registrationForm, model, result_2);
        assertEquals(expResult, result);
    }

    /**
     * Test of processMentorEdit method, of class UserController.
     */
    public void testProcessMentorEdit() {
        System.out.println("processMentorEdit");
        WebRequest request = mock(WebRequest.class);
        Model model = mock(Model.class);
        RegistrationForm registrationForm = mock(RegistrationForm.class);
        BindingResult result_2 = mock(BindingResult.class);
        UserController instance = mock(UserController.class);
        String expResult = null;
        String result = instance.processMentorEdit(request, model, registrationForm, result_2);
        assertEquals(expResult, result);
    }
    
}
