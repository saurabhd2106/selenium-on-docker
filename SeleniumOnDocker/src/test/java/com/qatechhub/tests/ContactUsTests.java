package com.qatechhub.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qatechhub.pages.ContactDetails;

public class ContactUsTests extends BaseTests {

	@Test
	public void verifyContactUsForm() throws Exception {
		
		System.out.println(System.getProperty("os.name"));

		ContactDetails contactDetails = new ContactDetails();

		contactDetails.setFirstName("Saurabh");
		contactDetails.setLastName("Dhingra");
		contactDetails.setPhoneNumber("324723984");
		contactDetails.setEmailId("test@qatechhub.com");
		contactDetails.setGender("male");
		contactDetails.setCourseInterestedIn("Selenium");

		contactUsPage.fillupContactForm(contactDetails);

		String expectedMessage = "You have successfully filled in the form!";

		String actualMessage = contactUsPage.getSuccessMessage();

		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
