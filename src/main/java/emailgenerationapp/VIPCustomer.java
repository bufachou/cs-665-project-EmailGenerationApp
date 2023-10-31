/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: VIPCustomer.java
 * Description: This Class generates messages for VIP customers.
 *
 *
 */

package emailgenerationapp;

public class VIPCustomer extends Customer {
    public VIPCustomer(String name, EmailTemplate emailTemplate) {
        super(name, emailTemplate);
    }

    @Override
    public String generateEmail() {
        String email = emailTemplate.getTemplate();
        return email.replace("[CUSTOMER_TYPE]", "VIP Customer " + name)
                .replace("[MESSAGE]", "We appreciate your trust. Here's an exclusive gift for you.");
    }
}

