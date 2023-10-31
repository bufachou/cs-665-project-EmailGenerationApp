/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: NewCustomer.java
 * Description: This Class generates messages for new customers
 * about welcome or acknowledgement.
 *
 */

package emailgenerationapp;

public class NewCustomer extends Customer {
    public NewCustomer(String name, EmailTemplate emailTemplate) {
        super(name, emailTemplate);
    }

    @Override
    public String generateEmail() {
        String email = emailTemplate.getTemplate();
        return email.replace("[CUSTOMER_TYPE]", "New Customer " + name)
                .replace("[MESSAGE]", "Welcome to our company! We hope you enjoy our services.");
    }
}

