/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: ReturningCustomer.java
 * Description: This Class generates messages for returning customers.
 *
 *
 */

package emailgenerationapp;

public class ReturningCustomer extends Customer {
    public ReturningCustomer(String name, EmailTemplate emailTemplate) {
        super(name, emailTemplate);
    }

    @Override
    public String generateEmail() {
        String email = emailTemplate.getTemplate();
        return email.replace("[CUSTOMER_TYPE]", "Returning Customer " + name)
                .replace("[MESSAGE]", "Thank you for your continued trust in our company.");
    }
}

