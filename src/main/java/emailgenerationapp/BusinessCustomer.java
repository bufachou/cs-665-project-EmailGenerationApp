/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: BusinessCustomer.java
 * Description: This class represents Business customers.
 * Used to generate customized emails for business customers
 */
package emailgenerationapp;

public class BusinessCustomer extends Customer {
    public BusinessCustomer(String name, EmailTemplate emailTemplate) {
        super(name, emailTemplate);
    }

    @Override
    public String generateEmail() {
        String email = emailTemplate.getTemplate();
        return email.replace("[CUSTOMER_TYPE]", "Business Customer " + name)
                .replace("[MESSAGE]", "Message for Business Customer");
    }
}

