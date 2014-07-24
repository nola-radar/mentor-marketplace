/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ideavillage.mentormarketplace.web.controllers;

import junit.framework.TestCase;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 212412062
 */
public class MentorControllerTest extends TestCase {

//    public MentorControllerTest(String testName) {
//        super(testName);
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
//     * Test of redirect method, of class MentorController.
//     */
//    public void testRedirect() {
//        System.out.println("redirect");
//        MentorController instance = new MentorController();
//        String expResult = "redirect:/mentors/";
//        String result = instance.redirect();
//        assertEquals(expResult, result);
//
//    }
//
//    /**
//     * Test of view method, of class MentorController.
//     */
//    public void testView() {
//        System.out.println("view");
//        Mentor mentor = new Mentor();
//        MentorController instance = new MentorController();
//        ModelAndView expResult = new ModelAndView("mentors/view", "mentor", mentor);
//        ModelAndView result = instance.view(mentor);
//        assertEquals(expResult.getViewName(), result.getViewName());
//
//    }
//
//    /**
//     * Test of create method, of class MentorController.
//     */
//    public void testCreate() {
//        System.out.println("create");
//        MentorController instance = new MentorController();
//        ModelAndView expResult = new ModelAndView("mentors/create", "mentor", new Mentor());
//        ModelAndView result = instance.create();
//        assertEquals(expResult.getViewName(), result.getViewName());
//
//    }
//
//    /**
//     * Test of doCreate method, of class MentorController.
//     */
//    public void testDoCreate() {
//        System.out.println("doCreate");
//        long id = 1;
//        Mentor mentor = new Mentor(id);
//        BindingResult result_2 = null;
//        MentorController instance = new MentorController();
//        String expResult = "redirect:/mentors/" + mentor.getId();
//        String result = instance.doCreate(mentor, result_2);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of list method, of class MentorController.
//     */
//    public void testList() {
//        System.out.println("list");
//        MentorController instance = new MentorController();
//        ModelAndView expResult = new ModelAndView("mentors/list", "mentor", new Mentor());
//        ModelAndView result = instance.list();
//        assertEquals(expResult.getViewName(), result.getViewName());
//
//    }
//
//    /**
//     * Test of doList method, of class MentorController.
//     */
//    public void testDoList() {
//        System.out.println("doList");
//        long id = 1;
//        Mentor mentor = new Mentor(id);
//        BindingResult result_2 = null;
//        MentorController instance = new MentorController();
//        String expResult = "redirect:/mentors/" + mentor.getId();
//        String result = instance.doList(mentor, result_2);
//        assertEquals(expResult, result);
//    }
}


