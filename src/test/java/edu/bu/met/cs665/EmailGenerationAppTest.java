package edu.bu.met.cs665;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import emailgenerationapp.BusinessCustomer;
import emailgenerationapp.Customer;
import emailgenerationapp.EmailTemplate;
import emailgenerationapp.FrequentCustomer;
import emailgenerationapp.NewCustomer;
import emailgenerationapp.ReturningCustomer;
import emailgenerationapp.VIPCustomer;

;



public class EmailGenerationAppTest {
    private EmailTemplate emailTemplate;

    @Before
    public void setUp() {
        emailTemplate = new EmailTemplate();
    }

    @Test
    public void testBusinessCustomerEmail() {
        Customer businessCustomer = new BusinessCustomer("John", emailTemplate);
        String email = businessCustomer.generateEmail();
        assertTrue(email.contains("Business Customer John"));
        assertTrue(email.contains("Message for Business Customer"));
    }

    @Test
    public void testReturningCustomerEmail() {
        Customer returningCustomer = new ReturningCustomer("Jane", emailTemplate);
        String email = returningCustomer.generateEmail();
        assertTrue(email.contains("Returning Customer Jane"));
        assertTrue(email.contains("Thank you for your continued trust in our company."));
    }

    @Test
    public void testFrequentCustomerEmail() {
        Customer frequentCustomer = new FrequentCustomer("Tom", emailTemplate);
        String email = frequentCustomer.generateEmail();
        assertTrue(email.contains("Frequent Customer Tom"));
        assertTrue(email.contains("We appreciate your frequent visits. Here's a special Coupon just for you."));
    }

    @Test
    public void testNewCustomerEmail() {
        Customer newCustomer = new NewCustomer("Alice", emailTemplate);
        String email = newCustomer.generateEmail();
        assertTrue(email.contains("New Customer Alice"));
        assertTrue(email.contains("Welcome to our company! We hope you enjoy our services."));
    }

    @Test
    public void testVIPCustomerEmail() {
        Customer vipCustomer = new VIPCustomer("Bob", emailTemplate);
        String email = vipCustomer.generateEmail();
        assertTrue(email.contains("VIP Customer Bob"));
        assertTrue(email.contains("We appreciate your trust. Here's an exclusive gift for you."));
    }
}

